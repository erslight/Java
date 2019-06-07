package Cats;

import java.util.ArrayList;

public class Cat {
    private String name;
    private int age;
    private Colorcat color;
    private String catblabla;

    public Cat(){//конструктор без параметров
        this.name = "Kot";
        this.age = 3;
    }

    /*public Cat(String name){    //конструктор с одним параметром
        this.name = name;
        this.age = 3;
    }
    public Cat(int age){           //конструктор с одним параметром
        this.name = "Kot";
        this.age = age;
    }
    public Cat(String name, int age){     //конструктор с двумя параметрами
        this.name = name;
        this.age = age;
    }*/

    public String getCatblabla() {
        return catblabla;
    }

    public void setCatblabla(String catblabla) {
        this.catblabla = catblabla;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Colorcat getColor() {
        return color;
    }

    public void setColor(Colorcat color){
        this.color=color;
    }

    @Override
    public String toString() {
        return "name: "+ getName()+"; "+"age: "+getAge();
    }

}