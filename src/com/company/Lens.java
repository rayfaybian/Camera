package com.company;

public class Lens {
    public String brand = "";
    public String name = "";
    public int focalLengthMin = 0;
    public int focalLengthMax = 0;

    public Lens(String brand, String name, int focalLengthMin, int getFocalLengthMax) {
        if (focalLengthMin > getFocalLengthMax) {
            System.out.println("focalLengthMin can´t be more than focalLengthMax!");
        } else {
            this.brand = brand;
            this.name = name;
            this.focalLengthMin = focalLengthMin;
            this.focalLengthMax = getFocalLengthMax;
        }
    }

    public String toString() {
        return brand + " " + name;
    }


    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public int getFocalLengthMax() {
        return focalLengthMax;
    }

}
