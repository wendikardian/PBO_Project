package enemy;
import java.util.Random;
import roles.*;

public class Enemy {
    private Roles enemyRoles;
    public Enemy(){
        Random rand = new Random();
        int n = rand.nextInt(3);
        if(n == 1){
            this.enemyRoles = new Fighter();
        }else if( n == 2){
            this.enemyRoles = new Mage();
        }else{
            this.enemyRoles = new Tank();
        }
    }

    public Roles getRoles(){
        return this.enemyRoles;
    }

    public void getEnemyYelling(){
        this.enemyRoles.yelling();
    }
}
