package com.tropogo.assesment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tropogo.assesment.vo.ErrorVO;

@ControllerAdvice
public class Exceptionhandler {
	 @ExceptionHandler(MethodArgumentNotValidException.class)
	 @ResponseStatus(code = HttpStatus.BAD_REQUEST)
	 @ResponseBody
	 public ErrorVO handleValidationError(MethodArgumentNotValidException ex) {
		 BindingResult bindingResult = ex.getBindingResult();
	     FieldError fieldError = bindingResult.getFieldError();
	     String defaultMessage = fieldError.getDefaultMessage();
	     return new ErrorVO("VALIDATION_FAILED", defaultMessage);
	 }

}
