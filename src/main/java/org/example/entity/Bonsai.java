package org.example.entity;

import lombok.Getter;
@Getter

public class Bonsai extends Plant {
    private final String leaf;

    public Bonsai(String name, String сountry, String hight, int moistureLevel, PotColor pot, String leaf) {
        super(name, сountry, hight, moistureLevel, pot);
        this.leaf = leaf;
    }

    @Override
    public String toString() {
        return "Bonsai{" +
                "name='" + getName() + '\'' +
                ", сountry='" + getСountry() + '\'' +
                ", hight=" + getHight() +
                ", moistureLevel=" + getMoistureLevel() +
                ", pot=" + getPot() +
                "leaf='" + leaf + '\'' +
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
        System.out.println("Watering: watered with collected rainwater");
    }

    @Override
    public String addFertilizer(String fertilizer) {
        String addfertilizer = "Fertilizer: " + fertilizer + " for health and grown";
        System.out.println(addfertilizer);
        return addfertilizer;
    }
}
