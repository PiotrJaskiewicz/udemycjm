package pl.pjaskiewicz.udemy.cjm.sec5.lec30;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateHighScorePosition(1000));
        System.out.println(calculateHighScorePosition(500));
        System.out.println(calculateHighScorePosition(100));
        System.out.println(calculateHighScorePosition(1));
        System.out.println(calculateHighScorePosition(950));
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        } return position;
    }
}
