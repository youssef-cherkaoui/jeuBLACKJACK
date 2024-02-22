
package jeublackjack;



    abstract public class Personne {
    protected Main main;
    
    public Personne(){
      this.main=new Main();
    }

    public Main getMain() {
        return main;
    }
    

    abstract public void  tirerCarte(PaquetCartes paquet);
    abstract public void  voirCartes();
}

