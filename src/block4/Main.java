package block4;

import block4.Controller.Regexes;
import block4.Model.DataProcessing;

/**
 * Created by Ruslan on 15.07.2018.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(DataProcessing.matchToRegex(Regexes.email,"ruslan.zarichnyi@ukr.net"));

    }
}
