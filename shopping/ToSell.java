package shopping;
import items.*;
import player.*;

class ToSell extends TakeableItem {
    private int price;
    private int id;

    public ToSell(int id, String name, String description, int VOLUME, int price) {
        super(VOLUME, name, description );
        this.price = price;
        this.id = id;
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

    public int getId(){
        return id;
    }

    public boolean isCanBuy(int coint, Bag bag){
        if(coint >= this.price && bag.getRemainingVol() > this.VOLUME){
            return true;
        }else{
            return false;
        }
    }


    public void buyItem(Player player){
        if(this.isCanBuy(player.getCoint(), player.getBag())){
            player.getBag();
        }else{
            System.out.println("You have not anought coint to buy this item !");
        }
    }

    public void seeDescription(){
        System.out.println(this.DESCRIPTION);
    }
}