package com.zjh.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by jiazhao on 5/29/18.
 */

@Aspect
@Component
public class RestfulAspectConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestfulAspectConfiguration.class);

    @Pointcut("@annotation(javax.ws.rs.Path)")
    private void pointCut(){}

    @Before("pointCut()")
    public void beforeRestfulCall(JoinPoint joinPoint){
        LOGGER.info("*********Restful Service called***********");
        LOGGER.info("Service name:" + joinPoint.toLongString() + "with parameters:" + joinPoint.getArgs().toString());
    }
}
