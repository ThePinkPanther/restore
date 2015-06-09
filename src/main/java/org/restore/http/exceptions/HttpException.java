package org.restore.http.exceptions;

/**
 * @author ben
 * @version 1.0
 */
public class HttpException extends Exception {

    public HttpException(String message) {
        super(message);
    }

    public HttpException() {
    }
}
