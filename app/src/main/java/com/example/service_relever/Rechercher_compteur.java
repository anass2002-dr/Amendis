package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rechercher_compteur extends AppCompatActivity {
    Button menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechercher_compteur);
        getSupportActionBar().hide();
        menu=(Button)findViewById(R.id.btn_menu_rechercher);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuIn=new Intent(Rechercher_compteur.this,com.example.service_relever.Menu_relveur.class);
                Rechercher_compteur.this.startActivity(menuIn);
            }
        });
    }
}