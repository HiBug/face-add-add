package com.xin.client.header;

import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/**
 * @author Three
 * @since 18/6/14下午8:55
 */
public class CommonHeader {
    public static final Header connection = new BasicHeader("Connection", "keep-alive");
    public static final Header accept = new BasicHeader("Accept", "*/*");
    public static final Header contentType = new BasicHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    public static final Header userAgent = new BasicHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0");
}
