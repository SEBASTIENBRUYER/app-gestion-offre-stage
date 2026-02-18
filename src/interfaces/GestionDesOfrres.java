package interfaces;

import bdd.Connecter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;

public class GestionDesOfrres extends JFrame {
    // Composants graphiques
    private JPanel jPanel1;
    private JLabel jLabel1, txtId, txtIdRecupere;
    private JButton boutonSaisir, boutonCreer, boutonModifier, boutonConsulter, boutonAnnuler;

    // Connexion à la base de données
    private Connection con;

    //Constructeur
    public GestionDesOfrres(){
        // Connexion à la BDD dès l'ouverture de la fenetre
        con= Connecter.connecter();

        // Initialisation des éléments de l'interface
        initComponents();

        // Titre de la fenetre
        this.setTitle("Administration des offres de stage");

        // Fermer l'app lors de la fermeture de la fenetre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajouter le contenu principal
        //this.getContentPane().setLayout(null);
        setContentPane(jPanel1);

        // Adapter la taille automatiquement
        this.pack();

        // Centrer la fenetre à l'écran
        this.setLocationRelativeTo(null);

        //Afficher la fenetre
        this.setVisible(true);
    }
    // Création de tous les éléments graphiques
    private void initComponents(){
        // Fenetre principale, dimension et couleur de fond
        //this.setLayout(null);
        jPanel1=new JPanel(null);
        jPanel1.setBackground(new Color(51,255,255));
        jPanel1.setPreferredSize(new Dimension(700,450));

        // Les zones de texte
        jLabel1 = new JLabel("Administration des offres de stage");
        jLabel1.setFont(new Font("Verdana", Font.BOLD, 14));
        jLabel1.setBounds(180, 20, 350, 30);
        jPanel1.add(jLabel1);

        txtId=new JLabel("identifiant: ");
        txtId.setBounds(10,60,100,20);
        jPanel1.add(txtId);

        txtIdRecupere=new JLabel("apprendreacoder");
        txtIdRecupere.setBounds(120,60,200,20);
        jPanel1.add(txtIdRecupere);

        // Boutons
        boutonSaisir = new JButton("Saisir une offre");
        boutonSaisir.setBounds(80,140,150,30);
        jPanel1.add(boutonSaisir);

        boutonCreer = new JButton("Créer une entreprise");
        boutonCreer.setBounds(280,140,180,30);
        jPanel1.add(boutonCreer);

        boutonConsulter = new JButton("Consulter les offres");
        boutonConsulter.setBounds(80,220,150,30);
        jPanel1.add(boutonConsulter);

        boutonModifier = new JButton("Modifier une entreprise");
        boutonModifier.setBounds(280,220,180,30);
        jPanel1.add(boutonModifier);

        boutonAnnuler = new JButton("Annuler");
        boutonAnnuler.setBounds(200,300,150,30);
        jPanel1.add(boutonAnnuler);

        // Gestion des évènements (action des boutons)
        boutonSaisir.addActionListener(ActionEvent e -> saisirOffre());
        boutonCreer.addActionListener(ActionEvent e -> creerEntreprise());
        boutonConsulter.addActionListener(ActionEvent e -> consulterOffres());
        boutonModifier.addActionListener(ActionEvent e -> modifierEntreprise());
        boutonAnnuler.addActionListener(ActionEvent e -> this.dispose());
    }
    // Méthode liées aux évènements
    // Ouvrir la fenetre de saisie d'une nouvelle offre
    private void saisirOffre(){
        new AdminCreerOffre(); // Affiche la fenetre pour l'admin
        this.setVisible(false);
    }
    // Ouvrir la fenetre de création d'entreprise
    private void creerEntreprise(){
        new CreerEntreprise(); // Fenetre pour créer
        this.setVisible(false);
    }
    // Ouvrir la fenetre de consultation des offres
    private void consulterOffres(){
        new ConsulterOffre(); // Affiche la liste des offres
        this.setVisible(false);
    }
    // Ouvrir la fenetre de modification d'entreprise
    private void modifierEntreprise(){
        new ModifierEntreprise(); // Fenetre pour modifier
        this.setVisible(false);
    }



    // Méthode principale pour exécuter cette fenetre
    public static void main(String[] args){
        SwingUtilities.invokeLater(GestionDesOfrres::new);
    }
}
