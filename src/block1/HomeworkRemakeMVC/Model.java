package block1.HomeworkRemakeMVC;

/**
 * Created by Ruslan on 06.07.2018.
 */
public class Model {
    private String value = "";


    public void sentence(String word) {
        setValue(getValue() + word + " ");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
