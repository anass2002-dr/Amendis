package com.example.service_relever.les_class;

public class compteur {
//    String compteur="create table compteur(id_compteur integer primary key autoincrement,id_geo integer ,abonne text,aderss text," +
//            "polic integer,id_etat integer,id_secteur integer," +
//            "foreign key(id_geo) references geo(id_geo),foreign key(id_etat) references etat(id_etat)," +
//            "foreign key(id_secteur) references secteur(id_secteur))";

    private int id_compteur;
    private int id_geo;
    private String abonne;
    private String adress;
    private String polic;
    private int id_etat;
    private int id_secteur;

    public int getId_compteur() {
        return id_compteur;
    }

    public void setId_compteur(int id_compteur) {
        this.id_compteur = id_compteur;
    }

    public int getId_geo() {
        return id_geo;
    }

    public void setId_geo(int id_geo) {
        this.id_geo = id_geo;
    }

    public String getAbonne() {
        return abonne;
    }

    public void setAbonne(String abonne) {
        this.abonne = abonne;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPolic() {
        return polic;
    }

    public void setPolic(String polic) {
        this.polic = polic;
    }

    public int getId_etat() {
        return id_etat;
    }

    public void setId_etat(int id_etat) {
        this.id_etat = id_etat;
    }

    public int getId_secteur() {
        return id_secteur;
    }

    public void setId_secteur(int id_secteur) {
        this.id_secteur = id_secteur;
    }

    public compteur(int id_geo, String abonne, String adress, String polic, int id_etat, int id_secteur) {
        this.id_geo = id_geo;
        this.abonne = abonne;
        this.adress = adress;
        this.polic = polic;
        this.id_etat = id_etat;
        this.id_secteur = id_secteur;
    }

    public compteur() {
    }

    public compteur(int id_compteur, int id_geo, String abonne, String adress, String polic, int id_etat, int id_secteur) {
        this.id_compteur = id_compteur;
        this.id_geo = id_geo;
        this.abonne = abonne;
        this.adress = adress;
        this.polic = polic;
        this.id_etat = id_etat;
        this.id_secteur = id_secteur;
    }
}
