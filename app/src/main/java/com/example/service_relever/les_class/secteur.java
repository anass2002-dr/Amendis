package com.example.service_relever.les_class;

public class secteur {
//    String secteur="create table secteur(id_secteur integer primary key autoincrement,secteur text,id_rue integer,foreign key(id_rue) " +
//            "references rue(id_rue))";
    private int id_secteur;
    private String secteur;
    private String rue;

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getId_secteur() {
        return id_secteur;
    }

    public void setId_secteur(int id_secteur) {
        this.id_secteur = id_secteur;
    }

    public secteur( String secteur, String rue) {
//        this.id_secteur = id_secteur;
        this.secteur = secteur;
        this.rue = rue;
    }

    public secteur(int id_secteur, String secteur, String rue) {
        this.id_secteur = id_secteur;
        this.secteur = secteur;
        this.rue = rue;
    }
}
