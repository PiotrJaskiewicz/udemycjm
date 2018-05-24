package pl.pjaskiewicz.udemy.cjm.sec5.lec37;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(123, 9));
        System.out.println(getDurationString(7389));

        System.out.println(leadingZeros(-1));



    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds < 60) {
            int finalHours = minutes / 60;
            int finalMinutes = minutes % 60;

            return leadingZeros(finalHours) + "h " + leadingZeros(finalMinutes)+ "m " + leadingZeros(seconds)+ "s";

            /*String hoursString = finalHours + "h"; // czemu h nie przechodzi dalej? tutaj hoursString mogloby chyba być cokolwiek bo i tak ponizej nadpisujemy?
            if (finalHours < 10) {
                hoursString = "0" + finalHours;
            }
            String minutesString = finalMinutes + "m";
            if (finalMinutes < 10) {
                minutesString = "0" + finalMinutes;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + seconds;
            }

            return hoursString + "h " + minutesString + "m " + secondsString + "s";    */

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
    public static String leadingZeros(int value){ //zamienia int na Stringa i dodaje zero jak cygra 0-9
        if(value >=0 && value < 10){
            return "0" + value;
        }
        return Integer.toString(value);
    }
}
