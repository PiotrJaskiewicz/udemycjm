package pl.pjaskiewicz.udemy.cjm.sec7.lec62;

public class Localisation {
    private double longitude;
    private double latitude;
    private int buildingNumber;
    private int apartmentNumber;

    public Localisation(double longitude, double latitude, int buildingNumber, int apartmentNumber) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
