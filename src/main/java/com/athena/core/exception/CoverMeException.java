package com.athena.core.exception;

public class CoverMeException extends Exception{

    private ResponseCode errorCode;
    private String[] fields;
    private Exception exception;

    public CoverMeException(ResponseCode code, String message, String... fields) {
        super(message);
        this.errorCode = code;
        this.fields = fields;
    }

    public CoverMeException(Exception exception) {
        super(exception.getLocalizedMessage());
        this.errorCode = ResponseCode.INTERNAL_ERROR;
        this.exception = exception;
    }

    public ResponseCode getErrorCode() {
        return errorCode;
    }

    public String[] getFields() {
        return fields;
    }

    public Exception getException() {
        return exception;
    }
}
