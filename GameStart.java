import java.util.*;
import player.*;
import items.*;
import roles.*;
import maps.*;
import enemy.*;
import shopping.*;
import bonus_games.*;

public class GameStart {

	private boolean isGameOver;
	private Player PLAYER;
	private Scanner scanner;
    private int level = 1;
    private Maps map;
    private ListofMaps MAPS;
    private Store STORE;
    private Games Games;

    public GameStart(){
        this.PLAYER = new Player(new Bag(50));
        this.isGameOver = false;
		this.scanner = new Scanner(System.in);
        this.MAPS = new ListofMaps();
        this.STORE = new Store();
        this.Games = new Games(this.level);
    }

    
    public void StartTheGame(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.flush();
        System.out.flush();
        System.out.println("Press any key to continue");
        this.scanner.nextLine();
        System.out.println("Welcome to the game !!!!!\nThe Dungeon Advanture");
        System.out.println("Press any key to continue");
        this.scanner.nextLine();
        System.out.println("Please enter your name : ");
        var playerName = this.scanner.nextLine();
        this.PLAYER.setName(playerName);
        System.out.println("Hello " + this.PLAYER.getName() + ", Nice to meet you !!!!!!");
        System.out.println("Let me introduce you to the \n");
        Fighter.introduce();
        Mage.introduce();
        Tank.introduce();
        System.out.println("==============================\n\n\n\n\n");
        Roles.printTheRoles();
        var idRoles = 10;


        while(idRoles >=4 || idRoles <= 0){
            System.out.println("\n\nChoose your role : ");
            idRoles = this.scanner.nextInt();
            try {
                if(idRoles <= 0 || idRoles >= 4) {
                    throw new NumberFormatException();
                }
            }
            catch (Exception  ex) {
                if(idRoles <= 0 || idRoles >= 4) {
                    System.err.print("Out of range");
                }
            }
        }

       switch(idRoles){
        case(1):
            this.PLAYER.setRoles(new Fighter());
            break;
        case(2):
            this.PLAYER.setRoles(new Mage());
            break;
        case(3):
            this.PLAYER.setRoles(new Tank());
            break;
        default:
            System.out.println("?");
            break;
       }    

       this.PLAYER.getRoles().yelling();
       
    System.out.println("\n\n");
       while(this.isGameOver == false){
        

        System.out.println("Press any key to continue ....");
        this.scanner.nextLine();
        this.scanner.nextLine();
        if(this.PLAYER.getChange() < 1){
            System.out.println("Game Over !!!!");
            this.isGameOver = true;
        }
        if(this.Games.getLevel() >= 10){
            System.out.println("Congratulations! You successfully take over the Dungeon Island ! You are the champions !!!"); 
            this.isGameOver = true;
        }
        this.showMenu();
       }

    }

    public void showGreeting(){

    }

    public void showMenu(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println("WELCOME TO DUNGEON MENU GUIDEN : ");
        System.out.println("What do you want ?");
        System.out.println("1. Show your profile");
        System.out.println("2. View your bag");
        System.out.println("3. See the maps");
        System.out.println("4. See the coins");
        System.out.println("5. Shopping");
        System.out.println("6. Attack others ...");


        System.out.println("\nWhat about your choices ..... ? ");
        var choice = this.scanner.nextInt();
        switch(choice){
            case(1):
                System.out.println(this.PLAYER.toString());
                break;
            case(2):
                this.PLAYER.getBag().seeTheBag();
                break;
            case(3):
                this.MAPS.printAllMaps();
                break;
            case(4):
                System.out.println("Your coint is : " + this.PLAYER.getCoint());
                break;
            case(5):
                System.out.println("Your coint is : " + this.PLAYER.getCoint());
                System.out.println("Your remaining volume on your bag : " + this.PLAYER.getBag().getRemainingVol());
                this.STORE.printShopping();
                System.out.println("Are you wanna buy something ? enter (99) to exit shopping");
                var shop = this.scanner.nextInt();
                try {
                    if(shop <= 0 || shop >= 5) {
                        throw new NumberFormatException();
                    }
                }
                catch (Exception  ex) {
                    if(shop <= 0 || shop >= 4) {
                        System.err.print("Out of range");
                    }
                }
                if(shop != 99){
                    STORE.buyItem(shop, this.PLAYER);
                }
                break;
            case(6):
                this.Games.GamePlay(PLAYER, MAPS);
                

                
        }

    }

    public void introduction(){

    }

    


}
