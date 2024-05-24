/* 

public class ternary_operator {
    public static void main(String[] args) {
        int time = 11;
        if (time > 12) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }
    }
}
*/

// Everything above can be written similiary to what is below...

public class ternary_operator {
    public static void main(String[] args) {
        int time = 54;
        String result = (time < 50) ? "Good Morning" : "Good Afternoon";
        System.out.println(result);
    }
}