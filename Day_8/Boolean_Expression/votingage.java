/* 

Let's think of a "real life example" where we need to find out if a person is old enough to vote.
In the example below, we use the >= comparison operator to find out if the age (25) is greater than 
OR equal to the voting age limit, which is set to 18: 

*/ 
public class votingage {
    public static void main(String[] args) {
        int myAge = 25;
        int ageLimit = 18;
        System.out.println(myAge >= ageLimit);
    }
    
}
