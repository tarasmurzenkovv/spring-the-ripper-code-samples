package com.taras.murzenkov.service;

import com.taras.murzenkov.annotations.InjectRandomInt;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Random;

import static org.springframework.util.ReflectionUtils.setField;

@Service
public class InjectRandomIntBeanPostProcessor implements BeanPostProcessor {
    private final Random random = new Random();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        final Field[] declaredFields = bean.getClass().getDeclaredFields();
        Arrays.stream(declaredFields).forEach(field -> {
            final InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (null != annotation) {
                injectRandomIntInField(bean, field, annotation);
            }
        });
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    private void injectRandomIntInField(Object bean, Field field, InjectRandomInt annotation) {
        final int min = annotation.min();
        final int max = annotation.max();
        final int i = random.nextInt(max - min) + min;
        field.setAccessible(true);
        setField(field, bean, i);
    }
}
