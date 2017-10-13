import javax.mail.Message;
import java.util.List;

public class Gmail implements MailClient {

    @Override
    public List<Message> get_new_mail() {
        return null;
    }

    @Override
    public List<Message> get_spam_mail(int numberOfMails) {
        return null;
    }

    @Override
    public void log_in() throws Exception {

    }

    @Override
    public void log_out() throws Exception {

    }
}
