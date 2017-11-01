package com.taras.murzenkov.circular.reference.solutions.postconstruct;

import org.springframework.stereotype.Service;

@Service("serviceASolutionPostConstruct")
public class ServiceA {
    private ServiceB serviceB;

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
