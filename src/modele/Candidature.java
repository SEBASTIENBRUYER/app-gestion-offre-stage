package modele;

public class Candidature {
    // Déclaration des variables privées (non accessibles directement de l'extérieur)
    private int id_offre; // Identifiant de l'offre à laquelle l'étudiant postule
    private int id_etudiant; // Identifiant de l'étudiant qui postule
    private String nom_entreprise; // Nom de l'entreprise qui propose l'offre

    // Constructeur avec paramètres (La candidature n'est pas vide)

    public Candidature(int id_offre, int id_etudiant, String nom_entreprise){
        this.id_offre=id_offre; // On initialise l'attribut id_offre
        this.id_etudiant=id_etudiant; // On initialise l'attribut id_etudiant
        this.nom_entreprise=nom_entreprise; // On initialise l'attribut nom_entreprise
    }

    //Getters pour récupérer les données de la candidature

    // Getter pour récupérer l'id de l'offre
    public int getId_offre() {
        return id_offre;
    }

    // Getter pour récupérer l'id de l'étudiant
    public int getId_etudiant() {
        return id_etudiant;
    }

    // Getter pour récupérer l'id de l'entreprise
    public String getNom_entreprise() {
        return nom_entreprise;
    }


}
