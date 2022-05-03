package com.example.service_relever.les_class;

public class tournee {
//    String tournne="create table tournee(id_tournee integer primary key autoincrement,tournee text)";
    private int id_tounee;
    private String Tournee;

    public int getId_tounee() {
        return id_tounee;
    }

    public void setId_tounee(int id_tounee) {
        this.id_tounee = id_tounee;
    }

    public String getTournee() {
        return Tournee;
    }

    public void setTournee(String tournee) {
        Tournee = tournee;
    }

    public tournee(String tournee) {
//        this.id_tounee = id_tounee;
        this.Tournee = tournee;
    }

    public tournee(int id_tounee, String tournee) {
        this.id_tounee = id_tounee;
        Tournee = tournee;
    }
}
