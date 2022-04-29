package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Parametrage_fluid_agent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametrage_fluid_agent);
        getSupportActionBar().hide();

        Button menu=(Button)findViewById(R.id.btn_menu_fluid_parametrage);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu_intent=new Intent(Parametrage_fluid_agent.this,com.example.service_relever.Menu_Agent.class);
                Parametrage_fluid_agent.this.startActivity(menu_intent);
            }
        });
    }
}