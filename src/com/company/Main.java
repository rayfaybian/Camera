package com.company;

public class Main {

    public static void main(String[] args) {

        //Aufgabe Fotoapparat

        digicam canon = new digicam();

        canon.setBrand("Canon");
        canon.setModel("Ixus 185");
        canon.setYear(2018);
        canon.setResolution(19);
        canon.setFocalLength(5,40);
        canon.setMadeIn("Japan");
        canon.setPrice(99.99);

        canon.getSpecsheet();

        digicam panasonic = new digicam();

        panasonic.setBrand("Panasonic");
        panasonic.setModel("DC-TZ202EG-K");
        panasonic.setYear(2019);
        panasonic.setResolution(20);
        panasonic.setFocalLength(8,132);
        panasonic.setMadeIn("Japan");
        panasonic.setPrice(619.00);

        panasonic.getSpecsheet();

        digicam sony = new digicam();

        sony.setBrand("Sony");
        sony.setModel("Cyber shot™ DSC-RX100");
        sony.setYear(2020);
        sony.setResolution(20);
        sony.setFocalLength(28,100);
        sony.setMadeIn("Japan");
        sony.setPrice(299.90);

        sony.getSpecsheet();


        //Aufgabe Fotoapparat1

        dslr myCanon = new dslr("Canon","5d Mark IV", 2016);

        lens standardKitLens = new lens("Canon","Wide Angle",18,35);

        lens telephotoLens = new lens("Canon","Telephoto", 70,200);

        memoryCard privateMemoryCard = new memoryCard("Medion",32);
        memoryCard businessMemoryCard = new memoryCard("Sony",1024);

        myCanon.setLens(telephotoLens);
        myCanon.setMemoryCard(privateMemoryCard);

        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.setMemoryCard(businessMemoryCard);
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.setLens(standardKitLens);
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();
        myCanon.makePhoto();

        System.out.println(businessMemoryCard.getFreeCapacityInPercent());
        System.out.println(businessMemoryCard.getRemainingPhotos());

        System.out.println(privateMemoryCard.getFreeCapacityInPercent());
        System.out.println(privateMemoryCard.getRemainingPhotos());



    }
}
