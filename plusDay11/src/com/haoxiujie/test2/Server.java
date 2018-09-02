package com.haoxiujie.test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    //下载客户端上传的文件
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(15555);
        Random rd = new Random();
        while (true) {
            Socket accept = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = accept.getInputStream();
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("plusDay11\\src\\com\\haoxiujie\\test2\\接收到的文件\\" + System.currentTimeMillis() + rd.nextInt(999999) + ".zip"));
                        byte[] bytes = new byte[8192];
                        int len;
                        while ((len = is.read(bytes)) != -1) {
                            bos.write(bytes, 0, len);
                        }
                        bos.flush();

                        OutputStream os = accept.getOutputStream();
                        os.write("上传成功".getBytes());
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }

//        serverSocket.close();
    }
}
