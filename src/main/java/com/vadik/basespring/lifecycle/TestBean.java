package com.vadik.basespring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TestBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware {
    public TestBean() {
        System.out.println("-> CONSTRUCTOR");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("-> POST CONSTRUCT");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("-> PRE DESTROY");
    }

    @EventListener
    private void event(ContextRefreshedEvent e) {
        System.out.println("-> CONTEXT REFRESHED");
    }

    @EventListener
    private void event(ContextClosedEvent e) {
        System.out.println("-> CONTEXT CLOSED");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("-> AFTER PROPERTIES SET");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("-> DESTROY");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("-> BEAN NAME AWARE " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("-> BEAN FACTORY AWARE " + beanFactory.toString());
    }
}
