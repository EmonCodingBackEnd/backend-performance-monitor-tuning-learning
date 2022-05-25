package com.coding.tuning.monitor.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
 * 如何导出内存映像文件
 *
 * 内存溢出自动导出
 * -XX:+HeapDumpOnOutOfMemoryError
 * -XX:HeapDumpPath=./
 *
 * 使用jmap命令手动导出
 * $ jmap -dump:format=b,file=1504.hprof 1504
 */
@RestController
public class MemoryController {

    private final List<User> userList = new ArrayList<>();
    private final List<Class<?>> classList = new ArrayList<>();

    /**
     * -Xmx32M -Xms32M
     *
     * <p>-Xmx32M -Xms32M -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./
     *
     * <p>java.lang.OutOfMemoryError: Java heap space
     *
     * @return
     */
    @GetMapping("/heap")
    public String heap() {
        int i = 0;
        while (true) {
            userList.add(new User(i++, UUID.randomUUID().toString()));
        }
    }

    /**
     * -XX:MetaspaceSize=32M -XX:MaxMetaspaceSize=32M
     *
     * <p>java.lang.OutOfMemoryError: Metaspace
     *
     * @return
     */
    @GetMapping("/nonheap")
    public String nonheap() {
        while (true) {
            classList.addAll(Metaspace.createClasses());
        }
    }
}
