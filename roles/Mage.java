package roles;

public class Mage  extends Roles{
    public static int default_attack = 5;
    public static int default_health = 1;
    public static int default_dodge = 4;
    public String rolesName = "Mage";

    public Mage(){
        System.out.println("Mage has been choosen !");
        this.attack = default_attack;
        this.health = default_health;
        this.dodge = default_dodge;
        this.rolesName = "Mage";
    }
    public void yelling(){
        System.out.println("===========\nMage : HOHOHOHO there's nothing i could do better than revange");
    }
    public String getRolesName(){
        return this.rolesName;
    }

    public static void  introduce(){
        System.out.println("==============================\n");
        System.out.println("Mage is a role that has an advantage in the number of attacks");
        System.out.println("1. Attack : " + Mage.default_attack);   
        System.out.println("2. Health : " + Mage.default_health);   
        System.out.println("3. Dodge : " + Mage.default_dodge);   
    }
}
