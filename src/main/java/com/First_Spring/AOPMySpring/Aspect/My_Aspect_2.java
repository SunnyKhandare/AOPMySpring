package com.First_Spring.AOPMySpring.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class My_Aspect_2 {

    @After( "execution(* com.First_Spring.AOPMySpring.Business.*.*(..))" )
    public void after( JoinPoint joinPoint ){

        System.out.println( "from after Here - " + joinPoint );
    }

    @AfterReturning( value = "execution(* com.First_Spring.AOPMySpring.Data.*.*(..))" , returning = "return_value")
    public void after_returning( JoinPoint joinPoint , Object return_value ){

        System.out.println( "from after_returning - " + joinPoint + " has returned " + return_value );
    }

    @AfterThrowing( value = "execution(* com.First_Spring.AOPMySpring.Data.*.*(..))" , throwing = "exception")
    public void after_throwing( JoinPoint joinPoint , Exception exception ){

        System.out.println( " from after_throwing " + joinPoint + " has thrown an " + exception );
    }
}
