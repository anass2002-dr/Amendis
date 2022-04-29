package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Supprimer_compte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supprimer_compte);
        getSupportActionBar().hide();

        Button menu=(Button)findViewById(R.id.btn_menu_supprimer_compte);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent();
                String user=intent2.getStringExtra("user");
                if(user.equals("agent")){
                    Intent intent=new Intent(Supprimer_compte.this,com.example.service_relever.Menu_Agent.class);
                    startActivity(intent);
                }
                else if(user.equals("admin")){
                    Intent intent=new Intent(Supprimer_compte.this,com.example.service_relever.Menu_admin.class);
                    startActivity(intent);
                }
            }
        });
    }
}