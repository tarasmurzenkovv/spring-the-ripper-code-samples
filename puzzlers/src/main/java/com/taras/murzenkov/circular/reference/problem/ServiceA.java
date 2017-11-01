package com.taras.murzenkov.circular.reference.problem;

import org.springframework.stereotype.Service;

@Service("serviceA")
public class ServiceA {
    private final ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
