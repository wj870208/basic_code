package com.haoxiujie.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(15555);
        Socket accept = serverSocket.accept();
        InputStream is = accept.getInputStream();
        // StringBuilder sb = new StringBuilder();
        byte[] bytes = new byte[4096];
        int len = is.read(bytes);
        // while ((len = is.read(bytes)) != -1) {
        //   sb.append(new String(bytes, 0, len));
        //   }
        System.out.println(new String(bytes, 0, len));

        OutputStream os = accept.getOutputStream();
        os.write("这里是服务端~".getBytes());


        serverSocket.close();
    }
}
