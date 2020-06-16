package com.First_Spring.AOPMySpring.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
//@Configuration
public class My_Aspect {

    @Before( "execution(* com.First_Spring.AOPMySpring.Business.*.*(..))" )
    public void before_interception(){

        System.out.println( "Interception Here" );
    }
}
