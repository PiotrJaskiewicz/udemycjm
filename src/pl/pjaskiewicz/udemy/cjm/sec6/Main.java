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

    }
}