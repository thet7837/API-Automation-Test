package com.sysco.test.api.exceptions;

public class ReferenceKeyNotFound extends RuntimeException {
    public ReferenceKeyNotFound(String msg) {
        super(msg);
    }
}
