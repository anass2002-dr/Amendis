package com.example.service_relever.les_class;

public class admin extends Person{
//
//    String admin="create table admin(id_admin integer primary key autoincrement,nom text," +
//            "prenom text,adress text,email text,password text,num_tele text)";

    private int id_admin;
//    private String nom;
//    private String prenom;
//    private String adress;
//    private String email;
//    private String password;
//    private String num_tele;

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

//    @Override
//    public String getNom() {
//        return nom;
//    }
//
//    @Override
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    @Override
//    public String getPrenom() {
//        return prenom;
//    }
//
//    @Override
//    public void setPrenom(String prenom) {
//        this.prenom = prenom;
//    }
//
//    @Override
//    public String getAdress() {
//        return adress;
//    }
//
//    @Override
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }
//
//    @Override
//    public String getEmail() {
//        return email;
//    }
//
//    @Override
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String getNum_tele() {
//        return num_tele;
//    }
//
//    @Override
//    public void setNum_tele(String num_tele) {
//        this.num_tele = num_tele;
//    }


    public admin(String nom, String prenom, String adress, String email, String password, String num_tele, int id_admin) {
        super(nom, prenom, adress, email, password, num_tele);
        this.id_admin = id_admin;
    }

    public admin(int id_admin, String nom, String prenom, String adress, String email, String password, String num_tele) {
        super(nom,prenom,adress,email,password,num_tele);
        this.id_admin = id_admin;
//        this.nom = nom;
//        this.prenom = prenom;
//        this.adress = adress;
//        this.email = email;
//        this.password = password;
//        this.num_tele = num_tele;
    }
}
