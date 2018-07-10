package block2.Homework_game.NotFinished;

/**
 * Created by Ruslan on 09.07.2018.
 */
public class View {
    Model model = new Model();

    public String firstEnterNumberMessage = "Будь ласка, введіть цілочисельне значення в межах ("
            + model.getMin() + ", " + model.getMax() + ") ";
    public String notInt = "Це не ціле число. Повторіть спробу";
    public String incorrectNumberMessage = "Невірно, ви вийшли за межі діапазону ("
            + model.getMin() + ", " + model.getMax() + "). Повторіть спробу ";
    public String nextEnterNumberMessage = "Близько. Введіть число у новому діапазоні ("
            + model.getMin() + ", " + model.getMax() + ") ";
    public String finalMessage = "Вірно. Загаданим число є " + model.getCrypticNumber();


    public void getMessage(String message) {
        System.out.println(message);
    }

    public Model getModel() {
        return model;
    }

    public String getFirstEnterNumberMessage() {
        return firstEnterNumberMessage;
    }

    public String getNotInt() {
        return notInt;
    }

    public String getIncorrectNumberMessage() {
        return incorrectNumberMessage;
    }

    public String getNextEnterNumberMessage() {
        return nextEnterNumberMessage;
    }

    public String getFinalMessage() {
        return finalMessage;
    }
}
