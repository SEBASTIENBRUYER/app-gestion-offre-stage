package modele; // Le package dans lequel se trouve cette classe

public class Admin {
    public static String id_admin;
    public static String mdp_admin;
    public static boolean isAdmin = false;

    public Admin() {
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        Admin.id_admin = id_admin;
    }

    public String getMdp_admin() {
        return mdp_admin;
    }

    // Méthode pour définir le mot de passe
    public void setMdp_admin(String mdp_admin) {
        Admin.mdp_admin = mdp_admin;
    }

    // Méthode pour vérifier si c'est un admin
    public boolean isAdmin(){
        return isAdmin;
    }

    // Méthode pour changer le statut admin
    public void setAdmin(boolean admin){
        Admin.isAdmin = admin;
    }
}
