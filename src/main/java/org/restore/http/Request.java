package org.restore.http;

import java.util.TreeMap;

/**
 * @author ben
 * @version 1.0
 */
public class Request {

    private final Method method;

    private final URI uri;


    private TreeMap<String, String> fields = new TreeMap<>();

    public Request(Method method, URI uri) {
        this.method = method;
        this.uri = uri;
    }

    public Method getMethod() {
        return method;
    }

    public URI getUri() {
        return uri;
    }

    public TreeMap<String, String> getFields() {
        return fields;
    }

}
