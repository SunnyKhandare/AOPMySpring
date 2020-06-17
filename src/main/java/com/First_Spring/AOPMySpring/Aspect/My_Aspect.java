package com.First_Spring.AOPMySpring.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class My_Aspect {

    @Before( "execution(* com.First_Spring.AOPMySpring..*.*(..))" )
    public void before_interception( JoinPoint joinPoint ){

        System.out.println( "from before Here " + joinPoint );
    }


}
