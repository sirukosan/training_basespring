package com.vadik.basespring.aop;

import org.springframework.stereotype.Component;

@Component
public class AspectTestBean {
    public void doSomething() {
        System.out.println("-> calling AspectTestBean#doSomething()");
    }
}
