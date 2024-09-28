package com.Interfaces;

import org.w3c.dom.stylesheets.MediaList;

public class NiceCar implements Brake {
    private  Engine engine;
    private Media M1=new CDplayer();
    public NiceCar(){
        engine=new PowerEngine();

    }

    public NiceCar(Engine engine){
        this.engine=engine;  

    }
    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }


    public void stop(){
        engine.stop();
    }

    public void start(){
        engine.start();
    }

    public void playMusic(){
        M1.startMusic();
    }
    public void stopMusic(){
        M1.stopMusic();
    }

    @Override
    public void brake() {
        System.out.println(" Brake");
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'brake'");
    }

    }
