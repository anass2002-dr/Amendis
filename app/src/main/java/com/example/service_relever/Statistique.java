package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Statistique extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistique);
        getSupportActionBar().hide();
        Button menu=(Button)findViewById(R.id.btn_menu_stat);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu_intent=new Intent(Statistique.this,com.example.service_relever.Menu_relveur.class);
                Statistique.this.startActivity(menu_intent);
            }
        });
    }
}