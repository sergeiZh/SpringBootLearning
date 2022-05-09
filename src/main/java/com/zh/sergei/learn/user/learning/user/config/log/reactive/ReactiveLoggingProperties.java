package com.zh.sergei.learn.user.learning.user.config.log.reactive;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.logging.reactive")
@ConditionalOnProperty(name = "app.logging.type", havingValue = "reactive")
@ConstructorBinding
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ReactiveLoggingProperties {

    String format;

    String type;
}
