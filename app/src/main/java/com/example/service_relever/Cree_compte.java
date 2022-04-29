package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cree_compte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cree_compte);
        getSupportActionBar().hide();
        Button menu=(Button)findViewById(R.id.btn_menu_cree_compte);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu_intent=new Intent(Cree_compte.this,com.example.service_relever.Menu_admin.class);
                Cree_compte.this.startActivity(menu_intent);
            }
        });

    }
}