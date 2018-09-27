package com.company;

import java.sql.SQLOutput;

public class Sirkel{


    public double startverdi;
    public double diameter;
    public double omkrets;
    public double areal;
    public double pi = Math.PI;

    private double radius;



    public double radius (double startverdi){
        if (startverdi > 0){
        this.startverdi= startverdi;

        }else{
            startverdi = 0;
            System.out.println("Husk at sirkelens radius må ha positiv verdi");
       }
        return startverdi;
      }


    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = startverdi;

        if (radius > 0){
       this.radius = radius;

       }else{
       this.radius = 0;
}

     }

      public void Diametermetode(){
        System.out.println(diameter = startverdi*2);
        return;
}
      public void Omkretsmetode(){
          System.out.println(omkrets = diameter * pi);
          return;
    }

      public void Arealmetode (){
          System.out.println(areal = pi * Math.pow(startverdi, 2));
          System.out.println("\n");
          return;
    }
}
