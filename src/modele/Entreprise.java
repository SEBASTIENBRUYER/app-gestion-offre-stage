package modele;

import java.util.LinkedList;
import java.util.List;

public class Entreprise {

    // Liste des offres de stage proposées par CETTE enreprise
    private List<OffreStage> lesOffres= new LinkedList<>();

    // Informations spécifiques à chaque entreprise
    private String nomEntreprise;
    private String adVille;
    private String adRue;
    private String codePostal;
    private String tel;
    private String email;
    private String secteur;

    // Constructeur vide (utile si on souhaite créer une entreprise sans données au départ)

    public Entreprise() {
    }

    // Constructeur avec tous les champs

    public Entreprise(String nomEntreprise, String adVille, String adRue, String codePostal, String tel, String email, String secteur) {
        this.nomEntreprise = nomEntreprise;
        this.adVille = adVille;
        this.adRue = adRue;
        this.codePostal = codePostal;
        this.tel = tel;
        this.email = email;
        this.secteur = secteur;
    }

    // Getters et setters pour chaque attribut

    public List<OffreStage> getLesOffres() {
        return lesOffres;
    }

    public void setLesOffres(List<OffreStage> lesOffres) {
        this.lesOffres = lesOffres;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getAdVille() {
        return adVille;
    }

    public void setAdVille(String adVille) {
        this.adVille = adVille;
    }

    public String getAdRue() {
        return adRue;
    }

    public void setAdRue(String adRue) {
        this.adRue = adRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String toString(){
        return "\n" + "Nom de l'entreprise : " + nomEntreprise
                + "\n- Ville : " + adVille
                + "\n- Rue : " + adRue
                + "\n- Code postal : " + codePostal
                + "\n- Telephone : " + tel
                + "\n- Email : " + email
                + "\n- Secteur : " + secteur;
    }
}
