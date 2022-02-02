package com.sysco.test.api.model.response;

import com.sysco.test.api.model.request.QueryParametersRequest;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class GetEmployeeDetailsResponse implements Serializable {
    private List<Employees> employees;
    private int status;
    @Getter
    @Setter
    public static class Employees implements Serializable {
        private int id;
        private String employee_name;
        private Float employee_salary;
        private int employee_age;
    }

}
