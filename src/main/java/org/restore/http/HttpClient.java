package org.restore.http;

import org.restore.http.exceptions.HttpException;

/**
 * @author ben
 * @version 1.0
 */
public interface HttpClient {

    public Response send(Request query) throws HttpException;

}
