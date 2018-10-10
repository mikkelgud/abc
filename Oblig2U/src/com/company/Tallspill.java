package com.company;
import static javax.swing.JOptionPane.*;
import java.util.Random;

 public class Tallspill {

     int random;
     int gjetning = 0;
     int teller = 1;

        Random tilf = new Random();


        public int nyttTall() {
            random =tilf.nextInt( 200);
            return random;
        }

        public void visMelding(String melding) {
            melding = showInputDialog("Jeg tenker på et tall mellom 0 og 200, kan du gjette det?", "gjett her");
            gjetning = Integer.parseInt(melding);
            return;
        }

        private void forLite(int tall) {
          showMessageDialog(null, tall + " er for lite, prøv igjen!");
        }


        private void forStort(int tall) {
                    showMessageDialog(null, tall + "er for stort, prøv igjen!");
        }

        public void avsluttRunde( int antall, int gjetning ) {
            showMessageDialog(null,"Gratulerer! " + gjetning + " er riktig. Dette klarte du til og med på bare " + antall + " forsøk :)!");

        }

        public void kjørSpill() {
           nyttTall();
           while (gjetning != random) {
           visMelding(null);
             if (gjetning < random) {
                forLite(gjetning);
            }else if( gjetning > random){
                forStort(gjetning);
            }else if (gjetning == random){
                avsluttRunde(teller,gjetning);
            } teller++;
           }

        }}



