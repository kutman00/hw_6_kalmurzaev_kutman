package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int bossDamage, int bossHealth) {
        super(bossDamage, bossHealth);
    }

    public String printInfo() {
        return getBossDamage() + " " + getBossHealth() + " " + weapon.getName() + " " + weapon.getTip();
    }
}
