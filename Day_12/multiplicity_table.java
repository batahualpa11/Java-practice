public class multiplicity_table {
    public static void main(String[] args) {
        int number = 2;
        
        ///Print the multiplication table for the number 2
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
    }
}
