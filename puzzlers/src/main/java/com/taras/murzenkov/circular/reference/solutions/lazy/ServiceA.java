package com.taras.murzenkov.circular.reference.solutions.lazy;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    private final ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
