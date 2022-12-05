package maps;
import java.util.Random;
import interfaces.*;
import java.util.concurrent.ThreadLocalRandom;

public class Village extends Maps implements Describable {
    private static final String[] VILLAGE_DATABASE = new String[] {
        "Redwater", "Holmfirth", "Wealdstone", "Jarren's Outpost", "Broughton", "Paethsmouth", "Barkamsted", "Anghor Wat", "Glaenarm", "Transmere"
    };

    public Village(){
        this.type = "Village";
        Random rand = new Random();
        int prize = rand.nextInt(70);
        this.name = VILLAGE_DATABASE[ThreadLocalRandom.current().nextInt(0, VILLAGE_DATABASE.length)];
    }

    public String getName(){
        return this.name;
    }

    @Override
	public String readDescription() {
		return "This is Village" + this.DESCRIPTION;
	}
}
