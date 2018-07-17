package block4.Model;

import block4.View.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ruslan on 15.07.2018.
 */
public class DataProcessing {

    public static boolean matchToRegex(String regex, String testString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }

    Scanner scanner = new Scanner(System.in);

    void addingFieldAccordingRegex(String regex, String testString) {
        while (!matchToRegex(regex, testString))
            System.out.println(View.INCORRECTENTER);
    }

    void addingField(Scanner scanner) {
        while (!scanner.hasNext())

    }


}
