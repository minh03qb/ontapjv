public class ifelse {
    public static void main(String[] args) {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // if...else if...else
        int time1 = 22;
        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Ternary Operator
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // && and || and !
        int time3 = 22;
        if (time3 > 10 && time3 < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int time4 = 22;
        if (time4 < 10 || time4 > 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int time5 = 22;
        if (!(time5 < 10 || time5 > 20)) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
