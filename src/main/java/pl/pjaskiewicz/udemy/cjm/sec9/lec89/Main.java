package pl.pjaskiewicz.udemy.cjm.sec9.lec89;

import javafx.beans.binding.IntegerBinding;

import java.util.ArrayList;

class IntClass {
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
        for (int i = 0; i < 10; i++) {
            intArrayList01.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + intArrayList01.get(i).intValue());
        }
        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);//myDoubleValues.add(Double.valueOf(dbl));
            //java sama zamienia dbl na klasę Double
        }

        for (int i = 0; i <myDoubleValues.size();i++){
            double value = myDoubleValues.get(i);//double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " -> " + value);
        }


    }
}
