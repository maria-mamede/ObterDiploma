package com.meli.obterdiploma.exception;

import com.meli.obterdiploma.model.ErrorDTO;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ObterDiplomaException extends RuntimeException {
    private final ErrorDTO errorDto;
    private final HttpStatus httpStatus;

    public ObterDiplomaException(String message, HttpStatus httpStatus) {
        this.errorDto = new ErrorDTO(this.getClass().getSimpleName(), message);
        this.httpStatus = httpStatus;
    }
}
