package com.example.service_relever.les_class;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Message;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Mydb extends SQLiteOpenHelper {
    private static String db_name="Amendis";
    private int who;
    public Mydb(@Nullable Context context) {
        super(context, db_name, null, 6);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String releveur="create table releveur(id_releveur integer  primary key autoincrement," +
                "email text not null unique,password text)";

//        db.execSQL("insert into releveur()");
        String admin="create table admin(id_admin integer primary key autoincrement," +
                "email text not null unique,password text)";

        String agent="create table agent(id_agent integer primary key autoincrement," +
                "email text not null unique,password text)";

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
    public void onUpgrade(SQLiteDatabase db, int OldVersion, int NewVersion) {
//        db.execSQL("insert into releveur(email,password) values('anass123','123456')");
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
public static boolean login(Mydb dd,String email,String password,String user){
        SQLiteDatabase db=dd.getReadableDatabase();
        Cursor cr1=db.rawQuery("select * from'"+ user +"' where+ email='"+email+"'and password='"+password+"'",null);
        if (cr1.getCount()>=1){
            return true;
        }
        else
            return false;
}
public static long ajouter_fluid(SQLiteDatabase db,fluid fluid){
    ContentValues v=new ContentValues();
    v.put("code_fluid",fluid.getCode_fluid());
    v.put("fliter_max",fluid.getFilter_max());
    v.put("filter_min",fluid.getFilter_min());
    v.put("filter_infirieur",fluid.getFilte_infirieur());
    v.put("filter_supperieur",fluid.getFilter_supperieur());

    return db.insert("fluid",null,v);
}
    public static long ajouter_releveur(SQLiteDatabase db,releveur releveur){
        ContentValues v=new ContentValues();
        v.put("email",releveur.getEmail());
        v.put("password",releveur.getPassword());
        return db.insert("releveur",null,v);
    }
    public static long ajouter_admin(SQLiteDatabase db,admin admin){
        ContentValues v=new ContentValues();
        v.put("email",admin.getEmail());
        v.put("password",admin.getPassword());
        return db.insert("admin",null,v);
    }
    public static long ajouter_agent(SQLiteDatabase db,Agent agent){
        ContentValues v=new ContentValues();
        v.put("email",agent.getEmail());
        v.put("password",agent.getPassword());
        return db.insert("agent",null,v);
    }
    public static  long ajouter_anomalie(SQLiteDatabase db,anomalies anomalies){
        ContentValues v=new ContentValues();
        v.put("code_fluid",anomalies.getCode_fluid());
        v.put("designation",anomalies.getDesignation());
        return db.insert("anomalies",null,v);
    }
    public static long supprimer_anomalies(SQLiteDatabase db,String des){
        return db.delete("anomalies","designation = '"+des+"'",null);
    }
    public static long supprimer_compte_releveur(SQLiteDatabase db,String login){
        return db.delete("releveur","email ='"+login+"'",null);

    }
    public static long supprimer_compte(SQLiteDatabase db,String login,String user){
        if(user.equals("releveur")){
            return db.delete("releveur","email = '"+login+"'",null);
        }
        else if(user.equals("agent")){
            return db.delete("agent","email = '"+login+"'",null);
        }
        else {
            return db.delete("releveur","email '"+login+"'",null);

        }
    }
    public static ArrayList<releveur> Afficher_releveur(SQLiteDatabase db){
        ArrayList<releveur> list=new ArrayList<releveur>();
        Cursor cr=db.rawQuery("select * from releveur",null);
        cr.moveToNext();
        while (cr.moveToNext()){
            releveur releveur=new releveur();
            releveur.setId_releveur(cr.getInt(0));
            releveur.setEmail(cr.getString(1));
            releveur.setPassword(cr.getString(2));

            list.add(releveur);
        }
        cr.close();
        return list;
    }
    public static ArrayList<anomalies> Afficher_anomalies(SQLiteDatabase db){
        ArrayList<anomalies> list=new ArrayList<anomalies>();
        Cursor cr=db.rawQuery("select * from anomalies",null);
        cr.moveToNext();
        while (cr.moveToNext()){
            anomalies anomalies=new anomalies();
            anomalies.setId_anomalies(cr.getInt(0));
            anomalies.setCode_fluid(cr.getString(1));
            anomalies.setLible(cr.getString(2));
            anomalies.setDesignation(cr.getString(3));
            list.add(anomalies);
        }
        cr.close();
        return list;
    }
    public static long cree_compte_agent(SQLiteDatabase db,Agent agent)
    {
        ContentValues v=new ContentValues();
        v.put("email",agent.getEmail());
        v.put("password",agent.getPassword());
        return db.insert("agent",null,v);
    }
    public static long update_password(SQLiteDatabase db,String user,String login,String NewPass){
        ContentValues v=new ContentValues();
        v.put("password",NewPass);
        return db.update(user,v,"email ='"+login+"'",null);
    }
    public static ArrayList<fluid> afficher_fluid(SQLiteDatabase db){
        ArrayList<fluid> list=new ArrayList<fluid>();
        Cursor cr=db.rawQuery("select * from fluid",null);
        cr.moveToNext();
        while (cr.moveToNext()){
            fluid fluid=new fluid();
            fluid.setId_fluid(cr.getInt(0));
            fluid.setCode_fluid(cr.getString(1));
            fluid.setFilter_max(cr.getDouble(2));
            fluid.setFilter_min(cr.getDouble(3));
            fluid.setFilte_infirieur(cr.getDouble(4));
            fluid.setFilter_supperieur(cr.getDouble(5));
            list.add(fluid);
        }
        cr.close();
        return list;
    }
}
