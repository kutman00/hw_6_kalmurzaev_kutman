package com.company;

public class Skeleton extends Boss {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNamber(int number) {
        this.number = number;
    }

    public Skeleton(int bossDamage, int bossHealth, int number) {
        super(bossDamage, bossHealth);
        this.number = number;
    }

    public String printInfo() {
        return super.printInfo() + " " + number;
    }
}
