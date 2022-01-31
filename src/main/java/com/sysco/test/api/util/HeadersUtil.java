package com.sysco.test.api.util;

import java.util.HashMap;

public class HeadersUtil {


    public static HashMap<String, String> getBasicHeaders(String token) {
        HashMap<String, String> headers = new HashMap();
        headers.put("Authorization", token);
        return headers;
    }
}
