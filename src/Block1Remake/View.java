package Block1Remake;

/**
 * Created by Ruslan on 06.07.2018.
 */
public class View {
    public static final String MESSAGE1= "Please, input word \"Hello\"";
    public static final String MESSAGE2= "Please, input word \"world!\"";
    public static final String MESSAGE3= "Noap, please try again";


    public static void print(String message){
        System.out.println(message);
    }
    public static String getMESSAGE1() {
        return MESSAGE1;
    }

    public static String getMESSAGE2() {
        return MESSAGE2;
    }

    public static String getMESSAGE3() {
        return MESSAGE3;
    }
}
