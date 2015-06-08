package org.restore.queries;

import java.util.TreeMap;

/**
 * @author ben
 * @version 1.0
 */
public class Request {

    private final Method method;

    private final String uri;

    private TreeMap<String, String> headers = new TreeMap<String, String>();

    public Request(Method method, String uri) {
        this.method = method;
        this.uri = uri;
    }
}
