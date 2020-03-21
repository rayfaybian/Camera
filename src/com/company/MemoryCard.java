package com.company;

import java.util.Scanner;

public class MemoryCard {
    public String brand = "";
    public double totalCapacity = 0;
    public double freeCapacity = 0;
    public double freeCapacityInPercent = 0;
    public double remainingPhotos = 0;
    public int photosTaken = 0;
    Scanner userInterface = new Scanner(System.in);


    public MemoryCard(String brand, int totalCapacity) {
        this.brand = brand;
        this.totalCapacity = totalCapacity;
        this.freeCapacity = totalCapacity;
    }

    public void savePhoto() {
        if (freeCapacity < 5.0) {
            System.out.println("Photo can´t be saved! Not enough memory left!");
        } else {
            freeCapacity = freeCapacity - 5.0;
            photosTaken++;
        }
    }

    public double getFreeCapacityInPercent() {
        freeCapacityInPercent = (int) Math.round((100 / totalCapacity) * freeCapacity);
        return freeCapacityInPercent;
    }

    public double getRemainingPhotos() {
        remainingPhotos = (int) Math.round(freeCapacity / 5);
        return remainingPhotos;
    }

    public String toString() {
        return brand + "(" + totalCapacity + " MB)";
    }

    public void deletePhotos() {
        System.out.println("Low memory! ("+getFreeCapacityInPercent()+"%) Do you want to delete some photos? (y/n)");
        String answer = userInterface.next();
        if (answer.equals("y")) {
            System.out.println("There are " + photosTaken + " photos on this memorycard. " +
                    "How many photos do you want to delete?");
            int numberToDelete = userInterface.nextInt();
            photosTaken = photosTaken - numberToDelete;
            freeCapacity = freeCapacity + (numberToDelete * 5);
            System.out.println(numberToDelete + " photos deleted.\n" + getFreeCapacityInPercent() + "% storage/"
                    + getRemainingPhotos() + " remaining photos left");
        } else {
            System.out.println(getFreeCapacityInPercent() + "% storage/" + getRemainingPhotos() + " remaining photos left");
        }
    }
}
