package model;

import annotations.InjectRandomInt;
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
