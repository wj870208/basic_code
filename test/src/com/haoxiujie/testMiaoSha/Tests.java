package com.haoxiujie.testMiaoSha;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tests {//逻辑工具类

    public static boolean isMiaoShaTime() {//秒杀活动时间判断
        Properties properties = new Properties();
        File file = new File("test\\src\\com\\haoxiujie\\testMiaoSha\\endtime.properties");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {
            properties.setProperty("endtime", "2018年10月1日 12:00:00");
            properties.store(bw, "endtime");
        } catch (IOException e) {
            System.out.println(e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            properties.load(br);
            String endtime = properties.getProperty("endtime");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 kk:mm:ss");
            long time = simpleDateFormat.parse(endtime).getTime();
            long nowtime = new Date().getTime();
            if (nowtime >= time) {//当前时间大于等于秒杀时间
                return false;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return true;
    }

    //i>	商品分类的显示
    //在当前模块中有一个”仓库.txt”文件,该文件中存放的是商品分类信息,
    //      该商品分类信息是以键值对的方式存储的.
    //      先读取该商品分类信息,并显示到控制台：如图
    public static HashMap<Integer, String> shangPinShow() {
        File file = new File("test\\src\\com\\haoxiujie\\testMiaoSha\\仓库.txt");
        HashMap<Integer, String> hm = new HashMap<>();
        /*  try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] split = s.split("=");
                hm.put(Integer.parseInt(split[0]), split[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return hm;*/
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            Properties properties = new Properties();
            properties.load(br);
            for (int i = 1; i <= properties.size(); i++) {
                String property = properties.getProperty("" + i);
                hm.put(i, property);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hm;
    }

    public static HashMap<String, Goods> fenLeiShow(String fenlei) {
        File file = new File("test\\src\\com\\haoxiujie\\testMiaoSha\\" + fenlei + ".txt");
        HashMap<String, Goods> hm = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] split = s.split(",");
                hm.put(split[0], new Goods(split[0], Integer.parseInt(split[1]), split[2], Double.parseDouble(split[3])));
            }
            if (hm.size() == 0) {
                return null;
            }
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            System.out.println(e);
        }
        return hm;
    }

    public static void mingXiPrint(HashMap<String, Goods> goods) {//显示商品明细,返回商品名称的集合
        System.out.println("您选择的分类下，有如下商品：");
        System.out.println("名称\t\t数量\t\t产地\t\t价格");
        Set<Map.Entry<String, Goods>> entries = goods.entrySet();
        for (Map.Entry<String, Goods> entry : entries) {
            Goods good = entry.getValue();
            String s;
            int num = good.getNum();
            if (num >= 5) {
                s = "充足";
            } else if (num > 2) {
                s = "有货";
            } else if (num >= 1) {
                s = "紧缺";
            } else {
                s = "售罄";
            }
            System.out.println(good.getBrand() + "\t\t" + s + "\t\t" + good.getAddress() + "\t\t" + good.getPrice());
        }
    }

    public static void fenLeiWriter(String fenlei, HashMap<String, Goods> goods) {
        File file = new File("test\\src\\com\\haoxiujie\\testMiaoSha\\" + fenlei + ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            Set<Map.Entry<String, Goods>> entries = goods.entrySet();
            for (Map.Entry<String, Goods> entry : entries) {
                Goods good = entry.getValue();
                bw.write(good.getBrand() + "," + good.getNum() + "," + good.getAddress() + "," + good.getPrice());
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void showGouWuChe(HashMap<Goods, Integer> hmGouWuChe) {
        System.out.println("您购买的商品信息如下：");
        System.out.println("商品名称\t\t商品单价\t\t商品个数\t\t商品总价");
        Set<Map.Entry<Goods, Integer>> entries = hmGouWuChe.entrySet();
        for (Map.Entry<Goods, Integer> entry : entries) {
            Goods key = entry.getKey();
            double buyPrice = key.getPrice() * entry.getValue();
            System.out.println(key.getBrand() + "\t\t" + key.getPrice() + "\t\t" + entry.getValue() + "\t\t" + buyPrice);
        }
    }

    public static void peiSong(HashMap<Goods, Integer> hmGouWuChe) {
        Random rd = new Random();
        int km = rd.nextInt(21);
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的用户名：");
        String name = sc.nextLine();
        System.out.print("请输入您的联系方式：");
        String tel = sc.nextLine();
        System.out.print("请输入您的配送地址：");
        String adress = sc.nextLine();
        Person person = new Person(name, tel, adress);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddkkhhss");
        String nowtime = dateFormat.format(new Date());
        File file = new File("test\\src\\com\\haoxiujie\\testMiaoSha\\配送用户文件夹\\" + name + nowtime + ".txt");
        try (PrintStream ps = new PrintStream(file)) {
            double add = 0;
            System.setOut(ps);
            System.out.println("姓名：" + name);
            System.out.println("联系方式：" + tel);
            System.out.println("配送地址：" + adress);
            System.out.println("配送距离：地址距离" + km + "公里");
            if (km > 5) {
                System.out.println("需要100元配送费");
                add += 100;
            } else {
                System.out.println("免配送费");
            }
            System.out.println("您购买的商品如下：");
            System.out.println("商品名称\t商品单价\t商品个数\t商品总价");
            Set<Map.Entry<Goods, Integer>> entries = hmGouWuChe.entrySet();
            for (Map.Entry<Goods, Integer> entry : entries) {
                Goods goods = entry.getKey();
                double danJia = goods.getPrice();
                int geShu = entry.getValue();
                double zongJia = danJia * geShu;
                add += zongJia;
                System.out.println(goods.getBrand() + "\t" + danJia + "\t" + geShu + "\t" + zongJia);
            }
            System.out.print("总价为：" + add);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void noPeiSong(HashMap<Goods, Integer> hmGouWuChe) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的用户名：");
        String name = sc.nextLine();
        System.out.print("请输入您的联系方式：");
        String tel = sc.nextLine();
        Person person = new Person(name, tel);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddkkhhss");
        String nowtime = dateFormat.format(new Date());
        File file = new File("test\\src\\com\\haoxiujie\\testMiaoSha\\不配送用户文件夹\\" + name + nowtime + ".txt");
        try (PrintStream ps = new PrintStream(file)) {
            System.setOut(ps);
            System.out.println("姓名：" + name);
            System.out.println("联系方式：" + tel);
            System.out.println("您购买的商品如下：");
            System.out.println("商品名称\t商品单价\t商品个数\t商品总价");
            Set<Map.Entry<Goods, Integer>> entries = hmGouWuChe.entrySet();
            double add = 0;
            for (Map.Entry<Goods, Integer> entry : entries) {
                Goods goods = entry.getKey();
                double danJia = goods.getPrice();
                int geShu = entry.getValue();
                double zongJia = danJia * geShu;
                add += zongJia;
                System.out.println(goods.getBrand() + "\t" + danJia + "\t" + geShu + "\t" + zongJia);
            }
            System.out.print("商品总价为：" + add);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
