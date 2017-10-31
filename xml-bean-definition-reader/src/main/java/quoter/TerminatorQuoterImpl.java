package quoter;

/**
 * Implementation of the {@link Quoter}.
 *
 * @author Taras_Murzenkov
 */
public class TerminatorQuoterImpl implements Quoter {
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getQuote() {
        return message;
    }
}
