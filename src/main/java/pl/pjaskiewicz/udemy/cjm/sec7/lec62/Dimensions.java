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

    public int calculateArea(){
        int roomArea = this.length * this.width;
        System.out.println("Room area is " + roomArea);
        return roomArea;

    }

    public int calculateVolume(){
        int roomVolume = this.length * this.width * this.height;
        System.out.println("Room volume is " + roomVolume);
        return roomVolume;

    }
}
