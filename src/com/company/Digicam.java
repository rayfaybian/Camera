package com.company;

public class Digicam {
    private String brand = "";
    private String model = "";
    private int year = 0;
    private int resolution = 0;
    public int focalLengthMin = 0;
    public int focalLengthMax = 0;
    private String madeIn = "";
    private double price = 0.0;


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {

        return brand;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setFocalLength (int focalLengthMin, int focalLengthMax){
        if (focalLengthMin > focalLengthMax){
            System.out.println("focalLengthMin can´t be more than focalLengthMax!");
        } else{
            this.focalLengthMin = focalLengthMin;
            this.focalLengthMax = focalLengthMax;
        }
    }

    public int getFocalLengthMin () {
        return focalLengthMin;
    }

    public int getFocalLengthMax () {
        return focalLengthMax;
    }

    public void setPrice (double price) {
        this.price = price;
    }
    public double getPrice (){
        return price;
    }

    public void makePhoto() {
        System.out.println("click!");
    }


    public void getSpecsheet() {
        System.out.println("Brand: " + brand + "\nModel: " +  model + "\nYear: " + year + "\nResolution: " + resolution +
                " MP\nFocal Length min.: " + focalLengthMin + " mm\nFocal Length Max.: " + focalLengthMax + " mm\nMade in: "
        + madeIn + "\nPrice: € " + price + "\n\n");
    }


}
