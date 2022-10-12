package com.chadcover.springdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SpringDemoLoggingAspect {

//    @Before("execution(public void com.chadcover.springdemo.dao.AccountDAO.addAccount(..))")
//    public void beforeAddAccountMethodAdvice() {
//        System.out.println("\n------------------------------------------------------------------");
//        System.out.println("Executing @Before on com.chadcover.springdemo.dao.AddAccount.addAccount(com.chadcover.springdemo.Account,..) method!");
//    }

//    @After("execution(public void add*())")
//    public void afterAddMethodAdvice() {
//        System.out.println("Executing @After on add*() method!");
//        System.out.println("------------------------------------------------------------------");
//    }

    @After("execution(public * com.chadcover.springdemo.dao.*.*(..))")
    public void afterDAOMethodsAdvice() {
        System.out.println("Executing @After on any method in com.chadcover.springdemo.dao!");
        System.out.println("------------------------------------------------------------------");
    }

//    @Before("execution(public int add*(..))")
//    public void beforeAddMethodReturnIntAdvice() {
//        System.out.println("Executing @Before on an add*(param1, param2) method that returns an integer!");
//        System.out.println("*****************************************************************");
//    }
//
//    @Before("execution(public int square*(*))")
//    public void beforeSquareMethodAdvice() {
//        System.out.println("Executing @Before on a square(number1) method that returns an integer!");
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//    }

}
