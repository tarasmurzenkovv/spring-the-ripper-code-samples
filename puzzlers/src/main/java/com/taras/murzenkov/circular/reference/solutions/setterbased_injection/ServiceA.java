package com.taras.murzenkov.circular.reference.solutions.setterbased_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceASetterBasedInjection")
public class ServiceA {
    private ServiceB serviceB;

    @Autowired
    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public ServiceB getServiceB() {
        return serviceB;
    }
}
