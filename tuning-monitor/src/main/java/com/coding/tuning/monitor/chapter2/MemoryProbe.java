package com.coding.tuning.monitor.chapter2;

public class MemoryProbe {

    /*
    -Xms1024m -Xmx1024m -XX:+PrintGCDetails
     */
    public static void main(String[] args) {
        // 返回虚拟机试图使用的最大内存，单位：字节
        long max = Runtime.getRuntime().maxMemory();
        // 返回jvm的总内存
        long total = Runtime.getRuntime().totalMemory();

        // 默认情况下：分配的总内存，是电脑内存的：1/4，而初始化内存：1/64
        System.out.printf("max=%s 字节，大约 %s MB%n", max, max / (double) 1024 / 1024);
        System.out.printf("total=%s 字节，大约 %s MB%n", total, total / (double) 1024 / 1024);
    }
}
