package pl.pjaskiewicz.udemy.cjm.sec6;

public class Main {
    public static void main(String[] args) {

        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        String month = "january";
        switch (month) {
            case "January": case "january": case "JANUARY":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("June");
                break;
            case "November":
                System.out.println("Nov");
                break;
            default:
                System.out.println("Not sure");
        }

        char charValue = 'E';
        switch (charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
                default:
                    System.out.println("Could not find A, B, C, D or E");
                    break;
        }

    }
}
