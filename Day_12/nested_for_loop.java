// this is an example of how nested for_loops work

public class nested_for_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);

            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);
            }    
        }
    }
}
