package com.sysco.test.api.util;

import com.sysco.test.api.common.Constant;
import com.sysco.test.api.model.CommonModelGETEmployeesDetails;
import com.syscolab.qe.core.reporting.SyscoLabListener;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.util.List;
@Listeners(SyscoLabListener.class)
public class TestBase {
    protected static List<CommonModelGETEmployeesDetails> commonModelGETEmployeesDetailsList;
    @BeforeTest(alwaysRun = true)
    public void init() {
        commonModelGETEmployeesDetailsList = APIDataUtil.getCommonModelGETEmployDetailsList(Constant.TEST_RESOURCE_PATH,Constant.TestDataFilePath.INPUT_EMPLOYEE_DATA_JSON_FILE);
    }
}
