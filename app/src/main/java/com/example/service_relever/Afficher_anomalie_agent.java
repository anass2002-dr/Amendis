package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Afficher_anomalie_agent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_anomalie_agent);
        getSupportActionBar().hide();

//        Button menu=(Button)findViewById(R.id.btn_menu_afficher_anomalie);
//        menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent menu_intent=new Intent(Afficher_anomalie_agent.this,com.example.service_relever.Menu_Agent.class);
//                Afficher_anomalie_agent.this.startActivity(menu_intent);
//            }
//        });
    }
}