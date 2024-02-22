
package jeublackjack;

public class Croupier extends Personne implements CroupierInterface {
      private final int valeurTotalLimit;
        private boolean carteCasheeRelevee;
        
        
        public Croupier(int valeurTotalLimit){
            super();
            this.valeurTotalLimit=valeurTotalLimit;
        }
        
      
      @Override
        public void distribuerCartes(Joueur joueur, PaquetCartes paquet){
           joueur.recevoirCartes(paquet.tirerCarte(), paquet.tirerCarte());
           main.ajouterCarte(paquet.tirerCarte());
           main.ajouterCarte(paquet.tirerCarte());
        }
        
        
      @Override
        public void releverCarteCashe(){
            main.calculerValeurMain();
            System.out.println("le croupier expose sa main cashé");
            carteCasheeRelevee = true;
        }
        
        
      @Override
        public void  tirerCarte(PaquetCartes paquet){
            while(main.calculerValeurMain()< valeurTotalLimit){
                Carte carteTirer = paquet.tirerCarte();
                if (carteTirer != null){
                    main.ajouterCarte(carteTirer);
                    System.out.println("<<< Le croupier est tire une carte. >>>");
                }else
                    System.out.println("<<< le paquet est vide.");
            }
        }
        
      @Override
        public void  comparerMains(Joueur joueur){
           
           int valeurMainJoueur = joueur.getMain().calculerValeurMain();
           int valeurMainCroupier = main.calculerValeurMain();
           
           if ( valeurMainCroupier>21 || (valeurMainJoueur <= 21 && valeurMainJoueur > valeurMainCroupier)){
                joueur.consulterResultat("win !!!");
           }else if (valeurMainJoueur == valeurMainCroupier){
                joueur.consulterResultat("in ta3adol");
           }else{
               joueur.consulterResultat("loooooose");
           }
        }
        
       
      @Override
        public void voirCartes() {
        
         int totalValue = main.calculerValeurMain();
            
            if (!carteCasheeRelevee) {
                totalValue -= main.getCartes().get(1).getValeur().getValeur();
            }
            System.out.println("Croupier main :  << "+totalValue + " >>");

            for (int i = 0; i < main.getCartes().size(); i++) {
                if (i == 1 && !carteCasheeRelevee) {
                    System.out.println("Carte " + (i + 1) + ": cashee");
                } else {
                    System.out.println("Carte " + (i + 1) + ": " + main.getCartes().get(i).toString());
                }
            }
            
        }
}
