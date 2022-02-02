package com.sysco.test.api.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.syscolab.qe.core.common.LoggerUtil;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class ResponseUtil {
    public static int getStatus(Response response){
        return  response.getStatusCode();
    }


    public static Object getObject(String response, Class c) {
        try {
            return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(response, c);
        } catch (IOException e) {
            LoggerUtil.logERROR(e.getMessage(), e);
        }
        return null;
    }

    public static Object getDataObjectValueInDataArray(String response, int index, Class name) throws JSONException {
        JSONObject jsonObject = new JSONObject(response);
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        try {
            JSONObject responseBody = jsonArray.getJSONObject(index);
            return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(responseBody.toString(), name);

        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

}
