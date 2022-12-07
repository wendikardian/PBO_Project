package bonus_games;

import java.util.*;
import player.*;
import maps.*;

public class Games {
    protected int level;
    // protected int prize;

    public Games(int level) {
        this.level = level;

    }

    public boolean GamePlay(Player player, ListofMaps maps) {
        System.out.println(
                "Welcome to the Game Play " + player.getName() + "! You are " + player.getRoles().getRolesName());
        System.out.println("You will attack : \n ================================");
        maps.LISTOFMAPS.get(this.level - 1).getInformation();
        int playerAttack = player.getRoles().getAttact();
        int playerHealth = player.getRoles().getHealth();
        int playerDodge = player.getRoles().getDodge();
        System.out.println("Your abilities : ");
        System.out.println("> Attack : " + playerAttack);
        System.out.println("> Dodge : " + playerHealth);
        System.out.println("> Health : " + playerDodge);
        System.out.println(" =================== ");
        player.toString();
        Random rand = new Random();
        int enemyAttack = maps.LISTOFMAPS.get(this.level - 1).getLeader().getRoles().getAttact() * this.level;
        int enemyDodge = maps.LISTOFMAPS.get(this.level - 1).getLeader().getRoles().getDodge();
        int enemyHealth = maps.LISTOFMAPS.get(this.level - 1).getLeader().getRoles().getHealth() * this.level;
        System.out.println("This is the information of your enemy: ");
        System.out.println("> Attack : " + enemyAttack);
        System.out.println("> Dodge : " + enemyDodge);
        System.out.println("> Health : " + enemyHealth);

        while (enemyHealth > 0 && playerHealth > 0) {
            System.out.println("Are you ready for the battle ???");
            new Scanner(System.in).nextLine();
            int random = rand.nextInt(100);
            boolean isWin = false;
            if (random >= 50) {
                System.out.println("You get Math Fighter .... Are you ready ??");
                new Scanner(System.in).nextLine();
                isWin = MathFighter.main();
            } else {
                System.out.println("You get Jumbled Game .... Are you ready ??");
                new Scanner(System.in).nextLine();
                isWin = JumbleGame.main();
            }

            if (isWin) {
                System.out.println("You attack the enemy");
                if (isDodgeSuccess(enemyDodge)) {
                    System.out.println("Enemy successfully to dodge");
                } else {
                    System.out.println("Attack successfully, enemy has been lost " + playerAttack + " Health");
                    enemyHealth -= playerAttack;
                    System.out.println("Remaining health enemy is : " + enemyHealth);
                }
            } else {
                System.out.println("Enemy attack you !");
                if (isDodgeSuccess(playerDodge)) {
                    System.out.println("You successfully to dodge");
                } else {
                    System.out.println("Enemy successfully Attack you, You has been lost " + playerAttack + " Health");
                    playerHealth -= enemyAttack;
                    System.out.println("Remaining health enemy is : " + playerHealth);
                }
            }
        }

        if(enemyHealth < 1){
            maps.LISTOFMAPS.get(this.level - 1).takenOver();
            System.out.println("YOu successfully defeat the enemy");
            System.out.println("You upgrade one level");
            int cointGet = rand.nextInt(50);
            System.out.println("You got extra " + cointGet + " Coint");
            player.addCoint(cointGet);
            this.level += 1;
            return true;
        }else{
            System.out.println("You fail :(");
            player.subtractChange(1);
            System.out.println("Your remaining change is : " + player.getChange());
            return false;
        }

    }

    public boolean isDodgeSuccess(int dodgeValue) {
        Random rand = new Random();
        int random = rand.nextInt(5);
        int dodgeChange = dodgeValue * random;
        if (dodgeChange > 20) {
            return true;
        } else {
            return false;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
