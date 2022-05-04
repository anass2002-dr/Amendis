package com.example.service_relever.les_class;

public class releveur extends Person {
//    String releveur="create table releveur(id_releveur integer  primary key autoincrement,nom text," +
//            "prenom text,adress text,email text,password text,num_tele text)";
    private int id_releveur;


    public int getId_releveur() {
        return id_releveur;
    }

    public void setId_releveur(int id_releveur) {
        this.id_releveur = id_releveur;
    }



    public releveur( String email, String password) {
        super(email,password);

    }

    public releveur() {
    }

    public releveur(int id_releveur, String email, String password) {
        super( email, password);
        this.id_releveur = id_releveur;

    }
}
