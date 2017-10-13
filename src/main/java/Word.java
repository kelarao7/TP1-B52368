public class Word {
    /**
     * The word itsef
     */
    private String name;

    /**
     * The frequency
     */
    private double frequency;

    /**
     * The probability
     */
    private double probability;

    /**
     *
     * @param name
     */
    public Word(String name){
        this.name = name;
        this.frequency = 0;
        this.probability = 0;
    }

    /**
     *
     * @param name
     * @param frequency
     * @param probability
     */
    public Word(String name, double frequency, double probability){
        this.name = name;
        this.frequency = frequency;
        this.probability = probability;
    }

    /**
     *
     * @return
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public double getProbability() {
        return probability;
    }

    /**
     *
     * @param frequency
     */
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    /**
     *
     * @param probability
     */
    public void setProbability(double probability) {
        this.probability = probability;
    }
}
