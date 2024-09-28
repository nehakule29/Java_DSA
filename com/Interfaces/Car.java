package com.Interfaces;

public class Car implements Engine,Brake {

    @Override
    public void brake() {
        System.out.println("Add brake");
        // TODO Auto-generated method stub
    }

    @Override
    public void start() {
        System.out.println("start the car");
        // TODO Auto-generated method stub
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
        // TODO Auto-generated method stub
    }

    @Override
    public void acc() {
        System.out.println("I accelerate");
        // TODO Auto-generated method stub
    }

    @Override
    public void upgradeEngine(Engine engine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'upgradeEngine'");
    }

    
}