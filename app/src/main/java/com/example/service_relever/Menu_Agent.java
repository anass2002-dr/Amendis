package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Agent extends AppCompatActivity {
    Button btn_ajouter_releveur,btn_supprimer_releveur,btn_changer_pass,btn_decharger_complet,btn_decharger_partielle,btn_charger
            ,btn_ajouter_anomalie,btn_afficher_anomalie,btn_supprimer_anomalie,btn_admin,btn_parafluid,btn_numerto_terminal,btn_fermer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_agent);
                getSupportActionBar().hide();
        btn_fermer=(Button)findViewById(R.id.btn_fermer_agent);
        btn_fermer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.MainActivity.class);

            }
        });
        btn_ajouter_releveur=(Button)findViewById(R.id.btn_ajouter_relveur);
        btn_ajouter_releveur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Ajouter_relveur_agent.class);
            }
        });
        btn_supprimer_releveur=(Button)findViewById(R.id.btn_supprimer_releveur);
        btn_supprimer_releveur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Supprimer_compte_agent.class);
            }
        });
        btn_changer_pass=(Button)findViewById(R.id.btn_changer_mot_pass_agent);
        btn_changer_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Change_password.class);
            }
        });
        btn_decharger_complet=(Button)findViewById(R.id.btn_decharger_complet);
        btn_decharger_complet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Decharger_complet_agent.class);
            }
        });
        btn_decharger_partielle=(Button)findViewById(R.id.btn_decharger_partielle);
        btn_decharger_partielle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Decharger_partielle_agent.class);
            }
        });
        btn_charger=(Button)findViewById(R.id.btn_charger);
        btn_charger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Charger_agent.class);
            }
        });
        btn_ajouter_anomalie=(Button)findViewById(R.id.btn_Ajouter_anomalie_agent);
        btn_ajouter_anomalie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Ajouter_anomalie_agent.class);
            }
        });
        btn_afficher_anomalie=(Button)findViewById(R.id.btn_afficher_anomalie_agent);
        btn_afficher_anomalie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Afficher_anomalies.class);
            }
        });
        btn_supprimer_anomalie=(Button)findViewById(R.id.btn_supprimer_anomalie_agent);
        btn_supprimer_anomalie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Supprimer_anomalie_agent.class);
            }
        });
        btn_admin=(Button)findViewById(R.id.btn_admin_agent);
        btn_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.MainActivity.class);
            }
        });
        btn_parafluid=(Button)findViewById(R.id.btn_parmetrage_fluid);
        btn_parafluid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Parametrage_fluid_agent.class);
            }
        });
        btn_numerto_terminal=(Button)findViewById(R.id.btn_numerote);
        btn_numerto_terminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Menu_Agent.this,com.example.service_relever.Numerto_agent.class);
            }
        });
    }
    public void open(Context cntx,Class<?> cls){
        Intent intent=new Intent(cntx,cls);
        startActivity(intent);
    }

}