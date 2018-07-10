package block2.Homework_game.NotFinished;

/**
 * Created by Ruslan on 09.07.2018.
 */
public class Model {
    private int min;
    private int max;
    private int crypticNumber;
    private String result = "";

    public int rand(int min, int max) {
        setMin(min);
        setMax(max);
        setCrypticNumber((int) (Math.random() * (getMax() - getMin()) + getMin()));
        return getCrypticNumber();
    }

    public void changeRanges(int number) {
        setMin(min);
        setMax(max);
        if (number < getCrypticNumber()) {
            setMin(number);
        } else setMax(number);
    }

    public String attemptsString(int number) {
        setResult(number + " ");
        return getResult();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCrypticNumber() {
        return crypticNumber;
    }

    public void setCrypticNumber(int crypticNumber) {
        this.crypticNumber = crypticNumber;
    }
}
