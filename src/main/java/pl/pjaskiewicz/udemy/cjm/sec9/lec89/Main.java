package pl.pjaskiewicz.udemy.cjm.sec9.lec89;

import javafx.beans.binding.IntegerBinding;

import java.util.ArrayList;

class IntClass{
private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Piotr");

       // ArrayList<int> intArrayList = new ArrayList<int>(); //to nie zadziała bo ArrayList nie przyjmuje typów prostych
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(new Integer(21));


        Double doubleValue = new Double(12.454);

        ArrayList<Integer> intArrayList01 = new ArrayList<>();
        for(int i=0;i<10;i++){
            intArrayList01.add(Integer.valueOf(i));
        }

        for(int i=0;i<10;i++){
            System.out.println(i + " -> " + intArrayList01.get(i).intValue());
        }




    }
}
