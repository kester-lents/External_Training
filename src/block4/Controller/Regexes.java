package block4.Controller;

/**
 * Created by Ruslan on 15.07.2018.
 */
public interface Regexes {
    String email = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    String phone = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";


}
