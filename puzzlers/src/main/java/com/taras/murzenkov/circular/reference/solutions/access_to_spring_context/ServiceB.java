package com.taras.murzenkov.circular.reference.solutions.access_to_spring_context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    @Autowired
    private ServiceA serviceA;

    public ServiceA getServiceA() {
        return serviceA;
    }
}
