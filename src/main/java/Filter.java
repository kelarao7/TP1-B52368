import javax.mail.Message;
import java.util.ArrayList;
import java.util.List;

public class Filter {
    /**
     *
     */
    private double spamProbability;

    /**
     *
     */
    private double spamThreshold;

    /**
     *
     */
    private int trainingSize;

    /**
     *
     */
    private List<Word> words;

    /**
     *
     */
    private int totalWordsAnalyzed;

    /**
     *
     */
    private boolean trained;

    /**
     *
     */
    public Filter(){
        this.spamProbability = 0.3;
        this.spamThreshold = 0.9;
        this.trainingSize = 50;
        this.words = new ArrayList<>();
        this.totalWordsAnalyzed = 0;
        this.trained = false;
    }

    /**
     *
     * @return
     */
    public double getSpamProbability() {
        return spamProbability;
    }

    /**
     *
     * @return
     */
    public double getSpamThreshold() {
        return spamThreshold;
    }

    /**
     *
     * @return
     */
    public int getTrainingSize() {
        return trainingSize;
    }

    /**
     *
     * @param spamProbability
     */
    public void setSpamProbability(double spamProbability) {
        this.spamProbability = spamProbability;
    }

    /**
     *
     * @param spamThreshold
     */
    public void setSpamThreshold(double spamThreshold) {
        this.spamThreshold = spamThreshold;
    }

    /**
     *
     * @param trainingSize
     */
    public void setTrainingSize(int trainingSize) {
        this.trainingSize = trainingSize;
    }

    /**
     *
     * @return
     */
    public boolean isTrained() {
        return trained;
    }

    /**
     *
     * @return
     */
    public int getTotalWordsAnalyzed() {
        return totalWordsAnalyzed;
    }

    /**
     *
     * @return
     */
    public List<Word> getWords() {
        return words;
    }

    /**
     *
     * @param totalWordsAnalyzed
     */
    public void setTotalWordsAnalyzed(int totalWordsAnalyzed) {
        this.totalWordsAnalyzed = totalWordsAnalyzed;
    }

    /**
     *
     * @param trained
     */
    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    /**
     *
     */
    void bayesianSpamFilter(List<Message> msgs){
        this.setTrained(true);
    }


}
