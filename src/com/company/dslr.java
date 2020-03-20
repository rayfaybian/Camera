package com.company;

import java.util.Scanner;

public class dslr {

    private String brand = "";
    private String model = "";
    private lens lensInUse = null;
    private memoryCard memoryCardInUse = null;
    Scanner userInterface = new Scanner(System.in);

    public dslr(String brand, String model, int year) {
    }

    public void setLens(lens lensInUse) {
        this.lensInUse = lensInUse;
        System.out.println("I switched my lens to " + getLensInUse());
    }

    public String getLensInUse() {
        return lensInUse.toString();
    }

    public void setMemoryCard(memoryCard memoryCardInUse) {
        this.memoryCardInUse = memoryCardInUse;
        System.out.println("I switched my memorycard to " + getMemoryCardInUse());
    }

    public String getMemoryCardInUse() {
        return memoryCardInUse.toString();
    }

    public void makePhoto() {
        System.out.println("Click!");
        memoryCardInUse.savePhoto();
        if ((memoryCardInUse.getRemainingPhotos()<3.0)||(memoryCardInUse.getFreeCapacityInPercent()<5.0)){
            memoryCardInUse.deletePhotos();
        }
    }

    public void checkMemory() {
        System.out.println(getMemoryCardInUse() + " Status: " + memoryCardInUse.getFreeCapacityInPercent() + "% unused Memory left");
    }

    public void checkRemainingPhotos() {
        System.out.println("Remaining Memory on " + getMemoryCardInUse() + " lasts for " + memoryCardInUse.getRemainingPhotos() + " photos");
    }

    public String toString() {
        return brand + model;
    }


}





