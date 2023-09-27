import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner inputTaker = new Scanner(System.in);
        int randomNumber = random.nextInt(1, 100);
        int user_guess = 0;
        int lives = 9;

        while(user_guess != randomNumber && lives > 0){
            System.out.println("Enter your guess (1-100): ");
            user_guess = inputTaker.nextInt();
            
            if(user_guess < 1 || user_guess > 100){
                System.out.println("Your number is out of range.");
            }
            if(user_guess < randomNumber){
                System.out.println("Your number is lower than the random number");
                System.out.println("You have " + lives + " left");
                lives = lives - 1;
            }

            else if(user_guess > randomNumber){
                System.out.println("Your number is higher than the random number. ");
                System.out.println("You have " + lives + " left");
                lives = lives - 1;
            
            }    
            else{
                System.out.println("Enter correct input please.");
            }
            
        }
        
        System.out.println("Yay! You guessed it the number is " + randomNumber);
        inputTaker.close();

    }
}
