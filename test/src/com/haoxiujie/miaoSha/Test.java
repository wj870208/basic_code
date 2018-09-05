package com.haoxiujie.miaoSha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ArrayList<Goods> alGWC = new ArrayList<>();//购物车
        begin(alGWC);
    }

    private static void begin(ArrayList<Goods> alGWC) {
        System.out.print("请选择是否参加秒杀活动(1代表参加, 2代表不参加):");
        if (!Tests.isContinue()) {//不参加就结束
            return;
        }
        //Tests.isEndtime();//设置秒杀活动的时间
        if (!Tests.isEndtime()) {//过了秒杀活动的时间
            System.out.println("很遗憾，秒杀已经结束，请关注下一次活动~");
            return;
        }
        //Fenlei();//商品分类信息
        String fenlei;
        fenlei:
        while (true) {
            fenlei = Fenlei();
            if (fenlei.equals("")) {
                System.out.print("您选择的商品分类不存在，请选择还要继续参加秒杀活动么？");
                if (!Tests.isContinue()) {
                    break;
                } else {
                    continue;
                }
            }

            //mingxi();分类明细信息
            mingxi:
            while (true) {
                ArrayList<Goods> alMX = Tests.getMingxi(fenlei);
                if (alMX == null) {
                    System.out.print("您选择的商品分类不存在或没有商品，请选择还要继续参加秒杀活动么？");
                    if (!Tests.isContinue()) {
                        break fenlei;
                    } else {
                        continue fenlei;
                    }
                }
                System.out.println("您选择的分类下，有如下商品：");
                showMX(alMX);

                //Tests.buyGoods();//购买商品
                while (true) {
                    HashMap<String, Goods> hmgoodsName = hmgoodsName(alMX);
                    System.out.print("请输入您要购买的商品：");
                    Scanner sc = new Scanner(System.in);
                    String buyName = sc.nextLine();
                    //2
                    if ((!hmgoodsName.containsKey(buyName)) || hmgoodsName.get(buyName).getNum() < 1) {//2.	如果该商品不存在，或者该商品的数量小于1个
                        System.out.print("您选择的商品不存在(售罄),是否要重新选择商品？");
                        if (Tests.isContinue()) {//3
                            continue mingxi;
                        } else {//4
                            System.out.print("是否继续购买其他分类的商品");
                            if (Tests.isContinue()) {//5
                                continue fenlei;
                            } else {//6
                                break;
                            }
                        }
                    }
                    int goodsnum = hmgoodsName.get(buyName).getNum();
                    System.out.print("您购买的商品库存数量为：" + goodsnum + "个, 请输入您要购买的数量：");
                    String s = sc.nextLine();
                    int buyNum;
                    try {
                        buyNum = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        buyNum = -1;
                    }
                    if (buyNum < 0 || buyNum > goodsnum) {
                        System.out.println("\n数量输入有误。\n");
                        continue;
                    }

                    //购买成功之前，将原有商品列表中的该商品数量减少，并将该商品重新写回到文件中。
                    hmgoodsName.get(buyName).setNum(goodsnum - buyNum);
                    Tests.writeGoods(fenlei, hmgoodsName);
                    //把购买的商品添加到购物车中
                    addGWC(alGWC, hmgoodsName.get(buyName), buyNum);
                    //e)	购买成功之后,提示用户是否继续购买该商品分类中的商品
                    System.out.println("是否购买该商品分类中的其他商品？");
                    if (Tests.isContinue()) {//如果是继续走a流程
                        continue mingxi;
                    } else {//否就走4的流程
                        System.out.print("是否继续购买其他分类的商品");
                        if (Tests.isContinue()) {//5
                            continue fenlei;
                        }
                    }

                    break;//结束购买商品
                }
                break;//结束分类明细信息
            }
            break;//结束商品分类信息
        }

        //Tests.shipping();//配送商品
        System.out.print("是否选择配送商品？");
        if (Tests.isContinue()) {
            new Person().distribution(alGWC);
        } else {
            new Person().undeserving(alGWC);
        }
    }

    private static void addGWC(ArrayList<Goods> alGWC, Goods goods, int buyNum) {//添加到购物车
        String brand = goods.getBrand();
        int num = buyNum;
        String address = goods.getAddress();
        double price = goods.getPrice();
        for (int i = 0; i < alGWC.size(); i++) {
            if (alGWC.get(i).getBrand().equals(brand)) {
                num += alGWC.get(i).getNum();
                alGWC.remove(i);
            }
        }
        alGWC.add(new Goods(brand, num, address, price));
    }


    private static String Fenlei() {
        HashMap<Integer, String> hmFL = Tests.getFenlei();
        System.out.println("参与秒杀活动商品的分类信息如下：");
        showHM(hmFL);
        System.out.print("请选择您要购买的商品分类：");
        Scanner sc = new Scanner(System.in);
        int i;
        try {
            i = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            i = -1;
        }
        if (!hmFL.containsKey(i)) {
            return "";
        }
        return hmFL.get(i);
    }

    private static void showHM(HashMap hm) {//第二个参数为样式，1为数列，2为横排
        Set set = hm.keySet();
        for (Object o : set) {
            System.out.print(o + "=" + hm.get(o) + "\t");
        }
        System.out.println();
    }

    private static void showMX(ArrayList<Goods> alMX) {//第二个参数为数量显示状态，1为明细，2为概况
        System.out.println("名称\t\t数量\t\t产地\t\t价格");
        for (Goods mx : alMX) {
            String s;
            int num = mx.getNum();
            if (num >= 5) {
                s = "充足";
            } else if (num > 2) {
                s = "有货";
            } else if (num >= 1) {
                s = "紧缺";
            } else {
                s = "售罄";
            }
            System.out.println(mx.getBrand() + "\t\t" + s + "\t\t" + mx.getAddress() + "\t\t" + mx.getPrice());
        }
    }

    private static HashMap<String, Goods> hmgoodsName(ArrayList<Goods> alMX) {//获取商品名称集合
        HashMap<String, Goods> hm = new HashMap<>();
        for (Goods mx : alMX) {
            hm.put(mx.getBrand(), mx);
        }
        return hm;
    }
}
