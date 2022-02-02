package com.sysco.test.api.tests;

import com.sysco.test.api.common.AssertErrorMessages;
import com.sysco.test.api.common.StatusCode;
import com.sysco.test.api.model.CommonModelGETEmployeesDetails;
import com.sysco.test.api.model.response.GetEmployeeDetailsResponse;
import com.sysco.test.api.requests.functions.APIEmployeeFunction;
import com.sysco.test.api.util.APIDataUtil;
import com.sysco.test.api.util.ResponseUtil;
import com.sysco.test.api.util.TestBase;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class GetEmployeeDetailsAPITests extends TestBase {
    protected static SoftAssert softAssert;
    CommonModelGETEmployeesDetails EmployeeDetailsGETData;
    GetEmployeeDetailsResponse expectedResponse;


    /**
     * Verify the success response when user sends get Employees Details request with correct values
     */
    @Test(description = "001", alwaysRun = true, priority = 1)
    public void testVerifyGetCustomerDetailsResponseForCorrectRequestIdWithQueryParams() {
        EmployeeDetailsGETData = APIDataUtil.getCommonModelGETEmployDetailsList("AMAZON_WEB_SITE 001",commonModelGETEmployeesDetailsList);
        expectedResponse = EmployeeDetailsGETData.getResponse();
        Response urlResponse = APIEmployeeFunction.getEmployeeResponse();
        GetEmployeeDetailsResponse actualResponse = (GetEmployeeDetailsResponse) ResponseUtil.getObject(urlResponse.asString(),GetEmployeeDetailsResponse.class);
        softAssert.assertEquals(actualResponse.getStatus(), StatusCode.SUCCESS_200_CODE, AssertErrorMessages.INVALID_STATUS_CODE);
        Assert.assertEquals(actualResponse.getEmployees().size(), expectedResponse.getEmployees().size(), "Incorrect Size");
        softAssert.assertAll();
    }


}
