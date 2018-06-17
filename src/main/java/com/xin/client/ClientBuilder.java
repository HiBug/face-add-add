package com.xin.client;

import com.google.common.collect.Sets;
import org.apache.http.Header;
import org.apache.http.NameValuePair;

import java.util.Collection;

import static com.xin.client.param.CommonParam.api_key;
import static com.xin.client.param.CommonParam.api_secret;

/**
 * @author Three
 * @since 18/6/14下午8:46
 */
public class ClientBuilder {
    private Collection<Header> headers = Sets.newHashSet();
    private Collection<NameValuePair> params = Sets.newHashSet(api_key, api_secret);

//    public ClientBuilder addHeader(Header header) {
//
//    }

}
