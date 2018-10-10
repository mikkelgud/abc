package com.company;

public class Main {
    public static void main(String[] args) {
        Oppgave1 O1 = new Oppgave1();
        O1.Istartaverdi();
        O1.Issluttverdi();
        O1.utregning();

        Tallspill O2 = new Tallspill();
        O2.kjørSpill();
    }
}
