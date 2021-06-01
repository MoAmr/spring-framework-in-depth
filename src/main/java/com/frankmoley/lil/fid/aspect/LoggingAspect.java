package com.frankmoley.lil.fid.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Mohammed Amr
 * @created 01/06/2021 - 13:40
 * @project spring-framework-in-depth
 */

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("@annotation(Loggable)")
    public void executeLogging() {

    }
}
