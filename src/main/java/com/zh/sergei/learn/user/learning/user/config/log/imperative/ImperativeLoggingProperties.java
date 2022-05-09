package com.zh.sergei.learn.user.learning.user.config.log.imperative;

import com.zh.sergei.learn.user.learning.user.config.aop.ImperativeLoggingEnabledBean;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.logging.imperative")
@ConditionalOnBean(ImperativeLoggingEnabledBean.class)
public class ImperativeLoggingProperties {

    private String format;

    private String type;
}
