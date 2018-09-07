package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

import java.util.ArrayList;

public class SharedDigit {

    public static boolean hasSharedDigit(int par1, int par2) {
        if ((par1 < 10 || par1 > 99) ||
                par2 < 10 || par2 > 99) {
            return false;
        } else {
            int par1First = par1 / 10;
            System.out.println(par1First);
            int par1Second = par1 % 10;
            System.out.println(par1Second);
            int par2First = par2 / 10;
            System.out.println(par2First);
            int par2Second = par2 % 10;
            System.out.println(par2Second);

            if (par1First == par2First ||
                    par1First == par2Second ||
                    par1Second == par2First ||
                    par1Second == par2Second) {
                return true;
            } else
                return false;

        }
    }
}
