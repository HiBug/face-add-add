package com.xin.client;

import org.apache.http.Header;
import org.apache.http.message.BasicNameValuePair;

/**
 * @author Three
 * @since 18/6/14下午8:46
 */
public interface Client<T> {

    T execute();

    Client<T> addHeader(Header header);

    Client<T> addParam(BasicNameValuePair nameValuePair);

}
