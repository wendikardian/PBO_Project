package roles;

public class Fighter extends Roles {
    public static int default_attack = 4;
    public static int default_health = 3;
    public static int default_dodge = 3;


    public Fighter(){
        System.out.println("Fighter has been choosen !");
        this.rolesName = "Fighter";
        this.attack = default_attack;
        this.health = default_health;
        this.dodge = default_dodge;
    }

    public void yelling(){
        System.out.println("===========\nFighter : Nothing last foverer we can change the future");
    }

    public String getRolesName(){
        return this.rolesName;
    }

    public static void introduce(){
        System.out.println("==============================\n");
        System.out.println("Fighter is a role that has almost balanced abilities between all of them");
        System.out.println("1. Attack : " + Fighter.default_attack);   
        System.out.println("2. Health : " + Fighter.default_health);   
        System.out.println("3. Dodge : " + Fighter.default_dodge);   
    }

   
    
}
