public class Boss extends GameEntity {
    public String printInfo(){
        return "Health: " + getHealth() + " Damage: " + getDamage() + " Weapon Type: " + getWeapon().getWeapon() +
                " Weapon Name: " + getWeapon().getWeaponName();
    }
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
