package pl.pjaskiewicz.udemy.cjm.sec8.lec62.roomPJ;

public class Room {
    private Dimensions dimensions;
    private Localisation localisation;
    private Chair chair;
    private Couch couch;
    private Stereo stereo;
    private Table table;

    public Room(Dimensions dimensions, Localisation localisation, Chair chair, Couch couch, Stereo stereo, Table table) {
        this.dimensions = dimensions;
        this.localisation = localisation;
        this.chair = chair;
        this.couch = couch;
        this.stereo = stereo;
        this.table = table;
    }

    public void isEnoughSpaceInTheRoom(){
        int roomArea = dimensions.calculateArea();
        System.out.println("Room area is " + roomArea);
        int furnitureArea = chair.getAppearance().getDimensions().calculateArea() +
                couch.getAppearance().getDimensions().calculateArea() +
                table.getAppearance().getDimensions().calculateArea();
        System.out.println("Furniture area is " + furnitureArea);
        if(roomArea >= furnitureArea){
            System.out.println("There is enough space in the room");


        }else
            System.out.println("Too much objects, room overloaded!!!");;


    }

    }
