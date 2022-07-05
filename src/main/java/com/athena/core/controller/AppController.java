package com.athena.core.controller;

import com.athena.core.exception.CoverMeException;
import com.athena.core.exception.Response;
import com.athena.core.exception.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.UUID;

public class AppController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HttpServletRequest httpServletRequest;


    protected String getCurrentUser() throws CoverMeException {

        return "";
    }

    public ResponseEntity<Response> data(Object entity) {
        return new ResponseEntity<>(Response.builder().status(HttpStatus.OK.value()).code(ResponseCode.ENTITY)
                .message(entity).path(httpServletRequest.getRequestURI()).requestId(UUID.randomUUID().toString())
                .version("1.0").build(), HttpStatus.OK);
    }

    public ResponseEntity<Response> success(ResponseCode code, Serializable message) {
        return new ResponseEntity<>(Response.builder().status(HttpStatus.OK.value()).code(code).message(message)
                .path(httpServletRequest.getRequestURI()).requestId(UUID.randomUUID().toString()).version("1.0")
                .build(), HttpStatus.OK);

    }

    public ResponseEntity<Response> error(ResponseCode code, Exception e) {
        e.printStackTrace();
        return error(code, e.getMessage());
    }

    public ResponseEntity<Response> error(ResponseCode code, Serializable message) {
        HttpStatus status = HttpStatus.BAD_REQUEST;

        if (code == ResponseCode.INTERNAL_ERROR) {
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return new ResponseEntity<>(Response.builder().status(status.value()).code(code).message(message)
                .path(httpServletRequest.getRequestURI()).requestId(UUID.randomUUID().toString()).errors(null)
                .version("1.0").build(), status);
    }
}