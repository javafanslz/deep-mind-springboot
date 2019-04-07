package com.channelsoft.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @Author: lizhu
 * @ClassName: IndexControllerAdvice
 * @Desciption: Date:2019/4/7
 */
@ControllerAdvice(assignableTypes = IndexController.class)
public class IndexControllerAdvice {

    @ModelAttribute("message")
    public String getMessage(){
        return "hello message";
    }

    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language")String acceptLanguage){
        return acceptLanguage;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> onException(Throwable throwable){
        return ResponseEntity.ok(throwable.getMessage());
    }
}
