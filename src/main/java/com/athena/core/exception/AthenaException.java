package com.athena.core.exception;

import com.athena.core.util.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.UnknownHttpStatusCodeException;

import java.util.function.Supplier;

public class AthenaException extends RuntimeException{

    public AthenaException(String message, Throwable reason){
        super(message, reason);
    }

    public AthenaException(String message){
        super(message);
    }

    public static <T> T AthenaAPIErrorHandling(Supplier<T> call){

        try {
            return call.get();
        }catch (HttpClientErrorException | HttpServerErrorException | UnknownHttpStatusCodeException ex){
            throw new AthenaException(HttpStatus.SERVICE_UNAVAILABLE.name(), ex);
        }

    }
}
