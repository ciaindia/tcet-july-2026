//WAP to execute Fizz Buzz Problem / Print number 1 to 30
//if number is divisible by 3 then print Fizz
//if number is divisible by 5 then print Buzz
//if number is divisible by both 3 and 5 then print Fizz Buzz

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
}
