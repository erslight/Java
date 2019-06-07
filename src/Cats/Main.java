package Cats;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){




        ArrayList<Cat> catList = new ArrayList<>();   //catList - это коллекция
        for(int i = 0; i<40; i++) {
            Cat cats = new Cat();       // создали cats (кота) из класса Cat
            System.out.println(cats.toString());
            catList.add(cats);
            System.out.println(catList.get(i));
        }
        for(int i = 0; i<catList.size(); i++) {
            if(i%2==0){
                catList.get(i).setColor(Colorcat.BLACK);
                System.out.println(catList.get(i));
            }
        }
    }
}