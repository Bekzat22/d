public class Boss extends GameEntity {
    Weapon weapon;
    public  String printInfo(){
        return "Name-"+ getWeapon().getName()+";Type-"+ getWeapon().getType()+";Health-"+getHealth()+";Damage-"+getDamage();

    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
