package modele;

public class OffreStage {
    private int id_offre;
    private String libelleOffre;
    private String descriptionOffre;
    private String domaineOffre;
    private String debutOffre;
    private String dureeOffre;
    private String chemin_offre;
    private int valide;
    private String nom_entreprise;
    private String email_entreprise;
    private String ville_entreprise;

    //Constructeur vide

    public OffreStage() {
    }

    //Constructeur avec les champs

    public OffreStage(int id_offre, String libelleOffre, String descriptionOffre, String domaineOffre, String debutOffre, String dureeOffre, String chemin_offre, int valide, String nom_entreprise, String email_entreprise, String ville_entreprise) {
        this.id_offre = id_offre;
        this.libelleOffre = libelleOffre;
        this.descriptionOffre = descriptionOffre;
        this.domaineOffre = domaineOffre;
        this.debutOffre = debutOffre;
        this.dureeOffre = dureeOffre;
        this.chemin_offre = chemin_offre;
        this.valide = valide;
        this.nom_entreprise = nom_entreprise;
        this.email_entreprise = email_entreprise;
        this.ville_entreprise = ville_entreprise;
    }

    public OffreStage(String nom_entreprise, String email_entreprise, String ville_entreprise) {
        this.nom_entreprise = nom_entreprise;
        this.email_entreprise = email_entreprise;
        this.ville_entreprise = ville_entreprise;
    }

    //Getters et setters

    public int getId_offre() {
        return id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public String getLibelleOffre() {
        return libelleOffre;
    }

    public void setLibelleOffre(String libelleOffre) {
        this.libelleOffre = libelleOffre;
    }

    public String getDescriptionOffre() {
        return descriptionOffre;
    }

    public void setDescriptionOffre(String descriptionOffre) {
        this.descriptionOffre = descriptionOffre;
    }

    public String getDomaineOffre() {
        return domaineOffre;
    }

    public void setDomaineOffre(String domaineOffre) {
        this.domaineOffre = domaineOffre;
    }

    public String getDebutOffre() {
        return debutOffre;
    }

    public void setDebutOffre(String debutOffre) {
        this.debutOffre = debutOffre;
    }

    public String getDureeOffre() {
        return dureeOffre;
    }

    public void setDureeOffre(String dureeOffre) {
        this.dureeOffre = dureeOffre;
    }

    public String getChemin_offre() {
        return chemin_offre;
    }

    public void setChemin_offre(String chemin_offre) {
        this.chemin_offre = chemin_offre;
    }

    public int getValide() {
        return valide;
    }

    public void setValide(int valide) {
        this.valide = valide;
    }

    public String getNom_entreprise() {
        return nom_entreprise;
    }

    public void setNom_entreprise(String nom_entreprise) {
        this.nom_entreprise = nom_entreprise;
    }

    public String getEmail_entreprise() {
        return email_entreprise;
    }

    public void setEmail_entreprise(String email_entreprise) {
        this.email_entreprise = email_entreprise;
    }

    public String getVille_entreprise() {
        return ville_entreprise;
    }

    public void setVille_entreprise(String ville_entreprise) {
        this.ville_entreprise = ville_entreprise;
    }

    @Override
    public String toString() {
        return "OffreStage{" +
                "id_offre=" + id_offre +
                ", libelleOffre='" + libelleOffre + '\'' +
                ", descriptionOffre='" + descriptionOffre + '\'' +
                ", domaineOffre='" + domaineOffre + '\'' +
                ", debutOffre='" + debutOffre + '\'' +
                ", dureeOffre='" + dureeOffre + '\'' +
                ", valide=" + valide +
                ", nom_entreprise='" + nom_entreprise + '\'' +
                ", email_entreprise='" + email_entreprise + '\'' +
                ", ville_entreprise='" + ville_entreprise + '\'' +
                '}';
    }
}
