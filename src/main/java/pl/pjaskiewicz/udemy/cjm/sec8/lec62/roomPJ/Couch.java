package pl.pjaskiewicz.udemy.cjm.sec7.lec62;

public class Couch {
    private Appearance appearance;
    private int personSize;

    public Couch(Appearance appearance, int personSize) {
        this.appearance = appearance;
        this.personSize = personSize;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public int getPersonSize() {
        return personSize;
    }
}
