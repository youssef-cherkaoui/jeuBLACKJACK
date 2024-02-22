
package jeublackjack;


public interface JoueurInterface {
    void placerMise(double valeurMiser);
    void recevoirCartes(Carte carte1, Carte carte2);
    void rester();
    void tirerCarte(PaquetCartes paquet);
    void consulterResultat(String resultat);
    void voirCartes();
    
}
