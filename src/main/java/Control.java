import javax.mail.Message;
import java.util.Iterator;
import java.util.List;

public class Control {
    /**
     *
     */
    private MailClient mailClient;

    /**
     *
     */
    private Filter filter;

    /**
     *
     */
    public Control(){
        this.mailClient = new Gmail();
        this.filter = new Filter();
    }

    void show_data(){
        List<Word> wordList = this.filter.getWords();
        Iterator<Word> ite = wordList.iterator();
        while(ite.hasNext()){
            //
        }
    }

    void train_filter(){
        List<Message> msgs = this.mailClient.get_spam_mail(this.filter.getTrainingSize());
        this.filter.bayesianSpamFilter(msgs);
    }

    void get_new_mail(){
        if (this.filter.isTrained()){
            List<Message> msgs =this.mailClient.get_new_mail();

        }
    }
}
