package com.sysco.test.api.tests;

import com.jayway.restassured.response.Response;
import com.sysco.test.api.requests.functions.APIEmployeeFunction;
import com.sysco.test.api.model.EmployeeResponseModel;
import com.sysco.test.api.util.ResponseUtil;
import org.json.JSONException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class GetEmployeeDetailsTest {
    private static SoftAssert softAssert;

    @Test
    public static void testGetProject() throws JSONException {
//        softAssert = new SoftAssert();
//        Response projectList = APIEmployeeFunction.getEmployeeResponse();
//        EmployeeResponseModel responseModel = (EmployeeResponseModel) ResponseUtil.getDataObjectValueInDataArray(projectList.asString(), 1, EmployeeResponseModel.class);
//        softAssert.assertEquals(ResponseUtil.getStatus(projectList), StatusCode.SUCCESS_200_CODE, "Status code should be 200");
//        Assert.assertEquals(responseModel.status, 1, "Should be equal");
//        softAssert.assertAll();

        softAssert = new SoftAssert();
        Response projectList = APIEmployeeFunction.getEmployeeResponse();
        EmployeeResponseModel  responseModel = (EmployeeResponseModel)ResponseUtil.getObject(projectList.asString(), EmployeeResponseModel.class);
        softAssert.assertEquals(responseModel.status, "success", "Status is failed");
        softAssert.assertEquals(responseModel.data.get(0).id, "1", "Employee ID is incorrect");
        softAssert.assertEquals(responseModel.data.get(0).employeeName, "Tiger Nixon", "Employee name is incorrect");
        softAssert.assertEquals(responseModel.data.get(0).employeeSalary, "320800", "Employee salary it incorrect");
        softAssert.assertEquals(responseModel.data.get(0).employeeAge, "61", "Employee age is incorrect");
        softAssert.assertEquals(responseModel.data.get(0).profileImage, "", "profile image not loaded");

        softAssert.assertAll();
    }


}
