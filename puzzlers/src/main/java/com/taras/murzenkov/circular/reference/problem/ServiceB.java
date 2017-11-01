package com.taras.murzenkov.circular.reference.problem;

import org.springframework.stereotype.Service;

@Service("serviceB")
public class ServiceB {
    private final ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
