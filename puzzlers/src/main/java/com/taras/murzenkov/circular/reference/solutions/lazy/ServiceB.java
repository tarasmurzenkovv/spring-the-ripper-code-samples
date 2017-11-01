package com.taras.murzenkov.circular.reference.solutions.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private final ServiceB serviceB;

    public ServiceB(@Lazy ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
