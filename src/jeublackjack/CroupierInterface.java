
package jeublackjack;


public interface CroupierInterface {
    void distribuerCartes(Joueur joueur, PaquetCartes paquet);
    void releverCarteCashe();
    void  tirerCarte(PaquetCartes paquet);
    void comparerMains(Joueur joueur);
    void voirCartes() ;
    
}
