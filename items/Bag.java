package items;
import java.util.*;

public class Bag{

	private static int capacity = 40;
    private int currentVol;
    private LinkedList<TakeableItem> TAKEABLE_ITEMS;

    public Bag(){

    }

	public Bag(int capacity) {
		this.capacity = capacity;
        this.currentVol = 0;
        this.TAKEABLE_ITEMS = new LinkedList<>();
	}

    public int getCAPACITY() {
		return this.capacity;
	}

    public int getCurrentVol() {
		return this.currentVol;
	}

    public void seeTheBag(){
        Iterator <TakeableItem>itr = TAKEABLE_ITEMS.iterator();
        if(!itr.hasNext()){
            System.out.println("Sorry, your Bag is empty!");
        }else{
            while(itr.hasNext()){
                System.out.println(itr.next().getNAME());
            }
        }
    }

    public boolean addItem(TakeableItem newItem) {
		if (this.canAddItem(newItem.getVOLUME())) {
			this.TAKEABLE_ITEMS.add(newItem);
			this.currentVol += newItem.getVOLUME();
			return true;
		} else {
			return false;
		}
	}	

    public boolean canAddItem(int itemVol) {
		return this.capacity >= this.currentVol + itemVol;
	}
}