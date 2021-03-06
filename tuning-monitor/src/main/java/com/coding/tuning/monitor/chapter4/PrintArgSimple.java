package com.coding.tuning.monitor.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

@BTrace
public class PrintArgSimple {

    @OnMethod(
            clazz = "com.coding.tuning.monitor.chapter4.Ch4Controller",
            method = "arg1",
            location = @Location(Kind.ENTRY))
    public static void anyRead(
            @ProbeClassName String pcn, @ProbeMethodName String pmn, AnyType[] args) {
        BTraceUtils.printArray(args);
        BTraceUtils.println(pcn + "," + pmn);
        BTraceUtils.println();
    }
}
