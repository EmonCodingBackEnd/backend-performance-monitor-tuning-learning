package com.coding.tuning.slf4j;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UseLombokToLog {

    public static void main(String[] args) {
        log.info("use lombok to log: [{}]", UseLogback.class.getName());
    }
}
