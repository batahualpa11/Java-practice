public class while_continue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
