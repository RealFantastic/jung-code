package com.study.jungCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 이 프로젝트의 메인 클래스
 * @SpringBootApplication => 스프링 부트의 자동설정, 스프링 Bean 읽기,생성을 자동으로 할 수 있음.
 * 해당 위치부터 설정을 읽어가기 때문에 항상 프로젝트 최상단에 위치해야함.
 * SpringBoot에서 내장 WAS 사용을 권장하는 이유 : 언제 어디서나 같은 환경에서 스프링부트를 배포할 수 있음
 * */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //내장 WAS 실행 -> 항상 서버에 Tomcat을 설치할 필요 X 스프링 부트로 만들어진 Jar파일로 실행하면 끝!
    }
}
