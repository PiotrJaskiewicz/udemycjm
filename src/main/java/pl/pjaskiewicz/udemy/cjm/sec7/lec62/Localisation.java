package pl.pjaskiewicz.udemy.cjm.sec7.lec62;

public class Localisation {
    private double longitude;
    private double latitude;
    private int buildingNumber;
    private int apartmentnumber;

    public Localisation(double longitude, double latitude, int buildingNumber, int apartmentnumber) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.buildingNumber = buildingNumber;
        this.apartmentnumber = apartmentnumber;
    }
}
