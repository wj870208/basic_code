package com.haoxiujie.test2;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //向客户端上传一个文件
        Socket socket = new Socket("127.0.0.1", 15555);
        OutputStream os = socket.getOutputStream();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("plusDay11\\src\\com\\haoxiujie\\test2\\课程表.zip"));
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        byte[] isbytes = new byte[1024];
        int islen = is.read(isbytes);
        System.out.println(new String(isbytes, 0, islen));

        socket.close();
    }
}
