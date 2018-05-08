package pl.pjaskiewicz.udemy.cjm.sec7.lec62;

public class Dimensions {
    private int height;
    private int width;
    private int length;

    public Dimensions(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int calculateArea() {
        int objectArea = this.length * this.width;
        return objectArea;

    }

    public int calculateVolume() {
        int roomVolume = this.length * this.width * this.height;
        System.out.println("Room volume is " + roomVolume);
        return roomVolume;

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
