package com.sysco.test.api.model;

public class EmployeeResponseDataMapping {
    public float id;
    public String employee_name;
    public float employee_salary;
    public int employee_age;


    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public float getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(float employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }



}
