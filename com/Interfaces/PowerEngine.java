package com.Interfaces;

public class PowerEngine implements Engine {
    
    @Override
    public void upgradeEngine(Engine engine){
        engine=new ElectricEngine();
    }
    @Override
    public void acc() {
        System.out.println("The PowerEngine acclerates");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void start() {
        System.out.println("The PowerEngine starts");

            // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() {
        System.out.println("The PowerEngine stops");

        // TODO Auto-generated method stub
        
    }
    
    
}
