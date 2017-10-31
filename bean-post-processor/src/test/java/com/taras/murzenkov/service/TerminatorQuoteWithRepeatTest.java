package com.taras.murzenkov.service;

import com.taras.murzenkov.model.TerminatorQuoteWithRepeat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TerminatorQuoteWithRepeatTest {
    private AnnotationConfigApplicationContext configContextLoader = new AnnotationConfigApplicationContext();

    @Before
    public void init() {
        configContextLoader.scan("com.taras.murzenkov");
    }

    @Test
    public void shouldInjectValueInTheProperBoundaries() {
        configContextLoader.refresh();
        TerminatorQuoteWithRepeat sut = configContextLoader.getBean(TerminatorQuoteWithRepeat.class);
        final int numbersToRepeat = sut.getNumbersToRepeat();
        Assert.assertTrue("The random value must be less than 7", (numbersToRepeat < 7));
        Assert.assertTrue("The random value must be greater than 1", (numbersToRepeat > 1));
    }
}
