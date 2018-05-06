package pl.pjaskiewicz.udemy.cjm.sec7.lec61;

import java.sql.SQLOutput;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + " , " + y + " position, in color " + color);
    }


}
