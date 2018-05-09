package pl.pjaskiewicz.udemy.cjm.sec8.lec62.roomPJ;

public class Appearance {
    private Dimensions dimensions;
    private String color;
    private String materialType;
    private int quantity;

    public Appearance(Dimensions dimensions, String color, String materialType, int quantity) {
        this.dimensions = dimensions;
        this.color = color;
        this.materialType = materialType;
        this.quantity = quantity;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public String getMaterialType() {
        return materialType;
    }

    public int getQuantity() {
        return quantity;
    }
}
