package com.sysco.test.api.model.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class GetEmployeeDetailsResponse implements Serializable {
    private String status;
    private Employees data;

    @Getter
    @Setter
    public static class Employees implements Serializable {
        private int id;
        private String employee_name;
        private Float employee_salary;
        private int employee_age;
        private String profile_image;
    }

}
