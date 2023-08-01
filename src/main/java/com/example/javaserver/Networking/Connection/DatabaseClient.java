package com.example.javaserver.Networking.Connection;

import com.example.javaserver.Util.NetworkMessage;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.Socket;

@Component
public class DatabaseClient implements IDatabaseClient {

    @Override
    public String connect(NetworkMessage networkMessage)
    {
        try {
            Gson gson = new Gson();
            Socket socket = new Socket("localhost",2910);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            String request = gson.toJson(networkMessage);
            byte[] requestByte = request.getBytes();

            outputStream.write(requestByte);
            byte[] data = new byte[256];

            int count = inputStream.read(data);
            String received = new String(data, 0, count);

            return received;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Connection failed";
    }
}