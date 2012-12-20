package com.acme.own.exercises.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WeightAspects {

    private static Logger logger = LoggerFactory.getLogger(WeightAspects.class);

    @Around("execution(Double com.acme.own.exercises.aop.domain.Tiger.getWeightAtAge(*))")
    public Object correctTigerAge(ProceedingJoinPoint joinPoint) {
        logger.info("stepped into the aspect method");
        Double ret = 0d;

        try {
            ret = (Double) joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        if (ret > 60) {
            ret = 60d;
        }

        logger.info("after the proceed method");
        return ret;
    }

    @Around("execution(Double com.acme.own.exercises.aop.domain.Harcsa.getWeightAtAge(Double))")
    public Object correctHarcsaAge(ProceedingJoinPoint joinPoint) {
        Double ret = 0d;

        Object[] args = joinPoint.getArgs();
        Double age = (Double) args[0];

        if (age > 20d) {
            ret = 50d;
        } else {
            try {
                ret = (Double) joinPoint.proceed();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

        return ret;
    }
}
