package com.xhg;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        OutputStream os = socket.getOutputStream();
        File file = new File("d://upload");
        if (!file.exists()) {
            file.mkdir();
        }
    }
}
