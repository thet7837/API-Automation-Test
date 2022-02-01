package com.sysco.test.api.requests.data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.syscolab.qe.core.api.request.RequestBase;
import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "data"
})

public class EmployeeGetRequest extends RequestBase {

    @JsonProperty("status")
    public String status;


    /**
     * No args constructor for use in serialization
     *
     */
    public EmployeeGetRequest() {
    }

    /**
     *
     * @param status
     */
    public EmployeeGetRequest(String status) {
        super();
        this.status = status;

    }

}