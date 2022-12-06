package com.study.jungCode.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
 * 어노테이션 설명
 * @RestController : 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어줌 => 예전 @ResponseBody를 메소드마다 선언했던 것을 한번에 사용할 수 있게함.
 * @GetMapping : HTTP Method Get요청을 받을 수 있도록 함.
 * */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
