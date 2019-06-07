package Cats;

import java.util.ArrayList;

public class Cat {
    private String name;
    private int age;
    private Colorcat color;

    public Cat(){
        this.name = "Kot";
        this.age = 3;
    }
    public Cat(String name){
        this.name = name;
        this.age = 3;
    }
    public Cat(int age){
        this.name = "Kot";
        this.age = age;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



    public Colorcat setColor(Colorcat color){
        this.color=color;
    }

    public Colorcat getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "name: "+ getName()+"; "+"age: "+getAge();
    }

}