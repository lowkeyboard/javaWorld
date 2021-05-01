package com.company;

interface Land {
    public double calculateConsumption();

    public double calculateMaxSpeed();

    public double calculateTime(double km);

    public void cartrunk_capacity(int capacity);

}

interface Sea {
    public void length_information(int length);

    public int calculateCapacity();

    public double calculateCurrentKnot();
}

abstract class Vehicle implements Land, Sea {

    private String model_name;
    private String engine_type;
    private String transmission_type;
    private int hp;
    private int year;
    private double price;
    private double weight;

    // constructor
    public Vehicle(){
    }


    public void setName(String newModel) {
        newModel = model_name;
    }

    public String getName() {
        return model_name;
    }

    public void setEngine_type(String newEngine) {
        newEngine = engine_type;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setTransmission_type(String newTransmission) {
        transmission_type = newTransmission;
    }

    public String getTransmission_type() {
        return transmission_type;
    }

    public void setHp(int newHP) {
        hp = newHP;
    }

    public int getHp() {
        return hp;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {

        return super.toString();
    }



}


class Car extends Vehicle implements Land {

    private String brand;

    public Car() {
        super();
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public String getBrand() {
        return brand;
    }

    public double calculateConsumption() {
        return getPrice() + getHp();

    }

    public double calculateMaxSpeed() {
        return getPrice() - getWeight();
    }

    public double calculateTime(double km) {
        // System.out.println("takes" + km + "in 12 minutes");
        km = getYear() * getWeight();
        return km;
    }

    public void cartrunk_capacity(int capacity) {
        System.out.println("car consumption: "+ capacity);
    }

    @Override
    public void length_information(int length) {

    }

    @Override
    public int calculateCapacity() {
        return 0;
    }

    @Override
    public double calculateCurrentKnot() {
        return 0;
    }
}

class Truck extends Vehicle {
    private int maxLoadCapacity;

    public void setMaxLoadCapacity(int newmaxLoadCapacity) {
        maxLoadCapacity = newmaxLoadCapacity;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public Truck() {
        super();
    }

    public String toString() {
        return "Truck{" +
                "maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    public double calculateConsumption() {
        return getPrice() + getHp();

    }

    public double calculateMaxSpeed() {
        return getPrice() - getWeight();
    }

    public double calculateTime(double km) {
        // System.out.println("takes" + km + "in 12 minutes");
        km = getYear() * getWeight();
        return km;
    }

    public void cartrunk_capacity(int capacity) {
        System.out.println("car consumption: "+ capacity);
    }

    @Override
    public void length_information(int length) {

    }

    @Override
    public int calculateCapacity() {
        return 0;
    }

    @Override
    public double calculateCurrentKnot() {
        return 0;
    }
}


class Boat extends Vehicle {

    private int knot;
    private double windPower;
    private int lifejacket;

    @Override
    public String toString() {
        return "Boat{" +
                "knot=" + knot +
                ", windPower=" + windPower +
                ", lifejacket=" + lifejacket +
                '}';
    }

    public Boat() {
        super();
    }

    public void setKnot(int newKnot) {
        knot = newKnot;
    }

    public int getKnot() {
        return knot;
    }

    public void setWindPower(int newWindPower) {
        windPower = newWindPower;
    }

    public double getWindPower() {
        return windPower;
    }

    public void setLifejacket(int newLifeJacket) {
        lifejacket = newLifeJacket;
    }

    public int getLifejacket() {
        return lifejacket;
    }


    public void length_information(int length) {
        System.out.println("bot length" + length);
    }

    public int calculateCapacity() {
        return (int) (getLifejacket() * getWeight() * getYear());
    }

    public double calculateCurrentKnot() {
        return (double) (getWindPower() + getKnot() - getPrice());
    }

    @Override
    public double calculateConsumption() {
        return 0;
    }

    @Override
    public double calculateMaxSpeed() {
        return 0;
    }

    @Override
    public double calculateTime(double km) {
        return 0;
    }

    @Override
    public void cartrunk_capacity(int capacity) {

    }
}



