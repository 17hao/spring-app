package xyz.shiqihao.example_02;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut("execution(* xyz.shiqihao.example_02.*.* (..))")
    public void inExample_02() {

    }

    @Before("inExample_02()")
    public void addLog() {
        System.out.println("Add log before execution.");
    }
}
