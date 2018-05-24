package pl.pjaskiewicz.udemy.cjm.sec5.lec37;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(150, 0));



    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds < 60) {
            int finalHours = minutes / 60;
            int finalMinutes = minutes % 60;

            String hoursString = finalHours + "h";
            if (finalHours < 10) {
                hoursString = "0" + finalHours;
            }

            return hoursString + "h " + finalMinutes + "m " + seconds + "s";

        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int finalSeconds = seconds % 60;
            int finalMinutes = seconds / 60;

            return getDurationString(finalMinutes, finalSeconds);

        } else
            return "Invalid value";
    }
}
