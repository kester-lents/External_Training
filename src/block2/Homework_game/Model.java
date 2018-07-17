package block2.Homework_game;

/**
 * Created by Ruslan on 09.07.2018.
 */
public class Model {
    private int min = 0;
    private int max = 100;
    private int crypticNumber;
    private String result = "";

    public int rand() {
        setCrypticNumber((int) (Math.random() * (getMax() - getMin()) + getMin()));
        System.out.println(getCrypticNumber());
        return getCrypticNumber();
    }

    public void changeRanges(int number) {
        if (number < getCrypticNumber()) {
            setMin(number);
        } else if (number > getCrypticNumber()) {
            setMax(number);
        }
    }

    public String attemptsString(int number) {
        setResult(getResult() + number + " ");
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
