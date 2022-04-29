package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Compteur_non_lus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteur_non_lus);
        getSupportActionBar().hide();
        addtable();
        Button menu=(Button)findViewById(R.id.btn_menu_non_lus);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu_intent=new Intent(Compteur_non_lus.this,com.example.service_relever.Menu_relveur.class);
                Compteur_non_lus.this.startActivity(menu_intent);

            }
        });
    }

    private void addtable() {
        TableLayout tb1=(TableLayout)findViewById(R.id.tb_non_lus);



        TableRow r1=new TableRow(this);

        for(int i=0;i<6;i++){
            TextView txt1=new TextView(this);
            txt1.setPadding(7,7,7,7);
            txt1.setTextSize(16);
            txt1.setText(Integer.toString(i));
            Toast.makeText(this, ""+txt1.getTextSize(), Toast.LENGTH_SHORT).show();
            r1.addView(txt1);
        }


        tb1.addView(r1);
    }
}