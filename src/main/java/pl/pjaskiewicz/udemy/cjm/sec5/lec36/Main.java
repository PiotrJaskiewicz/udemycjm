package pl.pjaskiewicz.udemy.cjm.sec5.lec36;

public class Main {
    public static void main(String[] args) {
        System.out.println(area(-0.1));
        System.out.println(area(10));
        System.out.println(area(2.5,10));
        System.out.println(area(-0.2,10));
        System.out.println(area(2.5,-0.8));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return Math.PI * Math.pow(radius, 2);
        }
    }
    public static double area(double sidea, double sideb){
        if (sidea < 0 || sideb < 0){
            return -1;
        }else{
            return sidea * sideb;
        }
    }
}