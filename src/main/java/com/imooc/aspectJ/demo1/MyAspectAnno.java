package com.imooc.aspectJ.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 */
@Aspect
public class MyAspectAnno {

    //前置通知
    @Before(value = "myPointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知*******************"+joinPoint);
    }

    //后置通知
    @AfterReturning(value = "execution(* com.imooc.aspectJ.demo1.ProductDao.update(..))",returning = "result")
    public void afterReturning(Object result){
        System.out.println("后置通知***********************"+result);
    }

    //环绕通知
    @Around(value = "execution(* com.imooc.aspectJ.demo1.ProductDao.delete(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前置通知*********************");
        //执行目标方法
        Object o = proceedingJoinPoint.proceed();
        System.out.println("环绕后置通知*********************");
        return o;
    }

    @Pointcut(value = "execution(* com.imooc.aspectJ.demo1.ProductDao.save(..))")
    private void myPointcut(){
    }

}

