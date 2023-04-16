package com.legacy.gamesvc.common.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.legacy.gamesvc.common.config
 * fileName       : CommonAspect
 * author         : jbkim
 * date           : 2023-04-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-16        jbkim       최초 생성
 */
@Aspect
@Component
public class CommonAspect {

    @Pointcut("execution(* com.legacy.gamesvc(..))")
    public void executeMethod() {};

    @Before("executeMethod()")
    public void beforeExecuteMethod(JoinPoint joinPoint) {
        // AOP가 적용될 메소드 호출 전에 실행될 로직을 작성
    }

    @After("executeMethod()")
    public void afterExecuteMethod(JoinPoint joinPoint) {
        // AOP가 적용될 메소드 호출 후에 실행될 로직을 작성
    }

    @Around("executeMethod()")
    public Object aroundExecuteMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // AOP가 적용될 메소드 호출 전후에 실행될 로직을 작성
        return proceedingJoinPoint.proceed();
    }
}
