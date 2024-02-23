
package jeublackjack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Carte {
            
     try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/namedatabase", "root", "pass");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM black.carte");
             while (rs.next()) {
                String idcarte = rs.getString("id_Carte");
                System.out.print("ID " + idcarte);
                
            }
            Main Main = new Main();
            Main.handle();
        } catch (SQLException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
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
