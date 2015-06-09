package org.restore.http.simpleclient;

import org.apache.commons.io.IOUtils;
import org.restore.http.HttpClient;
import org.restore.http.HttpPrefix;
import org.restore.http.Request;
import org.restore.http.Response;
import org.restore.http.exceptions.HttpException;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


/**
 * @author ben
 * @version 1.0
 */
public class SimpleHttpClient implements HttpClient {

    private final HttpParser httpParser = new HttpParser();

    /**
     * @param Request request
     * @return Socket
     * @throws IOException
     */
    private Socket createSocket(Request request) throws IOException {

        Socket socket;

        if (request.getUri().getPrefix().equals(HttpPrefix.HTTPS)) {
            // If https is used, create a special ssl socket
            socket = SSLSocketFactory.getDefault()
                    .createSocket(request.getUri().getHost(), request.getUri().getPort());
        } else {
            // Else return a plain socket
            socket = new Socket(request.getUri().getHost(), request.getUri().getPort());
        }

        return socket;
    }

    /**
     * @param Request request
     * @return returns a formed Response class
     * @throws HttpException
     */
    @Override
    public Response send(Request request)
            throws HttpException {

        // Open a socket
        try (Socket socket = createSocket(request)) {

            // Form and write a packet body
            try (OutputStream os = socket.getOutputStream()) {
                os.write(httpParser.createRequest(request));
                os.flush();
            }

            // Form a class from response body
            try (InputStream inputStream = socket.getInputStream()) {
                return httpParser.createResponse(
                        IOUtils.toByteArray(inputStream)
                );
            }

        } catch (IOException e) {
            throw new HttpException(e.getMessage());
        }
    }

}
