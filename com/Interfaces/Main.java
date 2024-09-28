package com.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.acc();

        car1.start();
        car1.brake();

        NiceCar car=new NiceCar();
        car.start();
        car.stop();
        car.playMusic();
        car.upgradeEngine();
        car.start();
    }

}
