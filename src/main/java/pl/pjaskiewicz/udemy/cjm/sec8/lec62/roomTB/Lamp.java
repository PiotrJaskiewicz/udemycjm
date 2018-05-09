package pl.pjaskiewicz.udemy.cjm.sec8.lec62.roomTB;

public class Lamp {
    private String style;
    private boolean battery;
    private int globerating;

    public Lamp(String style, boolean battery, int globerating) {
        this.style = style;
        this.battery = battery;
        this.globerating = globerating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGloberating() {
        return globerating;
    }
}
