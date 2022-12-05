import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("===============================\nWelcome, Welcome to Dungeon Warior. \nIn this game, you need take all of the village, the ocean, and the island\nCollect the gold and upgrade your abbility\nYou got 5 Health\nUse HELP command to get all available command\n" + "You are an explorer in a Dungeon Environtment looking for a treasure...\n");      
        System.out.println("================= This Game is Created by =================\n1. Naila Nur Faiza\n2. Tia Aulia\n3. Wendi Kardian\n\n\n ===== LET's START THE GAME ======\n");
        System.out.println("Press any key to continue");
        new Scanner(System.in).nextLine();
        GameStart game = new GameStart();
        game.StartTheGame();
    }
}
