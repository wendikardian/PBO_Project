package shopping;
import java.util.*;
import items.*;
import player.*;

public class Store { 
    private ArrayList<ToSell> TOSELL;

    public Store() {
        this.TOSELL = new ArrayList<>();
        this.TOSELL.add(new ToSell(1, "Rice Ball", "Add health 2", 2, 10));
        this.TOSELL.add(new ToSell(2, "Indigo Water", "Add Dodge 2", 2, 12));
        this.TOSELL.add(new ToSell(3, "Amo Shield", "Add Health 3", 2, 15));
        this.TOSELL.add(new ToSell(4, "Exe Sharper AK2", "Add Attack 4", 4, 17));
	}

    public void printShopping(){
        // Iterator <ToSell>itr = TOSELL.iterator();
        // if(!itr.hasNext()){
        //     System.out.println("Sorry, nothing to sell");
        // }else{
        //     while(itr.hasNext()){
        //         itr.next().getInformation();
        //     }
        // }
        
        int total = TOSELL.size();
        int i = 0;
        if(total == 0){
            System.out.println("Sorry, Nothing to sell");
        }else{
            for(i = 0; i < total; i++){
                System.out.println("Item no " + TOSELL.get(i).getId());
                TOSELL.get(i).getInformation();
            }
        }
    }

    public void buyItem(int id, Player player){
        ToSell item = TOSELL.get(id - 1);
        if(item.isCanBuy(player.getCoint(), player.getBag())){
            player.subtractCoint(item.getPrice());
            player.getBag().addItem(item);
            if(id == 1){
                player.getRoles().setHealth(player.getRoles().getHealth() + 2);
            }else if( id == 2){
                player.getRoles().setDodge(player.getRoles().getDodge() + 2);
            }else if(id  == 3){
                player.getRoles().setHealth(player.getRoles().getHealth() + 3);
            }else if(id == 4){
                player.getRoles().setAttack(player.getRoles().getAttact() + 4);
            }else{
                System.out.println("Out of range !");
            }
            System.out.println("Thanks for buyying !!");
        }else{
            System.out.println("Sorry you have not enaught money to buy this item or your bag is full");
        }
    }


    



}
