package com.coding.tuning.slf4j;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Logback 的使用 */
public class UseLogback {
    private static final Logger log = LoggerFactory.getLogger(UseLogback.class);

    /** 支持占位符 */
    private static void log() {
        log.info("this is slf4j + logback: [{}]", UseLogback.class.getName());
    }

    private static void levelLog() {
        log.trace("slf4j + logback: [{}]", "trace");
        log.debug("slf4j + logback: [{}]", "debug");
        log.info("slf4j + logback: [{}]", "info");
        log.warn("slf4j + logback: [{}]", "warn");
        log.error("slf4j + logback: [{}]", "error");
    }

    /** 打印 Logback 的内部状态 */
    private static void printLogbackStatus() {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
    }

    public static void main(String[] args) {
        //        log();
        levelLog();

        //        printLogbackStatus();
    }
}
