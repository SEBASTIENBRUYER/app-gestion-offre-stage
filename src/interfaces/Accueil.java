package interfaces;

import bdd.Connecter;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Accueil extends JFrame {
    //Déclaration des composants graphiques
    private JPanel jPanel1;
    private JLabel lblTitre, lblIdentifiant, lblMotDePasse, lblChoix;
    private JTextField txtIdentifiant;
    private JButton btnValider, btnCreerEtudiant, btnCreerEntreprise;
    private JComboBox<String> comboUtilisateur;
    private JPasswordField txtMotDePasse;

    //Variables SQL
    private Connection con;
    private PreparedStatement pr;
    private ResultSet rs;

    //Constructeur principal : initialise l'interface et établit la connexion SQL
    public Accueil() {
        initComponents();
        con = Connecter.connecter();// connexion à la base de données
    }

    // Méthode pour créer l'interface graphique
    private void initComponents() {

        //Fenetre principale JPanel
        jPanel1 = new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setBackground(new Color(51, 255, 153));

        // Titre de la fenetre
        lblTitre = new JLabel("Bonjour, veuillez vous connecter");
        lblTitre.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        lblTitre.setBounds(60, 20, 400, 30);
        jPanel1.add(lblTitre);

        // Label et champs identifiant
        lblIdentifiant = new JLabel("Identifiant");
        lblIdentifiant.setBounds(40, 80, 100, 20);
        jPanel1.add(lblIdentifiant);

        // Texte de l'identifiant
        txtIdentifiant = new JTextField();
        txtIdentifiant.setBounds(150, 80, 200, 25);
        jPanel1.add(txtIdentifiant);

        // Label et champs mot de passe
        lblMotDePasse = new JLabel("Mot de passe");
        lblMotDePasse.setBounds(40, 120, 100, 20);
        jPanel1.add(lblMotDePasse);

        txtMotDePasse = new JPasswordField();
        txtMotDePasse.setBounds(150, 120, 200, 25);
        jPanel1.add(txtMotDePasse);

        // ComboBox choix du type d'utilisateur
        lblChoix = new JLabel("Utilisateur");
        lblChoix.setBounds(40, 160, 100, 20);
        jPanel1.add(lblChoix);

        comboUtilisateur = new JComboBox<>(new String[]{"Etudiant", "Entreprise", "Admin"});
        comboUtilisateur.setBounds(150, 160, 200, 25);
        jPanel1.add(comboUtilisateur);

        //Bouton de connexion
        btnValider = new JButton("Valider");
        btnValider.setBounds(270, 200, 80, 30);
        jPanel1.add(btnValider);

        //Bouton pour créer un compte étudiant
        btnCreerEtudiant = new JButton("Créer étudiant");
        btnCreerEtudiant.setBounds(80, 250, 130, 30);
        jPanel1.add(btnCreerEtudiant);

        //Bouton pour créer un compte entreprise
        btnCreerEntreprise = new JButton("Créer entreprise");
        btnCreerEntreprise.setBounds(220, 250, 130, 30);
        jPanel1.add(btnCreerEntreprise);

        //=====Actions des boutons=====
        // Action : quand on clique sur "Valider"
        btnValider.addActionListener(e -> connecter());

        // Action : ouvrir la fenetre pour créer un étudiant
        btnCreerEtudiant.addActionListener(e -> {
                    new CreerEtudiant().setVisible(true);
                    this.setVisible(false);
        });

        // Action : ouvrir la fenetre pour créer une entreprise
        btnCreerEntreprise.addActionListener(e -> {
                    new CreerEntreprise().setVisible(true);
                    this.setVisible(false);
        });

        // Paramètres de la fenetre principale
        this.setTitle("Accueil");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(jPanel1);
        this.setSize(450, 350);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    // Méthode pour connecter l'utilisateur à partir des champs remplis
    private Connection connecter() {
        // Récupère le type d'utilisateur
        String choix = comboUtilisateur.getSelectedItem().toString();
        // Identifiant saisi
        String identifiant = txtIdentifiant.getText();
        // Mot de passe saisi
        String mdp = new String(txtMotDePasse.getPassword());
        // Table et champs à selectionner dans la BDD
        String table = "", champEmail = "", champMdp = "";

        // Associe les noms des colonnes selon le type choisi
        switch (choix) {
            case "Etudiant":
                table = "etudiant";
                champEmail = "email_etudiant";
                champMdp = "mdp_etudiant";
                break;
            case "Entreprise":
                table = "entreprise";
                champEmail = "email_entreprise";
                champMdp = "mdp_entreprise";
                break;
            case "Admin":
                table = "admin";
                champEmail = "email_admin";
                champMdp = "mdp_admin";
                break;

        }
        try {
            // Préparation de la requête SQL
            String sql = "SELECT * FROM " + table + " WHERE " + champEmail + "=? AND " + champMdp + "=?";

            pr = con.prepareStatement(sql);
            pr.setString(1, identifiant);
            pr.setString(2, mdp);
            rs = pr.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Connexion Réussie !");
                //Redirection selon le rôle
                if (choix.equals("Etudiant")) {
                    new ConsulterOffreEtudiant().setVisible(true);
                } else if (choix.equals("Entreprise")) {
                    new EntrepriseCreerOffre().setVisible(true);
                } else {
                    new GestionDesOfrres().setVisible(true);
                }
                this.dispose();//fermer la fenetre actuelle
            } else {
                JOptionPane.showMessageDialog(this, "Identifiants incorrects.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur : " +e.getMessage());
        }
        return null;
    }
    //Méthode Main
    public static void main (String[] args){
        SwingUtilities.invokeLater(Accueil::new);//Lancement de l'interface
    }
}
