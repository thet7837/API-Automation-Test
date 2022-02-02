package com.sysco.test.api.tests;


import com.sysco.test.api.common.AssertErrorMessages;
import com.sysco.test.api.common.StatusCode;
import com.sysco.test.api.model.EmployeeResponseModel;
import com.sysco.test.api.requests.data.EmployeeData;
import com.sysco.test.api.requests.functions.APIEmployeeFunction;
import com.sysco.test.api.util.ResponseUtil;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class GetEmployeeDetailsTest {
    private static SoftAssert softAssert;

    @Test
    public static void testGetProject() {

        softAssert = new SoftAssert();
        Response urlResponse = APIEmployeeFunction.getEmployeeResponse();
        EmployeeResponseModel responseModel = (EmployeeResponseModel) ResponseUtil.getObject(urlResponse.asString(), EmployeeResponseModel.class);
        softAssert.assertEquals(responseModel.status, StatusCode.SUCCESS_200_CODE, AssertErrorMessages.INVALID_STATUS_CODE);
        softAssert.assertEquals(responseModel.data.get(0).id, EmployeeData.EMPLOYEE_ID, AssertErrorMessages.INVALID_EMPLOYEE_ID);
        softAssert.assertEquals(responseModel.data.get(0).employeeName, EmployeeData.EMPLOYEE_NAME, AssertErrorMessages.INVALID_EMPLOYEE_NAME);
        softAssert.assertEquals(responseModel.data.get(0).employeeSalary, EmployeeData.EMPLOYEE_SALARY, AssertErrorMessages.INVALID_EMPLOYEE_SALARY);
        softAssert.assertEquals(responseModel.data.get(0).employeeAge, EmployeeData.EMPLOYEE_AGE, AssertErrorMessages.INVALID_EMPLOYEE_AGE);
        softAssert.assertEquals(responseModel.data.get(0).profileImage, EmployeeData.EMPLOYEE_IMAGE, AssertErrorMessages.INVALID_EMPLOYEE_IMAGE);

        softAssert.assertAll();
    }


}
