package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cat {
    private static int catcount = 0;
    String name;
    int age;
    int livesremaining;

    public void meow(){
        System.out.println("Meow");
    }
    public Cat(){
        catcount++;
    }

    public static int getCatcount(){
        return catcount;
    }
}