package com.imooc.aspectJ.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 */
public class MyAspectJXml {

    //前置通知
    public void before(JoinPoint joinPoint){
        System.out.println("xml前置通知**********"+joinPoint);
    }

    //后置通知
    public void afterReturning(Object object){
        System.out.println("xml后置通知"+object);
    }

    //环绕通知
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("xml环绕通知");
        //执行目标方法
        Object object = proceedingJoinPoint.proceed();
        System.out.println("xml环绕通知******");
        return object;
    }

    //异常通知
    public void afterThrowing(Throwable e){
        System.out.println("xml异常通知"+e.getMessage());
    }

    //最终通知
    public void after(){
        System.out.println("xml最终通知");
    }
}
