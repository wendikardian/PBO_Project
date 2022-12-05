package items;

import interfaces.CanTakeItem;
import interfaces.CanTakeWeapon;

public class Weapon extends TakeableItem {

    private int damage;
    private static int DEFAULT_DAMAGE = 10;
    private static int DEFAULT_VOLUME = 5;

    public Weapon(String name, String description) {
        this(Weapon.DEFAULT_DAMAGE, Weapon.DEFAULT_VOLUME, name, description);
    }

    public Weapon(int damage, int VOLUME, String name, String description) {
        super(VOLUME, name, description);
        this.damage = damage;
    }


    public int attack() {
        return this.damage;
    }

    @Override
    public boolean use(CanTakeItem o) {
        try {
            ((CanTakeWeapon) o).switchWeapon(this);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void seeDescription(){
        System.out.println("This is " + this.DESCRIPTION);
    }

}