
package jeublackjack;


public enum Types {
    
    COEUR("coeur"),
    PIQUE("pique"),
    CARREAU("carreau"),
    TREFLE("trefle");
    
    private final String nom;
    
    private Types (String nom){
       this.nom=nom;
    }

    public String getNom() {
        return nom;
    }
    
    
}
