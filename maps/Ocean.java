package maps;
import java.util.Random;
import interfaces.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ocean extends Maps implements Describable {
    private static final String[] OCEAN_DATABASE = new String[] {
        "The Tinted Waters", "The Shoaling Gulf", "The Arching Waters", "CThe Hungry Tides", "Falldows Sea", "LStokedosa Ocean", "Marawich Ocean", "The Ocean of Petroly", "The Domain of Putwater", "The Waves of Bigrey"
    };
    public Ocean(){
        this.type = "Ocean";
        Random rand = new Random();
        int prize = rand.nextInt(75);
        this.name = OCEAN_DATABASE[ThreadLocalRandom.current().nextInt(0, OCEAN_DATABASE.length)];
    }

    public String getName(){
        return this.name;
    }


    @Override
	public String readDescription() {
		return "This is Ocean" + this.DESCRIPTION;
	}

}
