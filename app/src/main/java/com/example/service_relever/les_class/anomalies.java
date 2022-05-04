package com.example.service_relever.les_class;

public class anomalies {
//    String anomalie="create table anomalies(id_anomalies integer primary key autoincrement," +
//            "code_fluid text,lible text,designation text,foreign key(code_fluid) references fluid(code_fluid))";

    private int id_anomalies;
    private String Code_fluid;
    private String lible;
    private String designation;

    public int getId_anomalies() {
        return id_anomalies;
    }

    public void setId_anomalies(int id_anomalies) {
        this.id_anomalies = id_anomalies;
    }

    public String getCode_fluid() {
        return Code_fluid;
    }

    public void setCode_fluid(String code_fluid) {
        Code_fluid = code_fluid;
    }

    public String getLible() {
        return lible;
    }

    public void setLible(String lible) {
        this.lible = lible;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public anomalies(int id_anomalies ,String code_fluid, String lible, String designation) {
        this.id_anomalies = id_anomalies;
        this.Code_fluid = code_fluid;
        this.lible = lible;
        this.designation = designation;
    }

    public anomalies() {
    }

    public anomalies(String code_fluid, String lible, String designation) {
        Code_fluid = code_fluid;
        this.lible = lible;
        this.designation = designation;
    }
}
