package com.sysco.test.api.model;
import java.util.List;
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
    public List<APIResponseModel> data = null;
    /**
     * No args constructor for use in serialization
     *
     */
    public EmployeeResponseModel() {
    }
    /**
     *
     * @param data
     * @param status
     */
    public EmployeeResponseModel (String status, List<APIResponseModel> data) {
        super();
        this.status = status;
        this.data = data;
    }
}












