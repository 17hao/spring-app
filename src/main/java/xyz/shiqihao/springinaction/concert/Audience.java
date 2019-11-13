package xyz.shiqihao.springinaction.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import javax.inject.Inject;

@Aspect
class Audience {

    @Before("execution(** concert.Performance.performance(..))")
    void silenceCellphone() {
        System.out.println("Silence Cellphone");
    }

    @Inject
    Audience() {

    }
}
