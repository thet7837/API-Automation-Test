package com.sysco.test.api.requests.functions;

import com.sysco.test.api.common.URIs;
import com.sysco.test.api.util.HeadersUtil;
import com.sysco.test.api.util.RequestUtil;
import com.syscolab.qe.core.api.util.RequestMethods;
import io.restassured.response.Response;


public class APIEmployeeFunction {

    public static Response getEmployeeResponse() {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), "", URIs.retrieveProjectsURI(), RequestMethods.GET.toString(), null);

    }

}
