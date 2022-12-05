package shopping;
import java.util.*;
import items.*;

public class Shopping { 
    private LinkedList<ToSell> TOSELL;

    public Shopping() {
        this.TOSELL = new LinkedList<>();
        this.TOSELL.add(new ToSell("Rice Ball", "Add health 2", 2, 10));
        this.TOSELL.add(new ToSell("Indigo Water", "Add Dodge 2", 2, 12));
        this.TOSELL.add(new ToSell("Amo Shield", "Add Defence 2", 2, 15));
	}

    

}
