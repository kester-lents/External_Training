package Block1;

/**
 * Created by Ruslan on 02.07.2018.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        controller.execute();
    }
}



