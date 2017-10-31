package service;

import model.TerminatorQuoteWithRepeat;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TerminatorQuoteWithRepeatTest {
    private AnnotationConfigApplicationContext configContextLoader = new AnnotationConfigApplicationContext();


    @Test
    public void shouldInjectValueInTheProperBoundaries() {
        configContextLoader.refresh();
        TerminatorQuoteWithRepeat sut = configContextLoader.getBean(TerminatorQuoteWithRepeat.class);
        final int numbersToRepeat = sut.getNumbersToRepeat();
        System.out.println(numbersToRepeat);
    }
}
