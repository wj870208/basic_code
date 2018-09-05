package com.haoxiujie.miaoSha;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tests {
    public static boolean isContinue() {//是否继续
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            if (s.equals("Y") || s.equals("y") || Integer.parseInt(s) == 1) {
                return true;
            }
        } catch (NumberFormatException e) {
        }
        return false;
    }

    public static boolean isEndtime() {//设置秒杀活动的时间
        File file = new File("test\\src\\com\\haoxiujie\\miaoSha\\endtime.properties");
        Properties prop = new Properties();
        //设置秒杀时间
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            prop.setProperty("endtime", "2018年10月1日 12:00:00");
            prop.store(bw, "endtime");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //读取秒杀时间
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            prop.load(br);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 kk:mm:ss");
            long endtime = dateFormat.parse(prop.getProperty("endtime")).getTime();
            long nowtime = new Date().getTime();
            if (nowtime >= endtime) {
                return false;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static HashMap<Integer, String> getFenlei() {//获取分类HashMap
        Properties prop = new Properties();
        HashMap<Integer, String> hm = new HashMap<>();
        File file = new File("test\\src\\com\\haoxiujie\\miaoSha\\仓库.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            prop.load(br);
            Set<Object> num = prop.keySet();
            for (Object o : num) {
                hm.put(Integer.parseInt((String) o), (String) prop.get(o));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hm;
    }

    public static ArrayList<Goods> getMingxi(String fenlei) {//获取明细ArrayList
        ArrayList<Goods> alg = new ArrayList<>();
        File file = new File("test\\src\\com\\haoxiujie\\miaoSha\\" + fenlei + ".txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] split = s.split(",");
                alg.add(new Goods(split[0], Integer.parseInt(split[1]), split[2], Double.parseDouble(split[3])));
            }
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (alg.size() == 0) {
            return null;
        }
        return alg;
    }

    public static void writeGoods(String fenlei, HashMap<String, Goods> hmgoodsName) {//写入库存文件
        Set<Map.Entry<String, Goods>> entries = hmgoodsName.entrySet();
        File file = new File("test\\src\\com\\haoxiujie\\miaoSha\\" + fenlei + ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, Goods> entry : entries) {
                Goods goods = entry.getValue();
                bw.write(goods.getBrand() + "," + goods.getNum() + "," + goods.getAddress() + "," + goods.getPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printTxt(Person person, ArrayList<Goods> list) {
        boolean dis = person.isDis();
        double add = 0;
        File file;
        long time = new Date().getTime();
        if (dis) {
            file = new File("test\\src\\com\\haoxiujie\\miaoSha\\配送用户\\" + person.getName() + time + ".txt");
        } else {
            file = new File("test\\src\\com\\haoxiujie\\miaoSha\\不配送用户\\" + person.getName() + time + ".txt");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("姓名：" + person.getName());
            bw.newLine();
            bw.write("联系电话：" + person.getTel());
            bw.newLine();
            if (dis) {
                bw.write("配送地址：" + person.getAddress());
                bw.newLine();
                Random rd = new Random();
                int km = rd.nextInt(21);
                bw.write("配送距离：地址距离" + km + "公里");
                bw.newLine();
                if (km > 5) {
                    bw.write("需要100元配送费");
                    add += 100;
                    bw.newLine();
                } else {
                    bw.write("免配送费");
                    bw.newLine();
                }
            }
            bw.newLine();
            bw.write("您购买的商品如下：");
            bw.newLine();
            bw.write("商品名称\t商品单价\t商品个数\t商品总价");
            bw.newLine();
            for (Goods goods : list) {
                String brand = goods.getBrand();
                double price = goods.getPrice();
                int num = goods.getNum();
                double addprice = price * num;
                bw.write(brand + "\t" + price + "\t" + num + "\t" + addprice);
                add += addprice;
                bw.newLine();
            }
            bw.write("总价为：" + add);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
