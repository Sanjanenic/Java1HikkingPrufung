package at.campus02.iwi.music;

public class Album {
public  int nrSongs;
public double  shortestSong;
public double  longestSong;

public double averageSongLength(){
    double erg=0;
    erg=(shortestSong+longestSong)/2;
    return erg;
}
public double totalLength() {
    double erg=0;
    erg=averageSongLength()*nrSongs;
    return  erg;
}
public  boolean fitsOnMedium(int minutes) {
    if((nrSongs*averageSongLength()/60)<=minutes){
        return true;
    }
    else{
        return false;
    }
}
}
