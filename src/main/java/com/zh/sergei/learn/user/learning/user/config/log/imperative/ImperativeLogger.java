package com.zh.sergei.learn.user.learning.user.config.log.imperative;

import com.zh.sergei.learn.user.learning.user.config.log.AppLogger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImperativeLogger implements AppLogger {

    @Override
    public void log() {
        log.info("Imperative logging");
    }
}
