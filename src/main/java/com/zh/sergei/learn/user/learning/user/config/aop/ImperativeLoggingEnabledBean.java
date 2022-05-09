package com.zh.sergei.learn.user.learning.user.config.aop;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.logging.type", havingValue = "imperative")
public class ImperativeLoggingEnabledBean {
}
