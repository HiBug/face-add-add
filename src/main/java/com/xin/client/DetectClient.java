package com.xin.client;

import org.apache.http.Header;
import org.apache.http.message.BasicNameValuePair;

/**
 * @author Three
 * @since 18/6/14下午8:52
 */
public class DetectClient<T> implements Client {
    @Override
    public T execute() {
        return null;
    }

    @Override
    public Client addHeader(Header header) {
        return null;
    }

    @Override
    public Client addParam(BasicNameValuePair nameValuePair) {
        return null;
    }
}
