package com.coding.tuning.monitor.chapter2;

import java.util.ArrayList;

public class MemoryProbeJProfile {

    // 1 MB
    byte[] array = new byte[1024 * 1024];

    /*
    -Xmx32M -Xms32M -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./
     */
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        int count = 0;

        try {
            while (true) {
                list.add(new MemoryProbeJProfile());
                count = count + 1;
            }
        } catch (Error e) {
            System.out.println("count:" + count);
            e.printStackTrace();
        }
    }
}
