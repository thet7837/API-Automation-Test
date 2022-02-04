package com.sysco.test.api.model.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class StatusResponse implements Serializable {
    private String state;
    private String message;
}
