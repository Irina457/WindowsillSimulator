package org.example.entity;

import lombok.Getter;

@Getter

public enum PotColor {
    BLACK("black"), WHITE("white"), BROWN("brown");
    private final String value;

    PotColor(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value + ", ";
    }
}
