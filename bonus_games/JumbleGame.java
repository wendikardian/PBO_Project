package bonus_games;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class JumbleGame {
    private static final String[] WORDS_DATABASE = new String[] {
            "python", "javascript", "golang", "pascal", "haskell", "ruby", "pearl", "php", "html", "css", "json",
            "nodejs", "react", "vuejs", "laravel"
    };

    public static boolean main() {
        JumbleGame jg = new JumbleGame();
        boolean result = jg.startGame();
        return result;
    }

    private boolean startGame() {
        int numberOfGuesses = 0;
        boolean isPlayerWin = false;
        String original = selectRandomWord();
        String shuffled = getShuffledWord(original);
        System.out.println("==============");
        System.out.println("Clue = Coding Technology keyword");
        System.out.println("==============");
        System.out.println("Shuffled word is: " + shuffled);
        numberOfGuesses++;
        String userGuess = getUserGuess();
        if (original.equalsIgnoreCase(userGuess)) {
            System.out.println("Congratulations! You won the games !!!");
            isPlayerWin = true;
        } else {
            System.out.println("Sorry, Wrong answer");
            isPlayerWin = false;
        }

        return isPlayerWin;
    }

    public String getUserGuess() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please type in the original word: ");
        return sn.nextLine();
    }

    public String selectRandomWord() {
        int rPos = ThreadLocalRandom.current().nextInt(0, WORDS_DATABASE.length);
        return WORDS_DATABASE[rPos];
    }

    public String getShuffledWord(String original) {
        String shuffledWord = original;
        int wordSize = original.length();
        int shuffleCount = 10;
        for (int i = 0; i < shuffleCount; i++) {
            int position1 = ThreadLocalRandom.current().nextInt(0, wordSize);
            int position2 = ThreadLocalRandom.current().nextInt(0, wordSize);
            shuffledWord = swapCharacters(shuffledWord, position1, position2);
        }
        return shuffledWord;
    }

    private String swapCharacters(String shuffledWord, int position1, int position2) {
        char[] charArray = shuffledWord.toCharArray();
        char temp = charArray[position1];
        charArray[position1] = charArray[position2];
        charArray[position2] = temp;
        return new String(charArray);
    }
}
