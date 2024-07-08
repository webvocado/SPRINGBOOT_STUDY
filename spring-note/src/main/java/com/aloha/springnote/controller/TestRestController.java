package com.aloha.springnote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class TestRestController {
    
    /**
     * ⭐ @RestController = @Controller + @ResponseBody
     * - @ResponseBody 가 없어도, 데이터를 응답 본문(bdoy)에 담아서 전송한다.
     * @return
     */
    @GetMapping("/body")
    public String restBody() {

        return "REST";
    }
    
}
