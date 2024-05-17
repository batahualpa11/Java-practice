// Here's a real world example of why auto and manual casting is needed
public class percent {
    public static void main(String[] args) {
        int maxScore = 500;
        int userScore = 236;

        float percentage = (float) maxScore / userScore * 100.0f; // manual casting: changing the max/user score from int to float

        System.out.println("The user's percentage is " + percentage);
    }
}
