package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Change_Tournee extends AppCompatActivity {
    Button menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_tournee);
        getSupportActionBar().hide();

        menu=(Button)findViewById(R.id.btn_menu_tournne);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(Change_Tournee.this,com.example.service_relever.Menu_relveur.class);
                Change_Tournee.this.startActivity(intentMenu);
            }
        });
    }
}