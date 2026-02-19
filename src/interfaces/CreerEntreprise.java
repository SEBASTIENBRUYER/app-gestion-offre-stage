package interfaces;

import bdd.Connecter;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreerEntreprise extends JFrame {
    // Déclaration des composants
    private JPanel jPanel1;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
    private JTextField txtNomEntreprise, txtNumeroRue, txtCodePostal, txtVille, txtMailContact, txtSecteur, txtMdp;
    private JButton boutonEnvoyerEntreprise, boutonAnnulerEntreprise;

    // Connexion à la base de données
    Connection con;
    PreparedStatement pr;

    //Constructeur


    public CreerEntreprise() {
        //Initialisation de la connexion
        con = Connecter.connecter();

        // Initialisation de l'interface graphique
        initComponents();

        // Parametres de la fenetre
        this.setTitle("Créer une entreprise");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.setContentPane(jPanel1);
        this.setVisible(true);
    }

    // Creation de tous les elements graphiques
    private void initComponents(){
        // Fenetre principale
        jPanel1= new JPanel();
        jPanel1.setBackground(new Color(0,255,204));
        jPanel1.setBorder(new LineBorder(Color.BLACK,1,true));
        jPanel1.setLayout(null);

        jLabel1= new JLabel("CREATION D'UNE ENTREPRISE");
        jLabel1.setFont(new Font("Times New Roman", Font.BOLD,15));
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setBounds(200,10,300,30);
        jPanel1.add(jLabel1);

        // Nom de l'entreprise
        jLabel2=new JLabel("Nom de l'entreprise");
        jLabel2.setBounds(30,50,150,25);
        jPanel1.add(jLabel2);

        txtNomEntreprise= new JTextField();
        txtNomEntreprise.setBounds(200,50,400,25);
        jPanel1.add(txtNomEntreprise);

        // Adresse
        jLabel3=new JLabel("Adresse (Numéro et rue)");
        jLabel3.setBounds(30,90,400,25);
        jPanel1.add(jLabel3);

        txtNumeroRue= new JTextField();
        txtNumeroRue.setBounds(200,90,400,25);
        jPanel1.add(txtNumeroRue);

        // Code Postal
        jLabel4=new JLabel("Code Postal");
        jLabel4.setBounds(30,130,400,25);
        jPanel1.add(jLabel4);

        txtCodePostal= new JTextField();
        txtCodePostal.setBounds(200,130,400,25);
        jPanel1.add(txtCodePostal);

        // Ville
        jLabel5=new JLabel("Ville");
        jLabel5.setBounds(30,170,400,25);
        jPanel1.add(jLabel5);

        txtVille= new JTextField();
        txtVille.setBounds(200,170,400,25);
        jPanel1.add(txtVille);

        // Email contact
        jLabel6=new JLabel("Mail du contact");
        jLabel6.setBounds(30,210,400,25);
        jPanel1.add(jLabel6);

        txtMailContact= new JTextField();
        txtMailContact.setBounds(200,210,400,25);
        jPanel1.add(txtMailContact);

        // Mot de passe
        jLabel9=new JLabel("Mot de passe");
        jLabel9.setBounds(30,250,400,25);
        jPanel1.add(jLabel9);

        txtMdp= new JTextField();
        txtMdp.setBounds(200,250,400,25);
        jPanel1.add(txtMdp);

        // Téléphone
        jLabel8=new JLabel("Mot de passe");
        jLabel8.setBounds(30,290,400,25);
        jPanel1.add(jLabel8);

        txtMdp= new JTextField();
        txtMdp.setBounds(200,290,400,25);
        jPanel1.add(txtMdp);
    }
    // Méthode principale
    public static void main(String[] args){
        new CreerEntreprise();
    }
}
