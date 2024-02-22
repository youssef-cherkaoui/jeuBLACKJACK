
package jeublackjack;

public class Carte {
    private Valeur valeur;
    private Types type;
    
        public Carte (Valeur valeur , Types type){
            this.valeur=valeur;
            this.type=type;
        }

        public void setValeur(Valeur valeur) {
            this.valeur = valeur;
        }

        public Valeur getValeur() {
            return valeur;
        }
    
    @Override
        public String toString(){
           return "["+this.valeur.getNom()+"|"+this.type.getNom()+"] ==> "+this.valeur.getValeur();
        }
}
