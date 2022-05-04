package com.example.service_relever.les_class;

public class geo {
//    String geo="create table geo(id_geo integer primary key autoincrement,geographie text)";
    private int id_geo;
    private String geographie;

    public int getId_geo() {
        return id_geo;
    }

    public void setId_geo(int id_geo) {
        this.id_geo = id_geo;
    }

    public String getGeographie() {
        return geographie;
    }

    public void setGeographie(String geographie) {
        this.geographie = geographie;
    }

    public geo(String geographie) {
//        this.id_geo = id_geo;
        this.geographie = geographie;
    }

    public geo() {
    }

    public geo(int id_geo, String geographie) {
        this.id_geo = id_geo;
        this.geographie = geographie;
    }
}
