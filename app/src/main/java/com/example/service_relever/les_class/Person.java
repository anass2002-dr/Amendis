package com.example.service_relever.les_class;

public class Person {
    private String nom;
    private String prenom;
    private String adress;
    private String email;
    private String password;
    private String num_tele;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNum_tele() {
        return num_tele;
    }

    public void setNum_tele(String num_tele) {
        this.num_tele = num_tele;
    }

    public Person(String nom, String prenom, String adress, String email, String password, String num_tele) {
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.email = email;
        this.password = password;
        this.num_tele = num_tele;
    }
}
