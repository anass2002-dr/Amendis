package com.example.service_relever.les_class;

public class fluid {
//    String fluid="create table fluid(id_fluid integer primary key autoincrement,code_fluid text," +
//            "filter_max real,filter_supperieur real,filter_infirieur real,filter_min real)";
    private int id_fluid;
    private String code_fluid;
    private Double filter_max;
    private Double filter_supperieur;
    private Double filte_infirieur;
    private Double filter_min;

    public int getId_fluid() {
        return id_fluid;
    }

    public void setId_fluid(int id_fluid) {
        this.id_fluid = id_fluid;
    }

    public String getCode_fluid() {
        return code_fluid;
    }

    public void setCode_fluid(String code_fluid) {
        this.code_fluid = code_fluid;
    }

    public Double getFilter_max() {
        return filter_max;
    }

    public void setFilter_max(Double filter_max) {
        this.filter_max = filter_max;
    }

    public Double getFilter_supperieur() {
        return filter_supperieur;
    }

    public void setFilter_supperieur(Double filter_supperieur) {
        this.filter_supperieur = filter_supperieur;
    }

    public Double getFilte_infirieur() {
        return filte_infirieur;
    }

    public void setFilte_infirieur(Double filte_infirieur) {
        this.filte_infirieur = filte_infirieur;
    }

    public Double getFilter_min() {
        return filter_min;
    }

    public void setFilter_min(Double filter_min) {
        this.filter_min = filter_min;
    }

    public fluid() {
    }

    public fluid(String code_fluid, Double filter_max, Double filter_supperieur, Double filte_infirieur, Double filter_min) {
        this.code_fluid = code_fluid;
        this.filter_max = filter_max;
        this.filter_supperieur = filter_supperieur;
        this.filte_infirieur = filte_infirieur;
        this.filter_min = filter_min;
    }

    public fluid(int id_fluid, String code_fluid, Double filter_max, Double filter_supperieur, Double filte_infirieur, Double filter_min) {
        this.id_fluid = id_fluid;
        this.code_fluid = code_fluid;
        this.filter_max = filter_max;
        this.filter_supperieur = filter_supperieur;
        this.filte_infirieur = filte_infirieur;
        this.filter_min = filter_min;
    }
}
