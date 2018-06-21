package com.zjh.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by jiazhao on 4/3/18.
 */

@Aspect
@Component
public class AspectConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(AspectConfiguration.class);
    
    @Pointcut("execution(* com.zjh.controller.*.*(..))")
    private void pointCut(){

    }

    @Before("pointCut()")
    public void beforeRun(JoinPoint joinPoint){
        LOGGER.info("********Before method " + joinPoint.getSignature().getName()+ "running*********");
        LOGGER.info("target : " + joinPoint.getTarget());
    }

    @After(value = "pointCut()")
    public void afterRun(JoinPoint joinPoint){
        LOGGER.info("********After method running*********");
        LOGGER.info("args : " + joinPoint.getArgs());
    }

}
