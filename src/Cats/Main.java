package Cats;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Cat cats = new Cat();       // создали cats (кота) из класса Cat
        System.out.println(cats.toString());


        ArrayList<String> cat = new ArrayList<String>();   //cat - это коллекция
        for(int i = 0; i<40; i++) {
            cat.add("Kot"+(i+1));
            System.out.println(cat.get(i));
        }
        for(int i = 0; i<40; i++) {
            if(i%2==0){
                this.cat.get(i).setColor = Colorcat.BLACK;
            }
        }
    }
}