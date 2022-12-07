package items;

// import interfaces.CanTakeItem;

public abstract class TakeableItem extends Item {

    protected final int VOLUME;


    public TakeableItem(int VOLUME, String name, String description) {
        super(name, description);
        this.VOLUME = VOLUME;
    }

    public int getVOLUME() {
        return this.VOLUME;
    }



    abstract public void seeDescription();
}