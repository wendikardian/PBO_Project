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

    public void getInformation(){
        System.out.println(" > Name : " + this.NAME);
        System.out.println(" > Description : " + this.DESCRIPTION);
        System.out.println(" > Price : " + this.price);
        System.out.println(" > How much it takes volume of your bag ?  " + this.VOLUME);
        System.out.println("=============================");
    }

    public int getVOLUME() {
        return this.VOLUME;
    }

    public int getPrice() {
        return this.price;
    }
}