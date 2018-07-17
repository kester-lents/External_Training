package block4.Model;

/**
 * Created by Ruslan on 15.07.2018.
 */
public class Note {
    private String surname;
    private String name;
    private String patronymic;
    private String mainData = surname + " " + name.charAt(0) + ".";
    private String nickname;
    private String comment;
    private Groups group;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String mobilePhoneNumber2;
    private String email;
    private String skypeName;
    private String homeIndex;
    private String homeTown;
    private String homeStreet;
    private int homeNumber;
    private int homeApartmentNumber;
    private String address = homeIndex + ", " + homeTown + ", " + homeStreet
            + ", " + homeNumber + ", kv" + homeApartmentNumber;

    public Note(String mainData, String nickname, String comment, Groups group, String homePhoneNumber, String mobilePhoneNumber, String mobilePhoneNumber2, String email, String skypeName, String address) {
        this.mainData = mainData;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.mobilePhoneNumber2 = mobilePhoneNumber2;
        this.email = email;
        this.skypeName = skypeName;
        this.address = address;
    }
}
