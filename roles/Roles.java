package roles;
abstract public class Roles {

    protected String rolesName = "Fighter";
    public static int id;
    protected int attack;
    protected int health;
    protected int dodge;

    public Roles(){
        this.rolesName = "Fighter";
        this.id = 1;
        this.attack = 4;
        this.health = 3;
        this.dodge = 3;

    }

    public Roles(String name, int id, int attack, int health, int dodge){
        this.rolesName = name;
        this.id = id;
        this.attack = attack;
        this.health = health;
        this.dodge = dodge;
    }


    public int getAttact(){
        return this.attack;
    }

    public int getHealth(){
        return this.health;
    }

    public int getDodge(){
        return this.dodge;
    }

    public static void printTheRoles(){
        System.out.println("============= HERE's THE ROLES ==============\n1. FIGHTER\n2. MAGE\n3. TANK\n =====\n\n");
    }
    public abstract String getRolesName();
    public abstract void yelling();

}
