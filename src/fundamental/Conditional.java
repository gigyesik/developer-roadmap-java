package fundamental;

public class Conditional {
    public static void main(String[] args) {
        // Conditional
        // if
        String today = "sat";

        if (today == "sat") {
            System.out.println("In my home");
        }

        // else if
        String today2 = "sun";
        String tomorrow = "mon";

        if (today2 == "sun") {
            System.out.println("In my home");
        } else if (tomorrow == "mon") {
            System.out.println("Go to work");
        }

        // else
        String weekend = "weekend";
        String weekday = "weekday";

        if (weekend == "weekend") {
            System.out.println("In my home");
        } else {
            System.out.println("Go to work");
        }

        // switch
        String day = "day";

        switch (day) {
            case "mon": System.out.println("Go to work");
            case "tue": System.out.println("Go to work");
            case "wed": System.out.println("Go to work");
            case "thu": System.out.println("Go to work");
            case "fri": System.out.println("Go to work");
            case "sat":	System.out.println("In my home");
            case "sun":	System.out.println("In my home");
        }

        // ternary operator
        int three = 3;
        String numberIs = (three % 2 == 0) ? "even" : "odd";
        System.out.println(numberIs);
    }
}
