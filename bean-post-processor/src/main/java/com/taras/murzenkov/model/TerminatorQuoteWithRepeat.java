package com.taras.murzenkov.model;

import com.taras.murzenkov.annotations.InjectRandomInt;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import quoter.TerminatorQuoterImpl;

@Component
public class TerminatorQuoteWithRepeat extends TerminatorQuoterImpl {
    @InjectRandomInt(min = 2, max = 7)
    private int numbersToRepeat;

    public int getNumbersToRepeat() {
        return numbersToRepeat;
    }
}
