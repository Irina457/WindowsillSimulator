package org.example;
import org.example.entity.*;

/*
Необходимо создать "Симулятор подоконника"
Условия:
1) Цветы могут быть разными, но все они - растения (и им нужен свой уровень влаги для каждого)
2) Каждое растение растёт по-разному, пьёт тоже по-своему
3) У каждого растения есть горшок определенного цвета (цвета ограничены)
4) Клиент (в наших условиях - это метод main) создаёт растения,
растения растут и потребляют влагу и получают удобрения.
*/

public class Customer {
    public static void main(String[] args){
        Flower rose = new Flower("rose", "China", "30-45 cm",80, PotColor.BLACK,"red");
        System.out.println(rose);
        rose.grow(10);
        rose.drink();
        rose.addFertilizer("urea, nitroammophoska");
        System.out.println("");

        Plant charmomile = new Flower("charmomile", "Poland", "30-60 cm", 85, PotColor.WHITE,"white");
        System.out.println(charmomile);
        charmomile.grow(20);
        charmomile.drink();
        charmomile.addFertilizer("urea");
        System.out.println("");

        Plant ficusBonsai = new Bonsai("ficus bonsai","China", "60 cm", 75, PotColor.BROWN,"simple");
        System.out.println(ficusBonsai);
        ficusBonsai.grow(1);
        ficusBonsai.drink();
        ficusBonsai.addFertilizer("potassium and phosphorus");
    }
}
