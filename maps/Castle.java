package maps;
import java.util.Random;
import interfaces.*;
import java.util.concurrent.ThreadLocalRandom;

public class Castle extends Maps implements Describable {
    private static final String[] CASTLE_DATABASE = new String[] {
        "Corftey Palace", "Hingham Palace", "Dockerly Stronghold", "Cunningham Keep", "Nascombe Keep", "Logoria Stronghold", "Torpin Fort", "Eaveton Keep", "Easkerton Stronghold", "Portam Castle"
    };

    public Castle(){
        this.type = "Castle";
        Random rand = new Random();
        int prize = rand.nextInt(200);
        this.name = CASTLE_DATABASE[ThreadLocalRandom.current().nextInt(0, CASTLE_DATABASE.length)];
    }

    public String getName(){
        return this.name;
    }
    
    @Override
	public String readDescription() {
		return "This is Castle" + this.DESCRIPTION;
	}
}
