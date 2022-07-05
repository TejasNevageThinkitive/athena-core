package com.athena.core.service;

import com.athena.core.exception.CoverMeException;
import com.athena.core.response.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {

        protected final Logger logger = LoggerFactory.getLogger(this.getClass());

        protected void throwError(ResponseCode code, String message) throws CoverMeException {
            logger.error("Error Occurred : [{}] {}", code, message);
            throw new CoverMeException(code, message);
        }

        protected void throwError(Exception exception) throws CoverMeException {
            throwError(new CoverMeException(exception));
        }

        protected void throwError(CoverMeException exception) throws CoverMeException {
            logger.error("Unexpected Error Occurred", exception);
            throw exception;
        }
    }

