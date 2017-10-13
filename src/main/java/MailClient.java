import javax.mail.Message;
import java.util.List;

public interface MailClient {

    /**
     * Login user in the mail service
     * @throws Exception
     */
    void log_in() throws Exception;

    /**
     * Logout user from the mail service
     * @throws Exception
     */
    void log_out() throws Exception;

    /**
     * Allows get mails in spam
     * @param numberOfMails
     * @return
     */
    List<Message> get_spam_mail(int numberOfMails);

    /**
     * Allows get new mail
     * @return
     */
    List<Message> get_new_mail();
}
