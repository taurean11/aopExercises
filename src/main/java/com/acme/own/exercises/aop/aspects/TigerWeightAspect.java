package com.acme.own.exercises.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TigerWeightAspect {

    private static Logger logger = LoggerFactory.getLogger(TigerWeightAspect.class);
    
    @Around("execution=(double com.acme.own.exercises.aop.domain.Tiger.getWeightAtAge(*))")
    public Object correctTigerAge(ProceedingJoinPoint joinPoint) {
        
        logger.info("stepped into the aspect method");
        
        Double ret=0d;
        
        try {
            ret = (Double)joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        
        logger.info("after the proceed method");
        
        return ret;
    }
}
