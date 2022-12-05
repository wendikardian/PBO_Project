package items;

import interfaces.CanTakeItem;

abstract class TakeableItem extends Item {

    private final int VOLUME;


    public TakeableItem(int VOLUME, String name, String description) {
        super(name, description);
        this.VOLUME = VOLUME;
    }

    public int getVOLUME() {
        return this.VOLUME;
    }

    abstract public boolean use(CanTakeItem o);


    abstract public void seeDescription();
}