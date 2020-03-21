package com.company;

public class Main {

    public static void main(String[] args) {

        //Aufgabe Fotoapparat

        Digicam canon = new Digicam();

        canon.setBrand("Canon");
        canon.setModel("Ixus 185");
        canon.setYear(2018);
        canon.setResolution(19);
        canon.setFocalLength(5,40);
        canon.setMadeIn("Japan");
        canon.setPrice(99.99);

        canon.getSpecsheet();

        Digicam panasonic = new Digicam();

        panasonic.setBrand("Panasonic");
        panasonic.setModel("DC-TZ202EG-K");
        panasonic.setYear(2019);
        panasonic.setResolution(20);
        panasonic.setFocalLength(8,132);
        panasonic.setMadeIn("Japan");
        panasonic.setPrice(619.00);

        panasonic.getSpecsheet();

        Digicam sony = new Digicam();

        sony.setBrand("Sony");
        sony.setModel("Cyber shot™ DSC-RX100");
        sony.setYear(2020);
        sony.setResolution(20);
        sony.setFocalLength(28,100);
        sony.setMadeIn("Japan");
        sony.setPrice(299.90);

        sony.getSpecsheet();


        //Aufgabe Fotoapparat1

        Dslr myCanon = new Dslr("Canon","5d Mark IV", 2016);

        Lens standardKitLens = new Lens("Canon","Wide Angle",18,35);

        Lens telephotoLens = new Lens("Canon","Telephoto", 70,200);

        MemoryCard privateMemoryCard = new MemoryCard("Medion",32);
        MemoryCard businessMemoryCard = new MemoryCard("Sony",1024);

        myCanon.setLens(telephotoLens);
        myCanon.setMemoryCard(privateMemoryCard);

        myCanon.makePhoto(7);

        myCanon.setMemoryCard(businessMemoryCard);
        myCanon.makePhoto(5);

        myCanon.setLens(standardKitLens);
        myCanon.makePhoto(7);


        System.out.println(businessMemoryCard.getFreeCapacityInPercent());
        System.out.println(businessMemoryCard.getRemainingPhotos());

        System.out.println(privateMemoryCard.getFreeCapacityInPercent());
        System.out.println(privateMemoryCard.getRemainingPhotos());



    }
}
