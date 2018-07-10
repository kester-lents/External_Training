package block2.Homework_game.NotFinished;

import java.util.Scanner;

/**
 * Created by Ruslan on 09.07.2018.
 */
public class Controller {
    private Model model = new Model();
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    Scanner scanner = new Scanner(System.in);

    void execute() {
        model.rand(0,100);
        view.getMessage(view.getFirstEnterNumberMessage());
        checkNumber(isInteger());
    }

    int isInteger() {
        while (!scanner.hasNextInt()) {
            view.getMessage(view.getNotInt());
            scanner.nextInt();
        }
        return scanner.nextInt();
    }

    void checkNumber(int number) {
        if (number == model.getCrypticNumber()) {
            model.attemptsString(number);
            view.getMessage(model.getResult());
            view.getMessage(view.getFinalMessage());
            return;
        } else if (number >= model.getMax() || number <= model.getMin()) {
            view.getMessage(view.getIncorrectNumberMessage());
            model.attemptsString(number);
            view.getMessage(model.getResult());
            checkNumber(isInteger());
        } else model.changeRanges(number);
        model.attemptsString(number);
        view.getMessage(model.getResult());
        view.getMessage(view.getNextEnterNumberMessage());
        checkNumber(isInteger());
    }
}
