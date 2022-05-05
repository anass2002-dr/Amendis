package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Supprimer_compte extends AppCompatActivity {
    Button sup;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supprimer_compte);
        getSupportActionBar().hide();
        sp=(Spinner)findViewById(R.id.sp_user);

        Button menu=(Button)findViewById(R.id.btn_menu_supprimer_compte);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Supprimer_compte.this,com.example.service_relever.Menu_Agent.class);
                startActivity(intent);

            }
        });
    }
}