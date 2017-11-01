package com.taras.murzenkov.circular.reference.solutions.access_to_spring_context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class ServiceA implements ApplicationContextAware, InitializingBean {
    private ApplicationContext context;
    private ServiceB serviceB;

    @Override
    public void afterPropertiesSet() {
        this.serviceB = context.getBean(ServiceB.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
