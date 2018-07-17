package block4.View;

/**
 * Created by Ruslan on 16.07.2018.
 */
public class View {
    public static String NAME = "Enter your name, please";
    public static String SURNAME = "Enter your surname, please";
    public static String PATRONYMIC = "Enter your patronymic, please";
    public static String NICKNAME = "Enter your nickname, please";
    public static String COMMENT = "Enter your comment, please (not necessary)";
    public static String GROUP = "Enter your group name, please";
    public static String PHONENUMBER = "Enter your home phone number, please";
    public static String MOBILEPHONENUMBER = "Enter your mobile number, please";
    public static String MOBILEPHONENUMBER2 = "Enter your additional mobile number, please (not necessary)";
    public static String EMAIL = "Enter your e-mail, please";
    public static String SKYPENAME = "Enter your skype-name, please";
    public static String INDEX = "Enter your home index, please";
    public static String TOWN = "Enter your town name, please";
    public static String STREET = "Enter your street name, please";
    public static String HOMEHOUSENUMBER = "Enter your home house number, please";
    public static String APARTMENTNUMBER = "Enter your apartment number, please";
    public static String ENTRYDATE = "Enter today's date, please";

    public static String INCORRECTENTER = "Incorrect enter, please try again";

    public void message(String message) {
        System.out.println(message);
    }

}
