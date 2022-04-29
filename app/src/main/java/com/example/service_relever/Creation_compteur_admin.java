package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Creation_compteur_admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_compteur_admin);
        getSupportActionBar().hide();
        Button menu=(Button)findViewById(R.id.btn_menu_creation_compteur);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu_intent=new Intent(Creation_compteur_admin.this,com.example.service_relever.Menu_admin.class);
                Creation_compteur_admin.this.startActivity(menu_intent);
            }
        });
    }
}