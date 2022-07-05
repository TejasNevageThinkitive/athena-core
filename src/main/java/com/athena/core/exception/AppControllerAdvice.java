package com.athena.core.exception;

import com.athena.core.controller.AppController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Component
@Configuration
@ControllerAdvice
public class AppControllerAdvice extends AppController {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private  HttpServletRequest httpServletRequest;
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> handle(Exception exception) {
		ResponseEntity<Response> error = error(exception);
		logger.error("Response error: " + httpServletRequest.getRequestURI(), exception);
		return error;
	}



	private ResponseEntity<Response> error(Exception exception) {
		if (exception instanceof CoverMeException)
			return error(((CoverMeException) exception).getErrorCode(), exception.getMessage());
		if (exception instanceof DataIntegrityViolationException)
			return error(ResponseCode.DB_ERROR, NestedExceptionUtils.getMostSpecificCause((DataIntegrityViolationException) exception).getMessage());
		else if (exception instanceof MethodArgumentNotValidException) {
			Map<String, String> errors = new HashMap<>();
			((MethodArgumentNotValidException) exception).getBindingResult().getAllErrors().stream()
					.map(error -> (FieldError) error)
					.forEach(objectError -> errors.put(objectError.getField(), objectError.getDefaultMessage()));
			return error(ResponseCode.INVALID_PARAMETER, errors.toString());
		} else
			return error(ResponseCode.INTERNAL_ERROR, exception.getMessage());
	}
}
