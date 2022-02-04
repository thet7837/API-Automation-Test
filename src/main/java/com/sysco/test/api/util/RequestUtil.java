package com.sysco.test.api.util;


import com.sysco.test.api.common.Constant;
import com.syscolab.qe.core.api.restassured.RestUtil;
import io.restassured.response.Response;

import java.util.Map;

public class RequestUtil {

    public static void setRequestBaseUrls() {
        RestUtil.BASE_PATH = Constant.BASE_PATH;
        RestUtil.API_HOST = Constant.API_HOST;

    }

    public static Response send(Map<String, String> headers, String bodyString, String uri, String requestMethod, Map<String, String> queryParameters) {
        return RestUtil.send(headers, bodyString, uri, requestMethod, queryParameters);

    }

    public static String getToken() {
        return "";
    }
}
