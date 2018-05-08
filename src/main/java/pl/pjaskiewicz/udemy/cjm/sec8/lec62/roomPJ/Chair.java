package pl.pjaskiewicz.udemy.cjm.sec7.lec62;

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
