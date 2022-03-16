package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(50, 700);
        boss.weapon.setName("AK47");
        boss.weapon.setTip("firearms");
        System.out.println(boss.printInfo());
        Skeleton skeleton = new Skeleton(50, 700, 20);
        skeleton.weapon.setTip(" ");
        skeleton.weapon.setName("AK47");
        System.out.println(skeleton.printInfo());
        Skeleton skeleton1 = new Skeleton(60, 800, 30);
        skeleton1.weapon.setTip("firearms");
        skeleton1.weapon.setName("SAIGA");
        System.out.println(skeleton1.printInfo());
    }
}
