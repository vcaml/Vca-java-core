package com.example.srpingcorerush.aop.aspectannotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AspectDemo{

    @Around("execution(* com.example.srpingcorerush.controller.TestController.*(..))")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("获取方法名称:"+methodName);

        System.out.println("方式执行前置处理");

        Object result = pjp.proceed();

        System.out.println("方式执行后置处理");

        return  modifyResult(result);
    }

    private Object modifyResult(Object result) {
        // 在这里可以对目标方法的返回值进行修改
        if (result instanceof String) {
            result = result + "--AOP around中对目标方法的返回值进行修改";
        }

        return result;
    }

}
