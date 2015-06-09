package org.restore.http;

/**
 * @author ben
 * @version 1.0
 */
public enum Method {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    HEAD("HEAD"),
    TRACE("TRACE"),
    CONNECT("CONNECT");

    private final String name;

    public String getName() {
        return name;
    }

    Method(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
