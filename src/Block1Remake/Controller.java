package Block1Remake;

import java.util.Scanner;

/**
 * Created by Ruslan on 06.07.2018.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        createSentence("Hello");
        createSentence("world!");
        View.print(model.getValue());
    }

    private void createSentence(String word) {
        inputProcessing(word);
        model.sentence(word);
    }

    private void inputProcessing(String word) {
        if (word.equals("Hello")) {
            View.print(View.MESSAGE1);
        } else {
            View.print(View.MESSAGE2);
        }
        inputWord(scanner, word);
    }

    public String inputWord(Scanner sc, String word) {
        while (!sc.hasNext(word)) {
            View.print(View.getMESSAGE3());
            sc.next();
        }
        return sc.next();
    }
}
