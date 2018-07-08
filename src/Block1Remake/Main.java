package Block1Remake;

/**
 * Created by Ruslan on 06.07.2018.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.execute();
    }
}
