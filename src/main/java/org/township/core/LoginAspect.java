package org.township.core;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoginAspect {

    @Pointcut("execution(* org.township.controller.TestController.test(..) )")
    public void login() {

    }

    @Around("login()")
    public void checkSession(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("this is Aspect");
    }

    @Bean
    public LoginAspect getLoginAspect() {
       return  new LoginAspect();
    }
}
