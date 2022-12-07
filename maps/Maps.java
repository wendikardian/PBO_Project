
package maps;
import enemy.*;
import interfaces.*;
import java.util.*;


public abstract class  Maps implements Describable {
    private Enemy leader;
    protected String type;
    protected String name;
    private int prize;
    private boolean isTakenOver = false;
        
    public Maps(){
        this.leader = new Enemy();
        Random rand = new Random();
        this.prize = rand.nextInt(20);
        // this.leader.getEnemyYelling();
    }  


    public String getName(){
        return this.name;
    }

    public void getInformation(){
        System.out.println(" > " + this.getType());
        System.out.println(" > Place Name : " + this.getName());
        if(this.isTakenOver() == false){
            System.out.println("You must defeated this, the leader roles is " + this.getLeader().getRoles().getRolesName());
        }else{
            System.out.println("You already taken over this place ");
        }
        System.out.println("=============================");
    }

    public String getType(){
        return this.type;
    }
    public Enemy getLeader(){
        return this.leader;
    }

    public void takenOver(){
        this.isTakenOver = true;
    }

    public boolean isTakenOver(){
        return this.isTakenOver;
    }

    @Override
	public String readDescription() {
		return this.DESCRIPTION;
	}
}
