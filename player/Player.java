package player;
import interfaces.CanTakeItem;
import interfaces.CanTakeWeapon;
import items.*;
import roles.*;
// import storage.Bag;

public class Player implements CanTakeItem, CanTakeWeapon{
    private int coint = 0;
    private Weapon activeWeapon = null;
    private Bag BAG;
    private final int MaxChange = 5;
    private int change;
    private String name;
    private Roles playerRoles;
    
    
    public Player( Bag BAG) {
        this.BAG = BAG;
        this.change = MaxChange;
        this.activeWeapon = new Weapon("Assasin Sword", "hearth like a diamonds");
        this.BAG.addItem(this.activeWeapon);
        this.change = MaxChange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoles(Roles role){
        this.playerRoles = role;
    }

    public Roles getRoles(){
        return this.playerRoles;
    }

    public Bag getBag(){
        return this.BAG;
    }

    public String getName(){
        return this.name;
    }

    public int getCoint(){
        return this.coint;
    }

    public void setCoint(int coint){
        this.coint -= coint;
    }

    public void switchWeapon(Weapon w) {
        if (this.activeWeapon == null) {
            this.activeWeapon = w;
        } else {
            this.BAG.addItem(this.activeWeapon);
            this.activeWeapon = w;
        } 
    }


    public String toString(){
        return "Hello my name is " + this.name + " and I am a " + this.playerRoles.getRolesName() + "\nMy abilities are : \n1. Attack :"+this.playerRoles.getAttact() +  "\n2. Health : " + this.playerRoles.getHealth() + "\n3. Dodge : " + this.playerRoles.getDodge() + "\n";
    }
}
