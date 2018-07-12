package block1.HomeworkMVC;

/**
 * Created by Ruslan on 02.07.2018.
 */
class Model {
    private String word;

    public String sentence (String value){
        String res = "";
        res += value + " ";
        return res;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


}