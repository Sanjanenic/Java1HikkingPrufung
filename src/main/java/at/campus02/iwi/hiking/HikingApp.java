package at.campus02.iwi.hiking;

import at.campus02.iwi.music.Album;

import java.util.Arrays;

public class HikingApp {
    public static void main(String[] args) {
        Hiking a = new Hiking();
        a.print();

        int x = a.totalNrObstacles('H');
        System.out.println(x);
        int x1 = a.totalNrObstacles('i');
        System.out.println(x1);


int[]ergebnis;
ergebnis=a.countObstaclesPerRow(2);
        System.out.println(Arrays.toString(ergebnis));

    }
}
