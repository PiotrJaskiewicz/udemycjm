package pl.pjaskiewicz.udemy.cjm.sec6.lec38.PlayingCat;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if ((!summer && temperature >=25 && temperature<=35)||
                (summer && temperature >=25 && temperature<=45) ){
            return true;
        }else
            return false;
    }
}