
package jeublackjack;


public class Joueur extends Personne implements JoueurInterface{
    private final String username;
    private double solde;
    
    public Joueur(String username, double solde){
        super();
        this.username = username;
        this.solde = solde;
    }
    
    
    @Override
    public void placerMise(double valeurMiser){
       solde -= valeurMiser;
    }
    
   
    @Override
    public void recevoirCartes(Carte carte1, Carte carte2){
        main.ajouterCarte(carte1);
        main.ajouterCarte(carte2);
    } 
    
    
    @Override
    public void rester() {
        System.out.println("Le joueur " + username + " est reste.");
    }
    
    
    @Override
    public void  tirerCarte(PaquetCartes paquet){
        Carte carteTirer = paquet.tirerCarte();
        if (carteTirer != null){
            main.ajouterCarte(carteTirer);
            System.out.println("<<< Le joueur " + username + " est tire une carte. >>>");
        }else
            System.out.println("<<< le paquet est vide.");
    }
    
    
    @Override
    public void consulterResultat(String resultat){
            System.out.println("<<<" + username + " you " + resultat);
    }
    
    
      @Override
    public void voirCartes() {
        
        System.out.println("Votre main : "+main.calculerValeurMain());
        int numberCarte = 1;
        for (Carte carte : main.getCartes()) {
            System.out.println("carte "+numberCarte+ " : " +carte);
            numberCarte++;
        }
    }

    public double getSolde() {
        return solde;
    }

    public String getUsername() {
        return username;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
