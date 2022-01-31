package com.sysco.test.api.tests;

import com.sysco.test.api.common.StatusCode;
import com.sysco.test.api.requests.functions.APIEmployeeFunction;
import com.sysco.test.api.model.EmployeeResponseModel;
import com.sysco.test.api.util.ResponseUtil;
import io.restassured.response.Response;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;

public class GetEmployeeDetailsTest {

    @Test
    public static void testGetProject() throws JSONException {
        SoftAssert softAssert = new SoftAssert();
        Response projectList = APIEmployeeFunction.getEmployeeResponse();
        EmployeeResponseModel responseModel = (EmployeeResponseModel) ResponseUtil.getDataObjectValueInDataArray(projectList.asString(), 1, EmployeeResponseModel.class);
        softAssert.assertEquals(ResponseUtil.getStatus(projectList), StatusCode.SUCCESS_200_CODE, "Status code should be 200");
        Assert.assertEquals(responseModel.status, 1, "Should be equal");


        //  Assert.assertEquals(ProjectModel.getId(),"test","name should match")
        softAssert.assertAll();
    }


}
