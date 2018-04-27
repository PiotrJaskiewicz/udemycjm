package pl.pjaskiewicz.udemy.cjm.sec1;
public class Main {
    public static void main(String[] args) {

        double a = 3;
        double b = 4;
        double c = 5;

        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
            System.out.println("trojkat jest prostokatny");
        } else {
            System.out.println("trojkat NIE jest prostokatny");
        }
    }
}
