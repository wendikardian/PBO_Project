package shopping;
import items.Item;

class ToSell extends Item {
    private final int VOLUME;
    private int price;

    public ToSell(String name, String description, int VOLUME, int price) {
        super(name, description);
        this.VOLUME = VOLUME;
        this.price = price;
    }

    public int getVOLUME() {
        return this.VOLUME;
    }

    public int getPrice() {
        return this.price;
    }
}