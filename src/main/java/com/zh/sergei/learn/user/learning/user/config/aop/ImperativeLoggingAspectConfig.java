package com.zh.sergei.learn.user.learning.user.config.aop;

import com.zh.sergei.learn.user.learning.user.annotation.LogTracking;
import com.zh.sergei.learn.user.learning.user.config.log.AppLogger;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

@ConditionalOnBean(ImperativeLoggingEnabledBean.class)
@Aspect
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ImperativeLoggingAspectConfig {

    AppLogger appLogger;

//    @Before("methodAnnotatedWithTrackLogging(trackLogging)")
//    public void addLoggingToAnnotatedMethods(TrackLogging trackLogging) {
//        log.info("Before method processing");
//    }

    @Around("methodAnnotatedWithTrackLogging(logTracking)")
    public void addLoggingToAnnotatedMethods(ProceedingJoinPoint joinPoint, LogTracking logTracking) {
        appLogger.log();
        String classSimpleName = joinPoint.getTarget().getClass().getSimpleName();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        appLogger.log();
    }

    @Pointcut("execution(* getUserInfo(..))")
    public void methodExecutionPointcut(){}

    @Pointcut(value = "@annotation(logTracking)")
    public void methodAnnotatedWithTrackLogging(LogTracking logTracking){}
}
