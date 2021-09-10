package br.com.vitat.instigate.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class CustomExceptionHandler {

    @ExceptionHandler(ProgramNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public String handleProgramNotFoundException(ProgramNotFoundException exception) {
        return "Programa não encontrado";
    }
}
