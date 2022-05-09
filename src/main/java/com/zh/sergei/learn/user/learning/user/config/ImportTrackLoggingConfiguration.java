package com.zh.sergei.learn.user.learning.user.config;

import com.zh.sergei.learn.user.learning.user.config.log.imperative.ImperativeLoggingConfig;
import com.zh.sergei.learn.user.learning.user.config.log.reactive.ReactiveLoggingConfig;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Optional;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ImportTrackLoggingConfiguration implements ImportSelector {

    Environment environment;

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return Optional.ofNullable(environment.getProperty("app.logging.type"))
                       .map(loggingType -> {
                           if (loggingType.equals("imperative")) {
                               return new String[]{ImperativeLoggingConfig.class.getName()};
                           }
                           return new String[]{ReactiveLoggingConfig.class.getName()};
                       })
                       .orElse(new String[]{ImperativeLoggingConfig.class.getName()});
    }
}
