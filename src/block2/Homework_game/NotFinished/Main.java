package block2.Homework_game.NotFinished;

/**
 * Created by Ruslan on 09.07.2018.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.execute();
    }
}
