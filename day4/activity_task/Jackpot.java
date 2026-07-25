// WAP to create random jackpot number and take input from user to guess the number. 
// Based on level the attempt to guess the number should change

// Easy – 20 attempts
// Medium – 10 attempts
// Difficult – 5 attempts



import java.util.Scanner;

public class Jackpot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the level : ");
        String level = sc.nextLine();

        int attempts;
        switch(level) {
            case "Easy":
                attempts = 20;
                break;
            case "Medium":
                attempts = 10;
                break;
            case "Difficult":
                attempts = 5;
                break;
            default:
                System.out.println("Invalid level");
                return;
        }

        System.out.println("You have " + attempts + " attempts to guess the number");

        int jackpotNumber = (int) (Math.random() * 100) + 1;
        int attemptsLeft = attempts;

        while (attemptsLeft > 0) {
            System.out.print("Enter your guess : ");
            int guess = sc.nextInt();

            //Jackpot=73
            //Then Hint: Jackpot is greater than 50
            if (guess == jackpotNumber) {
                System.out.println("Congratulations! You guessed the number");
                break;
            } else if (jackpotNumber > guess) {
                System.out.println("Too low");
                System.out.println("Hint : Jackpot is greater than " + guess);
            } else {
                System.out.println("Too high");
                System.out.println("Hint : Jackpot is smaller than " + guess);
            }

            attemptsLeft--;
        }

        if (attemptsLeft == 0) {
            System.out.println("You ran out of attempts");
            System.out.println("The jackpot number was : " + jackpotNumber);
        }

        sc.close();

    }
    
}
