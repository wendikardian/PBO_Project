package maps;
import interfaces.*;
import java.util.*;

public class ListofMaps implements Describable {
    public ArrayList<Maps> LISTOFMAPS;
    private int totalMaps = 10;
    private int mapsLeft;
    

    public ListofMaps(){
        this.mapsLeft = this.totalMaps;
        this.LISTOFMAPS = new ArrayList<>();
        int i = 0;
        int randNumber = 0;
        Random rand = new Random();
        for(i = 0; i< this.totalMaps; i++){ 
            randNumber = rand.nextInt(10);
            // System.out.println(randNumber);
            if (randNumber < 3){
                this.LISTOFMAPS.add(new Castle());
            }else if(randNumber < 6){
                this.LISTOFMAPS.add(new Ocean());
            }else{
                this.LISTOFMAPS.add(new Village());
            }
        }
    }

    public void printAllMaps(){
        // Iterator <Maps>itr = LISTOFMAPS.iterator();
        int i = LISTOFMAPS.size();
        // System.out.println(i);
        // System.out.println(itr.next().getName());
        // if(!itr.hasNext()){
        //     System.out.println("Sorry, your Bag is empty!");
        // }else{
            //     while(itr.hasNext()){
        //         itr.next().getInformation();
        //     }
        // }
        int j = 0 ;
        if(i == 0){
            System.out.println("Sorry, your Bag is empty!");
        }else{
            for(j = 0; j < i; j++){
                // System.out.println(j);
                LISTOFMAPS.get(j).getInformation();
            }
        }
    }

    public void subMap(){
        this.mapsLeft -= 1;
    }

    public String readDescription(){
        return "this is the list of maps ..";
    }

}
