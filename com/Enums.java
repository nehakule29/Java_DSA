package com;

public class Enums {
    enum Week{
        Monday,Tuesday;     //enum constants
        // public, static or final
        //type is week
        Week(){
            System.out.println("Constructor called for"+this);
        }  //this is not public or protected,only private or default]
}   
    public static void main(String[] args) {
        Object ele;
        Week week;
       
        week=Week.Monday;
        System.out.println();
    }

}
