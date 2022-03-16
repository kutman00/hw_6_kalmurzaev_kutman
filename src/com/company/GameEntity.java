package com.company;

public class GameEntity {
    private int bossDamage;
    private int bossHealth;

    public GameEntity(int bossDamage, int bossHealth) {
        this.bossDamage = bossDamage;
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }
}
