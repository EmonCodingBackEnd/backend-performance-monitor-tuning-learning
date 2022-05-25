package com.coding.tuning.monitor.chapter4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ch4Controller {

    @RequestMapping("/ch4/arg1")
    public String arg1(@RequestParam("name") String name) {
        return "hello," + name;
    }
}
