package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public abstract class Plant implements Growable, Drinkable{
    private final String name;
    private final String сountry;
    private String hight;
    private int moistureLevel;  //уровень влаги
    private final PotColor pot; //горшок

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", сountry='" + сountry + '\'' +
                ", hight='" + hight + '\'' +
                ", moistureLevel=" + moistureLevel +
                ", pot='" + pot + '\'' +
                '}';
    }

    public abstract String addFertilizer(String fertilizer);    //добавить удобрение
}
