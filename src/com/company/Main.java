package com.company;

// Driver class
class Main {
    public static void main(String[] args) {

        Car myObj = new Car();
        myObj.setBrand("ford");
        myObj.setHp(3);
        myObj.setWeight(100);
        myObj.setPrice(150);
        myObj.setYear(1930);

        System.out.println("car brand is: " + myObj.getBrand());
        System.out.println("car consumption: "+ myObj.calculateConsumption());
        System.out.println("car max speed: "+ myObj.calculateMaxSpeed());
        System.out.println("car takes : "+ myObj.calculateTime(10) + "km in 12 minutes");
        myObj.cartrunk_capacity(4);

        Truck myObj1 = new Truck();
        myObj1.setMaxLoadCapacity(8);
        myObj1.setHp(5);
        myObj1.setWeight(120);
        myObj1.setPrice(75);
        myObj1.setYear(1959);

        System.out.println("Truck maxloadcapacity"+ myObj1.getMaxLoadCapacity());
        System.out.println("Truck consumption: "+ myObj1.calculateConsumption());
        System.out.println("Truck max speed: "+ myObj1.calculateMaxSpeed());
        System.out.println("Truck time: "+ myObj1.calculateTime(5));

        Boat myObj2 = new Boat();
        myObj2.setKnot(8);
        myObj2.setWindPower(5);
        myObj2.setLifejacket(14);
        myObj2.setPrice(50);
        myObj2.setYear(1959);

        myObj2.length_information(789);
        System.out.println("boat capacity"+ myObj2.calculateCapacity());
        System.out.println("boat calculateCurrentKnot: "+ myObj2.calculateCurrentKnot());



    }
}