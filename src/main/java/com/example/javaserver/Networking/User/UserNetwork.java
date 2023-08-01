package com.example.javaserver.Networking.User;

import com.example.javaserver.Models.User;
import com.example.javaserver.Networking.Connection.DatabaseClient;
import com.example.javaserver.Networking.Connection.IDatabaseClient;
import com.example.javaserver.Util.NetworkMessage;
import com.example.javaserver.Util.NetworkRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component public class UserNetwork implements IUserNetwork {

    @Autowired IDatabaseClient databaseClient = new DatabaseClient();

    @Override
    public List<User> getAllUsers() {
        Gson gson = new Gson();
        NetworkMessage request = new NetworkMessage(NetworkRequest.GET_ALL_USERS, null);

        String received = databaseClient.connect(request);

        return gson.fromJson(received, new TypeToken<List<User>>() {}.getType());
    }
}
