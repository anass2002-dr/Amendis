package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_admin extends AppCompatActivity {
    Button btn_par_rue,btn_par_secteur,btn_decharger_complet,btn_decharger_partielle,btn_charger,btn_creation_compteur,btn_cree_db,btn_insertion_db
    ,btn_cree_compte,btn_supprimer_compte,btn_changer_password,btn_fermer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);
        getSupportActionBar().hide();
        btn_par_rue=(Button)findViewById(R.id.btn_par_rue_admin);
        btn_par_secteur=(Button)findViewById(R.id.btn_par_secteur_admin);
        btn_decharger_complet=(Button)findViewById(R.id.btn_decharger_complet_admin);
        btn_decharger_partielle=(Button)findViewById(R.id.btn_decharger_partielle_admin);
        btn_charger=(Button)findViewById(R.id.btn_charger_admin);
        btn_creation_compteur=(Button)findViewById(R.id.btn_creation_compteur_admin);
        btn_cree_db=(Button)findViewById(R.id.btn_creation_db_admin);
        btn_insertion_db=(Button)findViewById(R.id.btn_insertion_db_admin);
        btn_cree_compte=(Button)findViewById(R.id.btn_cree_compte_admin);
        btn_supprimer_compte=(Button)findViewById(R.id.btn_supprimer_compte_admn);
        btn_changer_password=(Button)findViewById(R.id.btn_changer_mot_pass_admin);
        btn_fermer=(Button)findViewById(R.id.btn_fermer_admin);
        btn_fermer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.MainActivity.class);

            }
        });

        btn_par_rue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.reliever_form.class);

            }
        });
        btn_par_secteur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.reliever_form.class);

            }
        });
        btn_decharger_complet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.Decharger_complet_agent.class);

            }
        });
        btn_decharger_partielle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.Decharger_partielle_agent.class);

            }
        });
        btn_charger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.Charger_agent.class);

            }
        });
        btn_creation_compteur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.Creation_compteur_admin.class);
            }
        });
        btn_cree_db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.Creation_db.class);
            }
        });
        btn_insertion_db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.Insertion_db.class);

            }
        });
        btn_cree_compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.Cree_compte.class);

            }
        });
        btn_supprimer_compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.Supprimer_compte.class);

            }
        });
        btn_changer_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_admin.this,com.example.service_relever.Change_password.class);
            }
        });
    }
    public void open(Context cntx, Class<?> cls){
        Intent intent=new Intent(cntx,cls);
        startActivity(intent);
    }
}