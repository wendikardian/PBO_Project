package roles;

public class Tank extends Roles {
    public static int default_attack = 3;
    public static int default_health = 4;
    public static int default_dodge = 1;
    public String rolesName = "Tank";

    public Tank(){
        System.out.println("TANKKK has been choosen !");
        this.attack = default_attack;
        this.health = default_health;
        this.dodge = default_dodge;
        this.rolesName = "Tank";
    }

    public void yelling(){
        System.out.println("===========\nTank : The immortally is the best fit of my suite");
    }

    public String getRolesName(){
        return this.rolesName;
    }

    public static void  introduce(){
        System.out.println("==============================\n");
        System.out.println("Tank is a role that has the advantage of the amount of health it has ");
        System.out.println("1. Attack : " + Tank.default_attack);   
        System.out.println("2. Health : " + Tank.default_health);   
        System.out.println("3. Dodge : " + Tank.default_dodge);   
    }
}
