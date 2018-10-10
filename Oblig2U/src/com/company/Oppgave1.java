package com.company;
import java.util.Scanner;


public class Oppgave1 {
    int i,is, sum;
    int teller = 0;


    Scanner input = new Scanner(System.in);

    public void Istartaverdi (){
        System.out.println("Hvor ønsker du at rekken skal starte?");
        i = input.nextInt();
    }
    public void Issluttverdi(){
        System.out.println("Hvor ønsker du at rekken skal ende?");
        is = input.nextInt();
    }

    public void utregning (){
        if(i < is){
            do {
                if (teller == 10) {
                    System.out.println();
                    teller = 0;
                }
                sum += i;
                System.out.print(" + " + i);
                i++;
                teller++;

        }
            while (i <= is) ;



        }else{
            System.out.println("Husk at startverdien må være mindre enn sluttverdien");
            Istartaverdi();
            Issluttverdi();
            utregning();
        }
        System.out.println("\n = " + sum);
    }
}



