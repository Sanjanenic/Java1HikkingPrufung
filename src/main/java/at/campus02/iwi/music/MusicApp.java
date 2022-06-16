package at.campus02.iwi.music;

public class MusicApp {
    public static void main(String[] args) {
        Album a1=new Album();
        Album a2=new Album();
         a1.nrSongs=8;
         a1.longestSong=300;
         a1.shortestSong=150;

        System.out.println(a1.averageSongLength());
        System.out.println(a1.fitsOnMedium(20));
        System.out.println(a1.totalLength());
    }
}


