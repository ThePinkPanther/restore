package org.restore.http;

/**
 * @author ben
 * @version 1.0
 */
public enum HttpPrefix {

    HTTPS("https"),
    HTTP("http");

    private final String name;

    HttpPrefix(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
