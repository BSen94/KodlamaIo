package com.bsen;

public class Cars {
    Integer id;
    String brand;
    int year;
    String fuel;

    public Cars(Integer id, String brand, int year, String fuel) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
