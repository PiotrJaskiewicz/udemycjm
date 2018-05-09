package pl.pjaskiewicz.udemy.cjm.sec8.lec62.roomPJ;

public class Table {
    private Appearance appearance;
    private boolean isFoldable;
    private int legsQuantity;

    public Table(Appearance appearance, boolean isFoldable, int legsQuantity) {
        this.appearance = appearance;
        this.isFoldable = isFoldable;
        this.legsQuantity = legsQuantity;
    }

    public void foldableDimensions(int width, int length) {
        if (this.isFoldable) {
            System.out.println("Table dimensions when folded " + width + " , " + length);
        }
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public boolean isFoldable() {
        return isFoldable;
    }

    public int getLegsQuantity() {
        return legsQuantity;
    }
}
