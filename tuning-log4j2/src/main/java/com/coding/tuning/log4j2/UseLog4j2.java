package com.coding.tuning.log4j2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** 使用 log4j2 */
public class UseLog4j2 {
    private static final Log log = LogFactory.getLog(UseLog4j2.class);

    private static final Logger log2 = LogManager.getLogger(UseLog4j2.class);

    /**
     * 这样做有什么好处？
     * 子类可以直接使用
     */
    protected final Log log3 = LogFactory.getLog(getClass());

    /** log4j2 支持占位符，jcl 不支持 */
    public static void placeholder() {
        log2.info("use placeholder, not:[{}]", "abcde");
    }

    /** 打印异常栈 */
    public static void logWithException() {
        try {
            System.out.println(Integer.parseInt("a"));
        } catch (NumberFormatException e) {
            log2.error("parse int has some error", e);
        }
    }

    public static void main(String[] args) {
        /*log.error("use jcl + log4j2 to log");
        log.info("use jcl + log4j2 to log");

        log2.error("use log4j2 to log");
        log2.info("use log4j2 to log");*/

        //        placeholder();

        logWithException();
    }
}
