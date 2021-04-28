package com.bsen;

public class Main {

    public static void main(String[] args) {

        Cars cars = new Cars(1,"BMW",2021,"Gasoline");
        Cars cars1 = new Cars(2, "Mercedes", 2018, "Diesel");


        Cars[] vehicles = {cars, cars1};

        for (Cars vehicle : vehicles) {
            System.out.println(vehicle.brand);
        }

        CarMethods carMethods = new CarMethods();
        carMethods.start(cars);
        carMethods.stop(cars);
        carMethods.start(cars1);
        carMethods.stop(cars1);
        



    }
}
