package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

import java.util.ArrayList;
import java.util.Arrays;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            ArrayList<Integer> firstList = new ArrayList<>();
            for (int i = 1; i <= first; i++) {
                if (first % i == 0) {
                    firstList.add(i);
                }
            }
            ArrayList<Integer> secondList = new ArrayList<>();
            for (int i = 1; i <= second; i++) {
                if (second % i == 0) {
                    secondList.add(i);
                }
            }
            ArrayList<Integer> commonDivisorsList = new ArrayList<>();
            for (int i = 0; i < firstList.size(); i++) {
                for (int j = 0; j < secondList.size(); j++) {
                    if (firstList.get(i) == secondList.get(j)) {
                        commonDivisorsList.add(firstList.get(i));
                    }
                }
            }
            return commonDivisorsList.get(commonDivisorsList.size() - 1);
        }

    }
}
