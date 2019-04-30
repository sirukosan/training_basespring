package com.vadik.basespring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (!beanName.equals("testBean")) {
            return bean;
        }

        System.out.println("-> BEFORE initialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (!beanName.equals("testBean")) {
            return bean;
        }

        System.out.println("-> AFTER initialization");
        return bean;
    }
}
