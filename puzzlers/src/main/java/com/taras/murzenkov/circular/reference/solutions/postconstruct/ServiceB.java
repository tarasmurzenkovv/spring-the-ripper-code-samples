package com.taras.murzenkov.circular.reference.solutions.postconstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ServiceB {
    @Autowired
    private ServiceA serviceA;

    public ServiceA getServiceA() {
        return serviceA;
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @PostConstruct
    public void init(){
        this.serviceA.setServiceB(this);
    }
}
