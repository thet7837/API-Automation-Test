package com.sysco.test.api.model;
import java.util.List;

import com.amazonaws.services.athena.model.Datum;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "data"
})
public class EmployeeResponseModel {
    @JsonProperty("status")
    public String status;
    @JsonProperty("data")
    public List<Datum> data = null;
    /**
     * No args constructor for use in serialization
     *
     */
//    public ProjectModel() {
//    }
    /**
     *
     * @param data
     * @param status
     */
    public EmployeeResponseModel(String status, List<Datum> data) {
        super();
        this.status = status;
        this.data = data;
    }
}











