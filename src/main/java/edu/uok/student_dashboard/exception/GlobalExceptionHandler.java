package edu.uok.student_dashboard.exception;

import edu.uok.student_dashboard.dto.ApiResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponseDto> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
        ApiResponseDto apiResponseDto = new ApiResponseDto(ex.getMessage(), false);
        return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.NOT_FOUND);
    }
}
