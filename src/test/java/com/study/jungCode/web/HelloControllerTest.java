package com.study.jungCode.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/*
 * @RunWith(SpringRunner.class)
 *  - 테스트 진행시에 JUnit에 내장된 실행자 외에 다른 실행자를 실행(SpringRunner 실행자)
 *  - 스프링부트 테스트와 JUnit 사이의 연결자 역할
 * @WebMvcTest
 *  - 스프링에서 제공하는 어노테이션, Web(SpringMVC)에 집중할 수 있는 어노테이션
 *  - @Controller,@ControllerAdvice 등의 어노테이션을 사용할 수 있게함.
 *  - BUT!!! @Service, @Component, @Repository 등은 사용 불가
 * @AutoWired
 *  - Bean 주입받도록 해주는 어노테이션
 * */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void returnHelloTest() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello")) //MockMvc를 통해 HTTP Get 요청을 보냄,Method Chaining 지원되므로 여러 검증을 이어서 선언 가능
                .andExpect(status().isOk()) //HTTP Header의 Status를 검증(200,404,500 ~~~)
                .andExpect(content().string(hello)); //응답 본문 내용(content) 검증
    }

}
