package com.sysco.test.api.requests.data;
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
public class EmployeeGetRequest {
    @JsonProperty("status")
    public String status;


    public EmployeeGetRequest() {
    }
    /**
     *
     * @param status
     */
    public EmployeeGetRequest (String status, List<Datum> data) {
        super();
        this.status = status;

    }
}

