package bonus_games;

import java.util.*;

public class MathFighter {

    public static boolean main() {
        Scanner scanner = new Scanner(System.in);

        int randomNumber1 = (int) (20 * Math.random()) + 1;
        int randomNumber2 = (int) (20 * Math.random()) + 1;
        int randomNumberAdd = randomNumber1 + randomNumber2;
        int randomNumberMul = randomNumber1 * randomNumber2;
        int randomNumberDiv = randomNumber1 / randomNumber2;
        int randomNumberRem = randomNumber1 % randomNumber2;
        int correct = 0;
        System.out.println("Welcome to math figthter !!!");
        System.out.println("You must win atleast 60% of the total score to win this game !!!!");
        System.out.println("Good luck ! \n ===========================");
        System.out.print(randomNumber1 + " + " + randomNumber2 + " = ");
        int GuessRandomNumberAdd = 1;
        try {
            GuessRandomNumberAdd = scanner.nextInt();
        } catch (InputMismatchException e) {
            // e.printStackTrace();
            System.err.println("Entered value is not an integer");
        }
        if (GuessRandomNumberAdd == randomNumber1 + randomNumber2) {
            System.out.println("Correct!");
            correct++;
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + randomNumberAdd);

        }
        System.out.print(randomNumber1 + " * " + randomNumber2 + " = ");
        int GuessRandomNumberMul = 1;
        try {
            GuessRandomNumberMul = scanner.nextInt();
        } catch (InputMismatchException e) {
            // e.printStackTrace();
            System.err.println("Entered value is not an integer");
        }

        if (GuessRandomNumberMul == randomNumber1 * randomNumber2) {
            System.out.println("Correct!");
            correct++;
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + randomNumberMul);

        }

        System.out.print(randomNumber1 + " % " + randomNumber2 + " = ");
        int GuessRandomNumberRem = 1;
        try {
            GuessRandomNumberRem = scanner.nextInt();
        } catch (InputMismatchException e) {
            // e.printStackTrace();
            System.err.println("Entered value is not an integer");
        }
        if (GuessRandomNumberRem == randomNumber1 % randomNumber2) {
            System.out.println("Correct!");
            correct++;

        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + randomNumberRem);
        }
        double percentageCorrect = correct * 34;

        System.out.println("You got " + correct + " correct answers.");

        System.out.println("That's " + percentageCorrect + "%!");
        if(percentageCorrect >= 60){
            return true;
        }else{
            return false;
        }
    }
}