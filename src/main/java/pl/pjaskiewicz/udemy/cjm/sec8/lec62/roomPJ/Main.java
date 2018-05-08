package pl.pjaskiewicz.udemy.cjm.sec7.lec62;

public class Main {
    public static void main(String[] args) {

        Dimensions livingroomDim = new Dimensions(3, 5, 6);
        Localisation livingroomLocalisation = new Localisation(18, 54, 6, 12);
        Chair chair = new Chair(new Appearance(new Dimensions(2,1,1), "black", "wooden", 6), true);

        Couch couch = new Couch(new Appearance(new Dimensions(2, 10, 4), "black", "leather", 1), 3);
        Stereo stereo = new Stereo(new Appearance(new Dimensions(1,1,1), "sliver", "steel/plastic", 1), 4, "230V");
        Table table = new Table(new Appearance(new Dimensions(1, 2, 3), "white", "wood", 1), true, 4);

        Room livingroom = new Room(livingroomDim, livingroomLocalisation, chair, couch, stereo, table);

        livingroom.isEnoughSpaceInTheRoom();
        table.foldableDimensions(4,5);
        System.out.println(table.getLegsQuantity());


    }
}
