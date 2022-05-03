package com.example.service_relever.les_class;

public class etat {
//    String etat="create table etat(id_etat integer primary key autoincrement,etat_compteur text,description text)";
        private int id_etat;
        private String etat_compteur;

    public int getId_etat() {
        return id_etat;
    }

    public void setId_etat(int id_etat) {
        this.id_etat = id_etat;
    }

    public String getEtat_compteur() {
        return etat_compteur;
    }

    public void setEtat_compteur(String etat_compteur) {
        this.etat_compteur = etat_compteur;
    }

    public etat(int id_etat,String etat_compteur) {
        this.id_etat = id_etat;
        this.etat_compteur = etat_compteur;
    }

    public etat(String etat_compteur) {
        this.etat_compteur = etat_compteur;
    }
}
