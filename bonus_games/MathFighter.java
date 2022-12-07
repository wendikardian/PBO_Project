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
        System.out.println("You must win atleast 70% of the total score to win this game !!!!");
        System.out.println("Good luck ! \n ===========================");
        System.out.print(randomNumber1 + " + " + randomNumber2 + " = ");
        int GuessRandomNumberAdd = scanner.nextInt();

        if (GuessRandomNumberAdd == randomNumber1 + randomNumber2) {
            System.out.println("Correct!");
            correct++;
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + randomNumberAdd);

        }
        System.out.print(randomNumber1 + " * " + randomNumber2 + " = ");
        int GuessRandomNumberMul = scanner.nextInt();

        if (GuessRandomNumberMul == randomNumber1 * randomNumber2) {
            System.out.println("Correct!");
            correct++;
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + randomNumberMul);

        }
        System.out.print(randomNumber1 + " / " + randomNumber2 + " = ");
        int GuessRandomNumberDiv = scanner.nextInt();

        if (GuessRandomNumberDiv == randomNumber1 / randomNumber2) {
            System.out.println("Correct!");
            correct++;

        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + randomNumberMul);

        }
        System.out.print(randomNumber1 + " % " + randomNumber2 + " = ");
        int GuessRandomNumberRem = scanner.nextInt();
        if (GuessRandomNumberRem == randomNumber1 % randomNumber2) {
            System.out.println("Correct!");
            correct++;

        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + randomNumberRem);
        }
        double percentageCorrect = correct * 25;

        System.out.println("You got " + correct + " correct answers.");

        System.out.println("That's " + percentageCorrect + "%!");
        if(percentageCorrect >= 70){
            return true;
        }else{
            return false;
        }
    }
}