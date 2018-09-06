package pl.pjaskiewicz.udemy.cjm.sec5.lec34.CodingExercises.TeenNumberChecker;

public class TeenNumberChecker {
    public static boolean hasTeen(int par1, int par2, int par3) {
        if (par1 >= 13 && par1 <= 19 ||
                par2 >= 13 && par2 <= 19 ||
                par3 >= 13 && par3 <= 19) {
            return true;
        } else
            return false;
    }
}
