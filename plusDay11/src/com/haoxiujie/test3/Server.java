package com.haoxiujie.test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true) {
            Socket accept = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = accept.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String[] s = br.readLine().split(" ");
                        String httpPath = s[1].substring(1);

                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(httpPath));
                        OutputStream os = accept.getOutputStream();

                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());

                        byte[] bytes = new byte[8192];
                        int len;
                        while ((len = bis.read(bytes)) != -1) {
                            os.write(bytes);
                        }
                        accept.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }
    }
}
