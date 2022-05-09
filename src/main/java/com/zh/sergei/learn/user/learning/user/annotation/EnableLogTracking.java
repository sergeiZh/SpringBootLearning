package com.zh.sergei.learn.user.learning.user.annotation;

import com.zh.sergei.learn.user.learning.user.config.ImportTrackLoggingConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(ImportTrackLoggingConfiguration.class)
public @interface EnableLogTracking {
}
