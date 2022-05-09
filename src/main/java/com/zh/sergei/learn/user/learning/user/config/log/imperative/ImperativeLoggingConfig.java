package com.zh.sergei.learn.user.learning.user.config.log.imperative;

import com.zh.sergei.learn.user.learning.user.config.aop.ImperativeLoggingAspectConfig;
import com.zh.sergei.learn.user.learning.user.config.aop.ImperativeLoggingEnabledBean;
import com.zh.sergei.learn.user.learning.user.config.log.AppLogger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@EnableConfigurationProperties(ImperativeLoggingProperties.class)
@ConditionalOnBean(ImperativeLoggingEnabledBean.class)
public class ImperativeLoggingConfig {

    @Bean
    public AppLogger getImperativeLogger() {
        return new ImperativeLogger();
    }

    @Bean()
    public ImperativeLoggingAspectConfig imperativeLoggingAspectConfig() {
        return new ImperativeLoggingAspectConfig(getImperativeLogger());
    }
}
