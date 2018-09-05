package com.haoxiujie.testMiaoSha;

import java.util.*;

public class Test {
    // 某商品做秒杀活动，时间有限。
    // 在规定的时间之内都可以购买参加秒杀活动的商品。
    // 购买完成之后，有是否需要配送，
    // 如果不选择配送需要自取，选择配送超出5公里需要另外添加100元配送费。
    //无论配送或者不配送都会产生秒杀活动小票。
    // 如果购买不成功则不产生该小票
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请选择是否参加秒杀活动(1代表参加，2代表不参加)：");
        bj:
        while (true) {
            if (Integer.parseInt(sc.nextLine()) != 1) {
                System.out.println("谢谢您的使用,欢迎下次光临！！！");
                return;
            }
            //判断秒杀时间
            if (!Tests.isMiaoShaTime()) {
                System.out.println("很遗憾，活动已经结束，请关注下一次活动！！！");
            }
            //购物车
            HashMap<Goods, Integer> hmGouWuChe = new HashMap<>();
            //商品分类的显示
            xianShiFenLei:
            while (true) {
                HashMap<Integer, String> hmShangpin = Tests.shangPinShow();
                System.out.println("参与秒杀活动的商品分类信息如下：");
                Set<Map.Entry<Integer, String>> entries = hmShangpin.entrySet();
                for (Map.Entry<Integer, String> entry : entries) {
                    System.out.print(entry.getKey() + "=" + entry.getValue() + "\t");
                }
                System.out.println();
                //选择商品分类
                System.out.print("请选择您要购买商品的分类：");
                int fenlei;
                try {
                    fenlei = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    fenlei = -1;
                }
                if ((!hmShangpin.containsKey(fenlei))) {
                    System.out.print("您选择的商品分类不存在，请选择是否继续参加秒杀活动(1代表参加，2代表不参加)");
                    continue bj;
                }
                //b)	商品分类存在,且该商品分类中有商品存在，将该商品分类中的所有商品显示到控制台
                HashMap<String, Goods> goods = Tests.fenLeiShow(hmShangpin.get(fenlei));
                if (goods == null) {
                    System.out.println("很遗憾，该商品已售罄，请选择是否继续参加秒杀活动(1代表参加，2代表不参加)");
                    continue bj;
                }
                //a)	选择商品名称
                while (true) {
                    Tests.mingXiPrint(goods);
                    System.out.println("请输入商品名称：");
                    String buyName = sc.nextLine();
                    //1.	如果该商品存在,继续选择购买数量。
                    //2.	如果该商品不存在，或者该商品的数量小于1个的情况下，
                    //      给出提示：是否重新选择商品
                    if ((!goods.containsKey(buyName)) || goods.get(buyName).getNum() < 1) {
                        System.out.println("您选择的商品不存在/售罄,是否重新选择商品？(Y/N)");
                        String s = sc.nextLine();
                        //3.	如果在2中选择的是y那么就继续让用户选择商品名称。
                        if (s.equals("Y") || s.equals("y")) {
                            continue;
                        } else {//4.	如果2中选择的是n，那么就提示是否继续购买该分类商品中的其他商品
                            System.out.println("是否继续购买其他分类中的商品？(Y/N)");
                            s = sc.nextLine();
                            if (s.equals("Y") || s.equals("y")) {//5.	如果4中选择的是y，那么就继续让客户选择商品分类。
                                continue xianShiFenLei;
                            } else {//6.	如果4中选择的是n那么就代表客户已经购买完成，查看购物车中是否有商品。没有商品，直接结束程序.
                                if (hmGouWuChe.size() == 0) {
                                    return;
                                } else {
                                    break xianShiFenLei;//如果有商品就继续下一步操作。
                                }
                            }
                        }
                    }
                    //b)	选择商品购物数量
                    System.out.println("当前商品的数量为：" + goods.get(buyName).getNum() + ", 请输入购买数量");
                    int buyNum = Integer.parseInt(sc.nextLine());
                    //2.	数量不能小于0
                    //3.	数量不能大于原商品中的数量
                    if (buyNum <= 0 || buyNum > goods.get(buyName).getNum()) {
                        System.out.println("您输入的商品数量错误~");
                        continue;
                    }
                    //购买成功之前，将原有商品列表中的该商品数量减少，
                    goods.get(buyName).setNum(goods.get(buyName).getNum() - buyNum);
                    //并将该商品重新写回到文件中。
                    Tests.fenLeiWriter(hmShangpin.get(fenlei), goods);
                    //d)	把购买的商品添加到购物车中
                    if (hmGouWuChe.containsKey(goods.get(buyName))) {//如果有这个商品
                        int count = hmGouWuChe.get(goods.get(buyName));
                        count += buyNum;
                        hmGouWuChe.put(goods.get(buyName), count);
                    } else {//如果没有这个商品
                        hmGouWuChe.put(goods.get(buyName), buyNum);
                    }
                    //e)	购买成功之后,提示用户是否继续购买该商品分类中的商品.
                    // 如果是继续走a流程。如果不是走a中4的流程
                    System.out.println("是否继续购买该商品分类中的商品(Y/N)");
                    String s = sc.nextLine();
                    if (s.equals("y") || s.equals("Y")) {
                    } else {
                        System.out.println("是否继续购买其他分类中的商品？(Y/N)");
                        s = sc.nextLine();
                        if (s.equals("Y") || s.equals("y")) {//5.	如果4中选择的是y，那么就继续让客户选择商品分类。
                            continue xianShiFenLei;
                        } else {//6.	如果4中选择的是n那么就代表客户已经购买完成，查看购物车中是否有商品。没有商品，直接结束程序.
                            if (hmGouWuChe.size() == 0) {
                                return;
                            } else {
                                break xianShiFenLei;//如果有商品就继续下一步操作。
                            }
                        }
                    }
                }
            }

            //显示购物车
            Tests.showGouWuChe(hmGouWuChe);

            //商品配送
            System.out.println("是否需要配送服务？(Y/N)");
            String s = sc.nextLine();
            if (s.equals("y") || s.equals("Y")) {
                Tests.peiSong(hmGouWuChe);
            } else {
                Tests.noPeiSong(hmGouWuChe);
            }
            break;
        }
    }
}
