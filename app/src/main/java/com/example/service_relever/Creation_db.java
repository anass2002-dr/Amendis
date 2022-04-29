package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Creation_db extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_db);
        getSupportActionBar().hide();
        Button menu=(Button)findViewById(R.id.btn_menu_creation_db);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu_intent=new Intent(Creation_db.this,com.example.service_relever.Menu_admin.class);
                Creation_db.this.startActivity(menu_intent);
            }
        });
    }
}