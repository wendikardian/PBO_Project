package shopping;
import java.util.*;
import items.*;

public class Store { 
    private LinkedList<ToSell> TOSELL;

    public Store() {
        this.TOSELL = new LinkedList<>();
        this.TOSELL.add(new ToSell("Rice Ball", "Add health 2", 2, 10));
        this.TOSELL.add(new ToSell("Indigo Water", "Add Dodge 2", 2, 12));
        this.TOSELL.add(new ToSell("Amo Shield", "Add Defence 2", 2, 15));
	}

    public void printShopping(){
        Iterator <ToSell>itr = TOSELL.iterator();
        if(!itr.hasNext()){
            System.out.println("Sorry, nothing to sell");
        }else{
            while(itr.hasNext()){
                itr.next().getInformation();
            }
        }
    }



}
