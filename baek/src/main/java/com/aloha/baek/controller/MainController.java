package com.aloha.baek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class MainController {
    
    @GetMapping("/{page}")
    public String getMethodName(@PathVariable("page") String page) {
        log.info( page + "페이지입니다.");
        return page;
    }
    
}
