package com.coding.tuning.log4j2;

/** 子类使用 getClass 不需要修改代码 */
public class SubUseLog4j2 extends UseLog4j2 {

    private void printLog() {
        log3.info("print log in sub");
    }

    public static void main(String[] args) {
        new SubUseLog4j2().printLog();
    }
}
