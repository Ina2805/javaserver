package com.example.javaserver.Networking.Connection;

import com.example.javaserver.Util.NetworkMessage;
import com.example.javaserver.Util.NetworkRequest;

public interface IDatabaseClient {
    String connect(NetworkMessage networkMessage);
}
