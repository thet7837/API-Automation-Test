package com.sysco.test.api.util;

import com.sysco.test.api.exceptions.ReferenceKeyNotFound;
import com.sysco.test.api.model.CommonModelGETEmployeesDetails;

import java.util.List;

public class APIDataUtil {
    private static final String INPUT_REFERENCE_KEY = "Input reference key ";

    public static List<CommonModelGETEmployeesDetails> getCommonTHAPIModelFromDataJSONFile(String filePath, String fileName) {
        return JacksonUtil.getObjectArray(FileOperationsUtils.readFileToString(filePath, fileName), CommonModelGETEmployeesDetails.class);
    }

    public static CommonModelGETEmployeesDetails getEmployeeModelForReferenceKey(String referenceKey, List<CommonModelGETEmployeesDetails> commonEmployeeModelList) {
        CommonModelGETEmployeesDetails employeesDetails = new CommonModelGETEmployeesDetails();
        for (int i = 0; i < commonEmployeeModelList.size(); i++) {
            if (referenceKey.equals(commonEmployeeModelList.get(i).getReferenceKey())) {
                return commonEmployeeModelList.get(i);
            }
        }

        throw new ReferenceKeyNotFound(INPUT_REFERENCE_KEY + referenceKey + " not found for Employee Request");
    }

}
