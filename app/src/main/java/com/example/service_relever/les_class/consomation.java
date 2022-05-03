package com.example.service_relever.les_class;

public class consomation {

//    String consomation="create table consomation(id_index integer primary key autoincrement,consomation real,i1 real,i2 real,i3 real,i4 real,i5 real,i6 real,i7 real," +
//            "id_anomalies integer,id_releveur integer,id_compteur integer,id_tournee integer," +
//            "foreign key(id_anomalies) references anomalies(id_anomalies)," +
//            "foreign key(id_releveur) references releveur(id_releveur)," +
//            "foreign key(id_compteur) references compteur(id_compteur)," +
//            "foreign key(id_tournee)references tournee(d_tournee))";

    private int id_consomation;
    private Double i1;
    private Double i2;
    private Double i3;
    private Double i4;
    private Double i5;
    private Double i6;
    private Double i7;
    private int id_anomalies;
    private int id_releveur;
    private int id_compteur;
    private int id_tournee;

    public int getId_compteur() {
        return id_compteur;
    }

    public void setId_compteur(int id_compteur) {
        this.id_compteur = id_compteur;
    }

    public int getId_tournee() {
        return id_tournee;
    }

    public void setId_tournee(int id_tournee) {
        this.id_tournee = id_tournee;
    }

    public int getId_consomation() {
        return id_consomation;
    }

    public void setId_consomation(int id_consomation) {
        this.id_consomation = id_consomation;
    }

    public Double getI1() {
        return i1;
    }

    public void setI1(Double i1) {
        this.i1 = i1;
    }

    public Double getI2() {
        return i2;
    }

    public void setI2(Double i2) {
        this.i2 = i2;
    }

    public Double getI3() {
        return i3;
    }

    public void setI3(Double i3) {
        this.i3 = i3;
    }

    public Double getI4() {
        return i4;
    }

    public void setI4(Double i4) {
        this.i4 = i4;
    }

    public Double getI5() {
        return i5;
    }

    public void setI5(Double i5) {
        this.i5 = i5;
    }

    public Double getI6() {
        return i6;
    }

    public void setI6(Double i6) {
        this.i6 = i6;
    }

    public Double getI7() {
        return i7;
    }

    public void setI7(Double i7) {
        this.i7 = i7;
    }

    public int getId_anomalies() {
        return id_anomalies;
    }

    public void setId_anomalies(int id_anomalies) {
        this.id_anomalies = id_anomalies;
    }

    public int getId_releveur() {
        return id_releveur;
    }

    public void setId_releveur(int id_releveur) {
        this.id_releveur = id_releveur;
    }

    public consomation(int id_consomation, Double i1, Double i2, Double i3, Double i4, Double i5, Double i6, Double i7, int id_anomalies, int id_releveur, int id_compteur, int id_tournee) {
        this.id_consomation=id_consomation;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
        this.i5 = i5;
        this.i6 = i6;
        this.i7 = i7;
        this.id_anomalies = id_anomalies;
        this.id_releveur = id_releveur;
        this.id_compteur = id_compteur;
        this.id_tournee = id_tournee;
    }

    public consomation(Double i1, Double i2, Double i3, Double i4, Double i5, Double i6, Double i7, int id_anomalies, int id_releveur, int id_compteur, int id_tournee) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
        this.i5 = i5;
        this.i6 = i6;
        this.i7 = i7;
        this.id_anomalies = id_anomalies;
        this.id_releveur = id_releveur;
        this.id_compteur = id_compteur;
        this.id_tournee = id_tournee;
    }
}
