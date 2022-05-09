package com.zh.sergei.learn.user.learning.user.config.log.reactive;

import com.zh.sergei.learn.user.learning.user.config.log.AppLogger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReactiveLogger implements AppLogger {

    @Override
    public void log() {
      log.info("Reactive logging");
    }
}
