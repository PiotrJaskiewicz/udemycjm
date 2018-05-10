package pl.pjaskiewicz.udemy.cjm.sec8.lec64.printerPJ;

public class Main {
    public static void main(String[] args) {
        Printer printerTwoSides = new Printer(100, 0, true);

        printerTwoSides.printingPage(1000, true);
        printerTwoSides.printingPage(1000, false);

        System.out.println(printerTwoSides.getNumberOfPagesPrinted());
        System.out.println(printerTwoSides.getTonerLevel());

        System.out.println("**************");

        Printer printerOneSides = new Printer(100, 0, false);
        printerOneSides.printingPage(1000, true);
        System.out.println(printerOneSides.getNumberOfPagesPrinted());
        System.out.println(printerOneSides.getTonerLevel());

        printerOneSides.printingPage(1000, false);

        printerOneSides.fillUpTheToner(5);
        System.out.println(printerOneSides.getTonerLevel());

        printerOneSides.printingPage(1000, true);
        System.out.println(printerOneSides.getNumberOfPagesPrinted());
        System.out.println(printerOneSides.getTonerLevel());

        printerOneSides.fillUpTheToner(100);
        System.out.println(printerOneSides.getTonerLevel());



    }
}
