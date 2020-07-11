package com.account.LearnInterface;

public class Car implements Vehicle {

    private String brand;

    public void setBrand(String brand) {this.brand = brand;}

    public void sayBrand() {
        System.out.println("This a " + brand);
    }

    public void numOfTyres() {
        System.out.println(brand + " has four tyres.");
    }
}
