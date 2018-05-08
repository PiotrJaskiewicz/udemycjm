package pl.pjaskiewicz.udemy.cjm.sec7.lec62;

public class Stereo {

    private Appearance appearance;
    private int speakers;
    private String power;

    public Stereo(Appearance appearance, int speakers, String power) {
        this.appearance = appearance;
        this.speakers = speakers;
        this.power = power;
    }


    public Appearance getAppearance() {
        return appearance;
    }

    public int getSpeakers() {
        return speakers;
    }

    public String getPower() {
        return power;
    }
}
