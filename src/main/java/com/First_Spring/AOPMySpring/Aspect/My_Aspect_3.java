package com.First_Spring.AOPMySpring.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class My_Aspect_3 {

    @Around( "@annotation(com.First_Spring.AOPMySpring.Aspect.TrackTime)" )
    public void around_advice( ProceedingJoinPoint joinPoint ) throws Throwable {

        long start_time = System.currentTimeMillis();
        joinPoint.proceed();
        long end_time = System.currentTimeMillis();

        System.out.println( joinPoint + " has taken " + ( end_time - start_time ) + " miliseconds to complete " );
    }


}
