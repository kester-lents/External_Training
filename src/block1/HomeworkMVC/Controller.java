package block1.HomeworkMVC;

import java.util.Scanner;

/**
 * Created by Ruslan on 02.07.2018.
 */
class Controller {

    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);

        View.printMessage(View.COMMENT1);
        model.setWord(validate("Hello", sc));
        model.sentence(model.getWord());
        View.printMessage(View.COMMENT2);
        model.setWord(validate("world!", sc));
        View.printMessage(model.sentence(model.getWord()));
    }

    public String validate(String word, Scanner sc) {
        while (!sc.hasNext(word)) {
            View.printMessage(View.WRONG_WORD);
            sc.next();
        }
        return sc.next();
    }
}
