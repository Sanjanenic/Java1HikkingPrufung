package at.campus02.iwi.cookathome;

import java.util.Arrays;

public class Cookapp {
    public static void main(String[] args) {


        CookSubscription erste = new CookSubscription();
        erste.age=24;
        erste.activePerWeek=5;
        erste.vegan=false;
        erste.veggie=false;

        System.out.println(erste.firstBox(24,false,false,5));
        System.out.println(Arrays.toString( erste.suggestPrice("Veggie",24))
               );

    }
}
