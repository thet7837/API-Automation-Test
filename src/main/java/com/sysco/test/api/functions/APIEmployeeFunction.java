package com.sysco.test.api.functions;


import com.sysco.test.api.common.URIs;
import com.sysco.test.api.model.response.GetEmployeeDetailsResponse;
import com.sysco.test.api.util.HeadersUtil;
import com.sysco.test.api.util.RequestUtil;
import com.sysco.test.api.util.ResponseUtil;
import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolab.qe.core.api.util.RequestMethods;
import io.restassured.response.Response;


public class APIEmployeeFunction {

    public static Response getEmployeeResponse() {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), "", URIs.retrieveProjectsURI(), RequestMethods.GET.toString(), null);

    }
    public static GetEmployeeDetailsResponse getTransactionHistoryResponse(String apiRequest) {
        RequestUtil.setRequestBaseUrls();
        String uri = URIs.retrieveProjectsURI();
        Response response = RestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), apiRequest, uri,  RequestMethods.GET.toString());
        GetEmployeeDetailsResponse transactionHistoryResponse = (GetEmployeeDetailsResponse) ResponseUtil.getResponseAsObject(response.asString(), GetEmployeeDetailsResponse.class);

        return transactionHistoryResponse;
    }
}
