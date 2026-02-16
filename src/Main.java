import bdd.Connecter;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test de la connexion
        Connection con = Connecter.connecter();

        if(con != null){
            System.out.println("Connexion OK !");
        }else{
            System.out.println("Echec de la connexion.");
        }

    }
}