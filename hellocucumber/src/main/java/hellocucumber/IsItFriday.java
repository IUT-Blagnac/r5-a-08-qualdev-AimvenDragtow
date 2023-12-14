package hellocucumber;

public class IsItFriday {
    static String isItFriday(String today) {
        return today.equals("Friday") ? "TGIF" : "No";
    }
}
