package com.example.demo.resources;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CalculatorExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<APIError> handleException(Exception exception) {
        APIError error =  APIError.builder()
                .moment(LocalDateTime.now())
                .errorName(exception.getClass().getSimpleName())
                .errorCause(exception.getMessage())
                .status(HttpStatus.BAD_REQUEST).build();

        return ResponseEntity.status(error.getStatus()).body(error);
    }

}

@Getter @Setter @AllArgsConstructor @Builder
class APIError {
    private HttpStatus status;
    private LocalDateTime moment;
    private String errorName;
    private String errorCause;
}