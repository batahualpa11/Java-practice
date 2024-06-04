public class for_each_loop {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < cars.length - 1; i++) {
      System.out.println(cars[i + 1]);
    } 
    System.out.println("The End of Program");
  }
}



// i = 0, i < 3, cars[1], 1 
// i = 1, i < 3, cars[2], 2
// i = 2, i < 3, cars[3], 3
// i = 3, 4 < 3, cars[4], 4