package ReviewCLass7;

public class Practice4 {
    String weekDay (String day) {
        day= day.toLowerCase();
        switch(day) {
            case "monday":
                return "It is lazy day";
            case"tuesday":
                return "It is productive day";
            case "wednesday":
                return "It is gloomy day";
            case "thursday":
                return "It is exciting day";
            case "friday":
                return "No work today";
            default:
                return "No correct option found";
        }
    }

    public static void main(String[] args) {
        Practice4 p=new Practice4();
        String output=p.weekDay("friday");
        System.out.println(output);

    }
}
