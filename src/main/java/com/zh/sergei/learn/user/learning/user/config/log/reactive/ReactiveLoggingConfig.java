package com.zh.sergei.learn.user.learning.user.config.log.reactive;

import com.zh.sergei.learn.user.learning.user.config.log.imperative.ImperativeLoggingProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ConditionalOnProperty(name = "app.logging.type", havingValue = "reactive")
@EnableConfigurationProperties(ReactiveLoggingProperties.class)
public class ReactiveLoggingConfig {


}
