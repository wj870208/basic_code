package com.haoxiujie.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 15555);
        OutputStream os = socket.getOutputStream();
        os.write("这里是客户端~".getBytes());

        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[4096];
//        StringBuilder sb = new StringBuilder();
        int len = is.read(bytes);
//        while ((len = is.read(bytes)) != -1) {
//            sb.append(new String(bytes, 0, len));
//        }
        System.out.println(new String(bytes, 0, len));


        socket.close();
    }
}
