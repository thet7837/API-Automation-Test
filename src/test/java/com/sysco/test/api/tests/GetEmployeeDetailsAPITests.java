package com.sysco.test.api.tests;

import com.sysco.test.api.common.AssertErrorMessages;
import com.sysco.test.api.common.Constant;
import com.sysco.test.api.functions.APIEmployeeFunction;
import com.sysco.test.api.model.CommonModelGETEmployeesDetails;
import com.sysco.test.api.model.response.GetEmployeeDetailsResponse;
import com.sysco.test.api.util.APIDataUtil;
import com.sysco.test.api.util.JacksonUtil;
import com.sysco.test.api.util.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class GetEmployeeDetailsAPITests extends TestBase {

    private static SoftAssert softAssert;


    CommonModelGETEmployeesDetails employeeDetailsRequest;
    GetEmployeeDetailsResponse expectedResponse;
    GetEmployeeDetailsResponse actualResponse;

    /**
     * Verify the success response when user sends get Employees Details request with correct values
     */

    @Test(description = "001", alwaysRun = true, priority = 1)
    public void testVerifyGetCustomerDetailsResponseForCorrectRequestIdWithQueryParams() {
        softAssert = new SoftAssert();
        employeeDetailsRequest = APIDataUtil.getEmployeeModelForReferenceKey(Constant.AMAZON_WEB_SITE_001, commonModelGETEmployeesDetailsList);
        expectedResponse = employeeDetailsRequest.getResponse();
        actualResponse = APIEmployeeFunction.getTransactionHistoryResponse(JacksonUtil.convertObjectToJsonString(employeeDetailsRequest));
        softAssert.assertEquals(actualResponse.getStatus(), expectedResponse.getStatus(), AssertErrorMessages.INVALID_STATUS_CODE);
        softAssert.assertEquals(actualResponse.getData().getId(), expectedResponse.getData().getId(), AssertErrorMessages.INVALID_EMPLOYEE_ID);
        softAssert.assertEquals(actualResponse.getData().getEmployee_name(), expectedResponse.getData().getEmployee_name(), AssertErrorMessages.INVALID_EMPLOYEE_NAME);
        softAssert.assertEquals(actualResponse.getData().getEmployee_salary(), expectedResponse.getData().getEmployee_salary(), AssertErrorMessages.INVALID_EMPLOYEE_SALARY);
        softAssert.assertEquals(actualResponse.getData().getEmployee_age(), expectedResponse.getData().getEmployee_age(), AssertErrorMessages.INVALID_EMPLOYEE_AGE);
        softAssert.assertAll();
    }


}
