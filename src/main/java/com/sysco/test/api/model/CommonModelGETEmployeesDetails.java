package com.sysco.test.api.model;


import com.sysco.test.api.model.request.QueryParametersRequest;
import com.sysco.test.api.model.response.GetEmployeeDetailsResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonModelGETEmployeesDetails {
    private String referenceKey;
    private QueryParametersRequest queryAndPathParameters;
    private GetEmployeeDetailsResponse response;

}
