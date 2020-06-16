package com.example.feign;

import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHystric
 * @Description:
 * @Author wl.lw
 * @Date 2020/3/30 17:02
 * @Version 1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne() {
        return "sorry ";
    }
}

