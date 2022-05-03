package com.example.service_relever.les_class;

public class releveur extends Person {
//    String releveur="create table releveur(id_releveur integer  primary key autoincrement,nom text," +
//            "prenom text,adress text,email text,password text,num_tele text)";
    private int id_releveur;
    private String nom;
    private String prenom;
    private String adress;
    private String email;
    private String password;
    private String num_tele;

    public int getId_releveur() {
        return id_releveur;
    }

    public void setId_releveur(int id_releveur) {
        this.id_releveur = id_releveur;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getNum_tele() {
        return num_tele;
    }

    @Override
    public void setNum_tele(String num_tele) {
        this.num_tele = num_tele;
    }

    public releveur(String nom, String prenom, String adress, String email, String password, String num_tele) {
        super(nom,prenom,adress,email,password,num_tele);
//        this.id_releveur = id_releveur;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.email = email;
        this.password = password;
        this.num_tele = num_tele;
    }

    public releveur(String nom, String prenom, String adress, String email, String password, String num_tele, int id_releveur, String nom1, String prenom1, String adress1, String email1, String password1, String num_tele1) {
        super(nom, prenom, adress, email, password, num_tele);
        this.id_releveur = id_releveur;
        this.nom = nom1;
        this.prenom = prenom1;
        this.adress = adress1;
        this.email = email1;
        this.password = password1;
        this.num_tele = num_tele1;
    }
}
