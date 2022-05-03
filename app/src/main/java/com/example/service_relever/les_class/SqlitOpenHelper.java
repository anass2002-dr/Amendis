package com.example.service_relever.les_class;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqlitOpenHelper extends SQLiteOpenHelper {
    private static String db_name="Amendis";
    public SqlitOpenHelper(@Nullable Context context) {
        super(context, db_name, null, 12);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String releveur="create table releveur(id_releveur integer  primary key autoincrement,nom text," +
                "prenom text,adress text,email text,password text,num_tele text)";

        String admin="create table admin(id_admin integer primary key autoincrement,nom text," +
                "prenom text,adress text,email text,password text,num_tele text)";

        String agent="create table agent(id_agent integer primary key autoincrement,nom text," +
                "prenom text,adress text,email text,password text,num_tele text)";

        String geo="create table geo(id_geo integer primary key autoincrement,geographie text)";

        String etat="create table etat(id_etat integer primary key autoincrement,etat_compteur text,description text)";

        String rue="create table rue(id_rue integer primary key autoincrement,rue text)";

        String secteur="create table secteur(id_secteur integer primary key autoincrement,secteur text,id_rue integer,foreign key(id_rue) " +
                "references rue(id_rue))";

        String compteur="create table compteur(id_compteur integer primary key autoincrement,id_geo integer ,abonne text,aderss text," +
                "polic integer,id_etat integer,id_secteur integer," +
                "foreign key(id_geo) references geo(id_geo),foreign key(id_etat) references etat(id_etat)," +
                "foreign key(id_secteur) references secteur(id_secteur))";

        String fluid="create table fluid(id_fluid integer primary key autoincrement,code_fluid text," +
                "filter_max real,filter_supperieur real,filter_infirieur real,filter_min real)";

        String anomalies="create table anomalies(id_anomalies integer primary key autoincrement," +
                "code_fluid text,lible text,designation text,foreign key(code_fluid) references fluid(code_fluid))";

        String tournee="create table tournee(id_tournee integer primary key autoincrement,tournee text)";


        String consomation="create table consomation(id_index integer primary key autoincrement,consomation real,i1 real,i2 real,i3 real,i4 real,i5 real,i6 real,i7 real," +
                "id_anomalies integer,id_releveur integer,id_compteur integer,id_tournee integer," +
                "foreign key(id_anomalies) references anomalies(id_anomalies)," +
                "foreign key(id_releveur) references releveur(id_releveur)," +
                "foreign key(id_compteur) references compteur(id_compteur)," +
                "foreign key(id_tournee)references tournee(d_tournee))";


        db.execSQL(releveur);
        db.execSQL(admin);
        db.execSQL(agent);
        db.execSQL(geo);
        db.execSQL(etat);
        db.execSQL(compteur);
        db.execSQL(fluid);
        db.execSQL(anomalies);
        db.execSQL(tournee);
        db.execSQL(secteur);
        db.execSQL(rue);
        db.execSQL(consomation);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists releveur");
        db.execSQL("drop table if exists admin");
        db.execSQL("drop table if exists agent");
        db.execSQL("drop table if exists geo");
        db.execSQL("drop table if exists etat");
        db.execSQL("drop table if exists compteur");
        db.execSQL("drop table if exists fluid");
        db.execSQL("drop table if exists anomalies");
        db.execSQL("drop table if exists tournee");
        db.execSQL("drop table if exists secteur");
        db.execSQL("drop table if exists rue");
        db.execSQL("drop table if exists consomation");

        onCreate(db);
    }
    public void ajouter_compteur(SQLiteDatabase db,compteur compteur){
        ContentValues cv=new ContentValues();
//        cv.put("compteur",compteur.get)
    }
}
