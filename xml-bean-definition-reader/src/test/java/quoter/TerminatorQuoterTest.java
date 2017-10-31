package quoter;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TerminatorQuoterTest {
    private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    private TerminatorQuoterImpl sut = context.getBean(TerminatorQuoterImpl.class);

    @Test
    public void shouldInjectTheProperMessage() {
        final String expectedMessage = "I'll be back";
        final String actualQuote = sut.getQuote();
        Assert.assertEquals(expectedMessage, actualQuote);
    }
}
