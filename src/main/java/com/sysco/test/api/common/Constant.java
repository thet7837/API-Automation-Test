package com.sysco.test.api.common;

public class Constant {
    public static final String API_HOST = System.getProperty("api.host", "http://dummy.restapiexample.com");
    public static final String BASE_PATH = System.getProperty("api.base", "");
    public static final String TEST_RESOURCE_PATH = System.getProperty("user.dir") + "/src/main/resources/";
    public static final String TEST_EMPLOYEE_DATA_DIRECTORY = "TestData/";
    public static final String EMPLOYEE_DATA_JSON_FILE = "EmployeeData.json";
    public static final String AMAZON_WEB_SITE_001 = "AMAZON_WEB_SITE_001";

    /*
     * Employee Data File pPath Set
     * */
    public static class TestDataFilePath {

        public static final String INPUT_EMPLOYEE_DATA_JSON_FILE = TEST_EMPLOYEE_DATA_DIRECTORY + EMPLOYEE_DATA_JSON_FILE;

        private TestDataFilePath() {
        }
    }
}
