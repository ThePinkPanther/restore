package org.restore.http;

/**
 * @author ben
 * @version 1.0
 */
public class URI {

    private static final String DEF_HTTP_PREFIX = "http";
    private static final String DEF_HTTPS_PREFIX = "https";
    private static final int DEF_HTTP_PORT = 80;
    private static final int DEF_HTTPS_PORT = 443;

    private final String host;
    private final HttpPrefix prefix;
    private final int port;
    private final String resource;

    /**
     * @param String     host
     * @param HttpPrefix prefix
     * @param int        port
     * @param String     resource
     */
    public URI(String host, HttpPrefix prefix, int port, String resource) {
        this.host = host;
        this.prefix = prefix;
        this.port = port;
        this.resource = resource;
    }

    public String getHost() {

        return host;
    }

    public HttpPrefix getPrefix() {
        return prefix;
    }

    public int getPort() {
        return port;
    }

    public String getResource() {
        return resource;
    }

    @Override
    public String toString() {
        StringBuilder uri = new StringBuilder();
        uri.append(prefix);
        uri.append("://");
        uri.append(host);
        if ((port == DEF_HTTP_PORT && prefix.equals(DEF_HTTP_PREFIX)) ||
                (port == DEF_HTTPS_PORT && prefix.equals(DEF_HTTPS_PREFIX))
                ) {
            uri.append(":");
            uri.append(port);
        }
        uri.append(resource);
        return uri.toString();
    }

    public static URI fromString(String uri) {
        //TODO
        throw new RuntimeException("not implemented");
    }

}
