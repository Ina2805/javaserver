package com.example.javaserver.Util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.Serializable;


public class NetworkMessage implements Serializable {

    @JsonProperty("eventType")
    NetworkRequest networkType;
    @JsonProperty("object")
    Object object;
    @JsonCreator
    public NetworkMessage(@JsonProperty("eventType") NetworkRequest networkType, @JsonProperty("object") Object object) {
        this.networkType = networkType;
        this.object = object;
    }

    @JsonGetter
    public NetworkRequest getNetworkType() {
        return networkType;
    }
    @JsonSetter
    public void setNetworkType(NetworkRequest networkType) {
        this.networkType = networkType;
    }
    @JsonGetter
    public Object getObject()
    {
        return object;
    }
    @JsonSetter
    public void setObject(Object object)
    {
        this.object = object;
    }
}
