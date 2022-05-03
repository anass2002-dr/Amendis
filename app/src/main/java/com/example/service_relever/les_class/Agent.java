package com.example.service_relever.les_class;

public class Agent extends  Person{
    private int id_agent;
//    private String nom;
//    private String prenom;
//    private String adress;
//    private String email;
//    private String password;
//    private String num_tele;

    public int getId_agent() {
        return id_agent;
    }

    public void setId_agent(int id_agent) {
        this.id_agent = id_agent;
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

    public Agent(String nom, String prenom, String adress, String email, String password, String num_tele, int id_agent) {
        super(nom, prenom, adress, email, password, num_tele);
        this.id_agent = id_agent;
    }

    public Agent(int id_agent, String nom, String prenom, String adress, String email, String password, String num_tele) {
        super(nom,prenom,adress,email,password,num_tele);
        this.id_agent = id_agent;
//        this.nom = nom;
//        this.prenom = prenom;
//        this.adress = adress;
//        this.email = email;
//        this.password = password;
//        this.num_tele = num_tele;
    }
}
