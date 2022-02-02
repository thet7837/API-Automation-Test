package com.sysco.test.api.util;

import com.sysco.test.api.model.CommonModelGETEmployeesDetails;

import java.util.List;

public class APIDataUtil {
    public static List<CommonModelGETEmployeesDetails> getCommonModelGETEmployDetailsList(String filePath, String fileName) {
        return JacksonUtil.getObjectArray(FileOperationsUtils.readFileToString(filePath, fileName),CommonModelGETEmployeesDetails.class);
    }

}
