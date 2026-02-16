package modele;

public class OffreEtudiant {
    private int idOffre;
    private String libelleOffre;
    private String descriptionOffre;
    private String domaineOffre;
    private String debutOffre;
    private String dureeOffre;
    private String nom_entreprise;
    private String email_entreprise;
    private String ville_entreprise;

    //Constructeur vide
    public OffreEtudiant() {
    }

    //Constructeur avec les champs
    public OffreEtudiant(int idOffre, String libelleOffre, String descriptionOffre, String domaineOffre, String debutOffre, String dureeOffre, String nom_entreprise, String email_entreprise, String ville_entreprise) {
        this.idOffre = idOffre;
        this.libelleOffre = libelleOffre;
        this.descriptionOffre = descriptionOffre;
        this.domaineOffre = domaineOffre;
        this.debutOffre = debutOffre;
        this.dureeOffre = dureeOffre;
        this.nom_entreprise = nom_entreprise;
        this.email_entreprise = email_entreprise;
        this.ville_entreprise = ville_entreprise;
    }

    //Getters et setters

    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
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
        return "OffreEtudiant{" +
                "idOffre=" + idOffre +
                ", libelleOffre='" + libelleOffre + '\'' +
                ", descriptionOffre='" + descriptionOffre + '\'' +
                ", domaineOffre='" + domaineOffre + '\'' +
                ", debutOffre='" + debutOffre + '\'' +
                ", dureeOffre='" + dureeOffre + '\'' +
                ", nom_entreprise='" + nom_entreprise + '\'' +
                ", email_entreprise='" + email_entreprise + '\'' +
                ", ville_entreprise='" + ville_entreprise + '\'' +
                '}';
    }
}
