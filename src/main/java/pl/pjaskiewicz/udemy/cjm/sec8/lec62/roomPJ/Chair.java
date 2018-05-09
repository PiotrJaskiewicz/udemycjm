package pl.pjaskiewicz.udemy.cjm.sec8.lec62.roomPJ;

public class Chair {

    private Appearance appearance;
    private boolean isComfortable;

    public Chair(Appearance appearance, boolean isComfortable) {
        this.appearance = appearance;
        this.isComfortable = isComfortable;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public boolean isComfortable() {
        return isComfortable;
    }
}
