package Cats;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Cat cats = new Cat();
        System.out.println(cats.toString());
        ArrayList<String> cat = new ArrayList<String>();
        for(int i = 0; i<40; i++) {
            cat.add("Kot"+(i+1));
            System.out.println(cat.get(i));
        }
    }
}