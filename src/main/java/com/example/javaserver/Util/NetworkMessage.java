package com.example.javaserver.Util;

import com.example.javaserver.Models.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;


public class NetworkMessage implements Serializable {

    @JsonProperty
    NetworkRequest networkType;
    @JsonProperty
    String userId;

    private List<User> userList;

    public NetworkMessage(NetworkRequest networkType, String userId) {
        this.networkType = networkType;
        this.userId = userId;
    }

    public NetworkMessage(NetworkRequest type) {
        this.networkType = type;
    }
    public NetworkRequest getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkRequest networkType) {
        this.networkType = networkType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "NetworkMessage{" +
                "networkType=" + networkType +
                ", userId='" + userId + '\'' +
                '}';
    }
}
