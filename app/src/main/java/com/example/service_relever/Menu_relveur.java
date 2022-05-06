package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.service_relever.les_class.Mydb;

public class Menu_relveur extends AppCompatActivity {
    Button btn_add_compteur,btn_change_tournee,btn_non_lus,
            btn_rechercher,btn_lecture_seul,btn_lecture_rue,btn_change_password,btn_show_anomalie,btn_stat,btn_fermer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_relveur);
        getSupportActionBar().hide();

        btn_add_compteur=(Button)findViewById(R.id.btn_ajouter_compteur);
        btn_change_tournee=(Button)findViewById(R.id.btn_changer_tournee);
        btn_change_password=(Button)findViewById(R.id.btn_changer_mot_pass);
        btn_rechercher=(Button)findViewById(R.id.btn_rechercher);
        btn_lecture_rue=(Button)findViewById(R.id.btn_lecture_par_rue);
        btn_lecture_seul=(Button)findViewById(R.id.btn_lecture_par_secteur);
        btn_show_anomalie=(Button)findViewById(R.id.btn_afficher_anomalie);
        btn_non_lus=(Button)findViewById(R.id.btn_non_lus);

        btn_stat=(Button)findViewById(R.id.btn_stat);

        btn_fermer=(Button)findViewById(R.id.btn_fermer);
        btn_fermer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu_relveur.this,com.example.service_relever.MainActivity.class);
                Menu_relveur.this.startActivity(intent);
            }
        });
        btn_rechercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rechercher=new Intent(Menu_relveur.this,com.example.service_relever.Rechercher_compteur.class);
                Menu_relveur.this.startActivity(rechercher);
            }
        });
        btn_add_compteur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mydb db=new Mydb(Menu_relveur.this);

                SQLiteDatabase dt=db.getReadableDatabase();
                String query="select * from agent";

                Cursor c1=dt.rawQuery(query,null);
                String tt="";
                String tt2="";
                c1.moveToNext();
                while (c1.moveToNext()){
                    tt+=" "+c1.getString(1).toString()+" eeeeee";
                }
                Toast.makeText(Menu_relveur.this, " "+tt.toString(), Toast.LENGTH_SHORT).show();
                c1.close();
            }
        });
        btn_stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentstat=new Intent(Menu_relveur.this,com.example.service_relever.Statistique.class);
                Menu_relveur.this.startActivity(intentstat);
            }
        });
        btn_show_anomalie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent afficheAnomalie=new Intent(Menu_relveur.this,com.example.service_relever.Afficher_anomalies.class);
                Menu_relveur.this.startActivity(afficheAnomalie);
            }
        });
        btn_lecture_rue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relvier=new Intent(Menu_relveur.this,com.example.service_relever.reliever_form.class);
                Menu_relveur.this.startActivity(relvier);
            }
        });
        btn_lecture_seul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_lecture_rue.performClick();
            }
        });
        btn_change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPass=new Intent(Menu_relveur.this,com.example.service_relever.Change_password.class);
                intentPass.putExtra("user","agent");
                Menu_relveur.this.startActivity(intentPass);
            }
        });
        btn_change_tournee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTournee=new Intent(Menu_relveur.this,com.example.service_relever.Change_Tournee.class);
                Menu_relveur.this.startActivity(intentTournee);
            }
        });
        btn_non_lus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentlus=new Intent(Menu_relveur.this,com.example.service_relever.Compteur_non_lus.class);
                Menu_relveur.this.startActivity(intentlus);
            }
        });
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.btn_lecture_par_secteur:
//            case R.id.btn_lecture_par_rue:
//                Intent re=new Intent(Menu_relveur.this,com.example.service_relever.reliever_form.class);
//                Menu_relveur.this.startActivity(re);
//                break;
//            case R.id.btn_rechercher:
////                Intent rechercher=new Intent(Menu_relveur.this,com.example.service_relever.Rechercher_compteur.class);
////                Menu_relveur.this.startActivity(rechercher);
//                break;
//            case R.id.btn_changer_tournee:
//
//                break;
//            case R.id.btn_afficher_anomalie:
//
//                break;
//            case R.id.btn_ajouter_compteur:
//
//                break;
//            case R.id.btn_non_lus:
//
//                break;
//            case R.id.btn_stat:
//
//                break;
//        }
//
//    }
}