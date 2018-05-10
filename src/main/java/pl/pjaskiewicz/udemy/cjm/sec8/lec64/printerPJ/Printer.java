package pl.pjaskiewicz.udemy.cjm.sec8.lec64.printerPJ;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Value is out of the limits");
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public int fillUpTheToner(int tonerQuantity) {
        if (tonerQuantity + tonerLevel <= 100){
           return tonerLevel += tonerQuantity;
        }else{
            return tonerLevel = 100;
        }

    }

    public int inkConsumption(int printedPages) {
        return this.tonerLevel = this.tonerLevel - printedPages / 100;
    }

    public int printingPage(int printingPages, boolean oneSide) {
        if (this.tonerLevel > printingPages / 100) {
            if (this.isDuplex) {
                if (oneSide) {
                    this.tonerLevel = this.tonerLevel - printingPages / 100;

                    return numberOfPagesPrinted += printingPages;
                } else {
                    this.tonerLevel = this.tonerLevel - printingPages / 100;

                    return numberOfPagesPrinted += 2 *
                            printingPages;

                }
            } else if (!this.isDuplex && oneSide) {
                this.tonerLevel = this.tonerLevel - printingPages / 100;

                return numberOfPagesPrinted += printingPages;
            } else {
                System.out.println("Printer cannot print on both sides");
                return -1;

            }
        } else {
            System.out.println("Not enough ink, please refill");
            return -1;
        }
    }

    public int getTonerLevel() {
        System.out.print("Current toner level equals to ");
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        System.out.print("Total number of printed pages equal to ");
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
