package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double gjennomssnitt;
        double radsum;
        double radsum1 = 0;
        double radsum2 = 0;
        double radsum3 = 0;

        Scanner input = new Scanner(System.in);
        Sirkel sirkel1 = new Sirkel();


        for(int tell = 0; tell < 3; tell++){

            if(tell == 0){
                System.out.println("skriv startverdien til den 1. sirkelens radius");
                sirkel1.radius(input.nextDouble());

                System.out.println("SIRKEL 1:");

                radsum1 = sirkel1.startverdi;
                System.out.println("radiussen til sirkelen ble satt til = " +radsum1);

            }else if(tell == 1){
                System.out.println("skriv startverdien til den 2. sirkelens radius");
                sirkel1.radius(input.nextDouble());

                System.out.println("SIRKEL 2:");

                radsum2 = sirkel1.startverdi;
                System.out.println("radiussen til sirkelen ble satt til = " +radsum2);

            } else {
                System.out.println("skriv startverdien til den 3. sirkelens radius");
                sirkel1.radius(input.nextDouble());

                System.out.println("SIRKEL 3:");

                radsum3= sirkel1.startverdi;
                System.out.println("radiussen til sirkelen ble satt til= " +radsum3);
            }

            if(sirkel1.startverdi > 0){


            System.out.println("\n" +
                "Diameteren til sirkelen er ");
            sirkel1.Diametermetode();

            System.out.println("\n" +
                    "omkretsen til sirkelen er ");
            sirkel1.Omkretsmetode();

            System.out.println("\n" +
                "arealet til sirkelen er ");
            sirkel1.Arealmetode();


    }}
        radsum = radsum1 + radsum2 + radsum3;
        System.out.println("summen av radiussene =" + radsum);

        gjennomssnitt =radsum/3;
        System.out.println( "gjennomsnittet av radiussene = " + gjennomssnitt);

        if(gjennomssnitt == 0){
            System.out.println("Programmet fant ingen verdier for radius, og kunne derfor ikke finne et gjennomsnitt. \n"
                    + "Om problemet oppstår flere ganger, kontakt kundeservice på MakeMyStupidCirkle@cirkle.com");
        }
    }
}
