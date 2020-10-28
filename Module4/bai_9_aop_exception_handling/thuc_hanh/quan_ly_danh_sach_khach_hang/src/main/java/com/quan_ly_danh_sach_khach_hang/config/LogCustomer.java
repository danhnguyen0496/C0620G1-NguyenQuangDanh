package com.quan_ly_danh_sach_khach_hang.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;


@Aspect
public class LogCustomer {

    @AfterThrowing(pointcut = "execution(public * com.quan_ly_danh_sach_khach_hang.service.CustomerService.*(..))", throwing = "e")
    public void logError(JoinPoint joinPoint, Exception e) {
//        String className = joinPoint.getClass().getSimpleName();
        String className =joinPoint.getTarget().getClass().getSimpleName();
        String returnType = joinPoint.getSignature().getDeclaringType().getName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("Chu choa moa oi, loi roi kia mua nguoi!! %s.%s.%s.%s: %s",
                className, returnType, methodName, argsName, e.getMessage());
    }

}
