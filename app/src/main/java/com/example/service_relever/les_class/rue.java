package com.example.service_relever.les_class;

public class rue {
//    String rue="create table rue(id_rue integer primary key autoincrement,rue text)";
    private int id_rue;
    private String rue;

    public int getId_rue() {
        return id_rue;
    }

    public void setId_rue(int id_rue) {
        this.id_rue = id_rue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public rue(String rue) {
//        this.id_rue = id_rue;
        this.rue = rue;
    }

    public rue(int id_rue, String rue) {
        this.id_rue = id_rue;
        this.rue = rue;
    }
}
