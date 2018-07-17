package block2.Homework_game;

import java.util.Scanner;

/**
 * Created by Ruslan on 09.07.2018.
 */
public class Controller {
    private Model model = new Model();
    private Scanner scanner = new Scanner(System.in);

    void execute() {
        model.rand();
        View.getMessage(View.FIRST_ENTER_NUMBER + " (" + model.getMin() + ", " + model.getMax() + ")");
        checkNumber(inputNumber());
    }

    int inputNumber() {
        while (!scanner.hasNextInt()) {
            View.getMessage(View.NOT_INT + View.REPEAT_PLEASE);
            scanner.nextInt();
        }
        return scanner.nextInt();
    }

    void checkNumber(int number) {
        if (number == model.getCrypticNumber()) {
            inApple(number);
            return;
        } else if (number >= model.getMax() || number <= model.getMin()) {
            outOfRanges(number);
        } else oneMoreTry(number);
    }

    private void oneMoreTry(int number) {
        model.changeRanges(number);
        model.attemptsString(number);
        View.getMessage(model.getResult());
        View.getMessage(View.NEXT_ENTER_NUMBER + " (" + model.getMin() + ", " + model.getMax() + ")");
        checkNumber(inputNumber());
    }

    private void outOfRanges(int number) {
        View.getMessage(View.INCORRECT_NUMBER + " (" + model.getMin() + ", " + model.getMax() + ")"
                + View.REPEAT_PLEASE);
        model.attemptsString(number);
        View.getMessage(model.getResult());
        checkNumber(inputNumber());
    }

    private void inApple(int number) {
        model.attemptsString(number);
        View.getMessage(model.getResult());
        View.getMessage(View.FINAL_RESULT + model.getCrypticNumber());
    }
}
