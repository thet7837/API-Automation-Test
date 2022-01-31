package com.sysco.test.api.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ResponseUtil {
    public static int getStatus(Response response){
        return  response.getStatusCode();
    }


    public static String getDataValueInDataArray(String response, int dataArrayIndex, String key) throws JSONException {
        JSONArray jArray = new JSONArray(response);

        String toReturn ="";
        try {
            JSONObject responseBody = jArray.getJSONObject(dataArrayIndex);;
            toReturn = responseBody.getString(key);
        }catch (Exception e){
            e.getMessage();
        }finally {
            return toReturn;
        }
    }

    public static Object getDataObjectValueInDataArray(String response, int dataArrayIndex, Class c) throws JSONException {
        JSONArray jArray= new JSONArray(response);

        String toReturn ="";
        try {
            JSONObject responseBody = jArray.getJSONObject(dataArrayIndex);;
            return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(responseBody.toString(), c);

        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }
//public static Object getDataObjectValueInDataArray(String response, int dataArrayIndex, Class c) throws JSONException {
//    String json = response;
//
//
//    String toReturn ="";
//    try {
//        JSONObject responseBody = json.getJSONObject(dataArrayIndex);;
//        return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(responseBody.toString(), c);
//
//    }catch (Exception e){
//        e.getMessage();
//    }
//    return null;
//}
}
