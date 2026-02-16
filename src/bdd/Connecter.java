package bdd;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connecter {
    // Méthode pour établir une connexion à la base de données MySQL
    public static Connection connecter() {
        Connection con = null;
        try {
            // Charger le fichier de config
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            props.load(fis);

            // URL de connexion à la base de données
            String url = props.getProperty("db.url");

            // Nom d'utilisateur et mot de passe BDD
            String utilisateur = props.getProperty("db.utilisateur");
            String motDePasse = props.getProperty("db.motDePasse");

            // Connexion à la base
            con = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println("Connexion réussie à la base de données.");

            // Gestion des erreurs de connexion
        } catch (SQLException e) {
            System.err.println("Erreur lors de la connexion : " + e.getMessage());

            // Gestion des erreurs liées au fichier configuration
        } catch (IIOException e) {
            System.err.println("Erreur lors du chargement du fichier de configuration : " + e.getMessage());
            throw new RuntimeException("Impossible de charger le fichier config.properties", e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
    // Méthode pour fermer proprement la connexion
    public static void fermerConnexion(Connection con){
        if (con != null){
            try{
                con.close();
                System.out.println("Connexion fermée.");
            }catch (SQLException e){
                System.out.println("Erreur lors de la fermeture : "+e.getMessage());
            }
        }
    }
}
