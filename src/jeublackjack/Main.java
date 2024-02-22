
package jeublackjack;

import java.util.ArrayList;
import java.util.List;


public class Main implements MainInterface{
     private final List<Carte> cartes;
        private int valeurTotal;
        private int nbCartes;
    
        public Main(){
          this.cartes = new ArrayList<>();
          this.nbCartes=0;
        }

        
     @Override
        public void ajouterCarte(Carte carte){
            cartes.add(carte);
            this.nbCartes++;
        }

     @Override
        public int calculerValeurMain(){
            int nombreAs=0;
            valeurTotal = 0;
            for (Carte carte : cartes){
                valeurTotal+=carte.getValeur().getValeur();
                if (carte.getValeur()== Valeur.ACE){
                  nombreAs ++;
                }
            }

            while (valeurTotal > 21 && nombreAs > 0 ){
                 valeurTotal-=10;
                 nombreAs--;
            }

            return valeurTotal;
        }

        public int getNbCartes() {
            return nbCartes;
        }

        public List<Carte> getCartes() {
            return cartes;
        }

        public int getValeurTotal() {
            return valeurTotal;
        }
}
