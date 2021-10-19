package org.example.entity;

import lombok.Getter;
@Getter

public class Flower extends Plant{
    private final String colorOfFlower;

    public Flower(String name, String сountry, String hight, int moistureLevel, PotColor pot, String colorOfFlower) {
        super(name, сountry, hight, moistureLevel, pot);
        this.colorOfFlower = colorOfFlower;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + getName() + '\'' +
                ", сountry='" + getСountry() + '\'' +
                ", hight=" + getHight() +
                ", moistureLevel=" + getMoistureLevel() +
                ", pot=" + getPot() +
                "colorOfFlower='" + colorOfFlower + '\'' +
                '}';
    }

    @Override
    public String grow(int cm) {
        String height = "Grow: " + cm + " cm every month";
        System.out.println(height);
        return height;
    }

    @Override
    public void drink() {
        System.out.println("Watering: melt, rain or filtered drinking water");
    }

    @Override
    public String addFertilizer(String fertilizer) {
        String addfertilizer = "Fertilizer: " + fertilizer + " for my health";
        System.out.println(addfertilizer);
        return addfertilizer;
    }
}
