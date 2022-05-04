package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.service_relever.les_class.Mydb;
import com.example.service_relever.les_class.releveur;

import java.util.ArrayList;

public class Rechercher_compteur extends AppCompatActivity {
    Button menu,rechercher;
    TextView txt_num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechercher_compteur);
        getSupportActionBar().hide();
        menu=(Button)findViewById(R.id.btn_menu_rechercher);
        rechercher=(Button)findViewById(R.id.btn_rechercher);
        txt_num=(TextView)findViewById(R.id.txt_num);
        rechercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mydb dd=new Mydb(Rechercher_compteur.this);
                SQLiteDatabase db=dd.getReadableDatabase();
                Cursor cr=db.rawQuery("select * from releveur",null);
                cr.moveToNext();
                ArrayList<releveur> lir=new ArrayList<releveur>();
                while (cr.moveToNext()){
                    releveur re=new releveur();
                    re.setId_releveur(cr.getInt(0));
                    lir.add(re);
                }
                for (releveur r:lir){
                    txt_num.setText(r.getId_releveur());
                }
                cr.close();
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuIn=new Intent(Rechercher_compteur.this,com.example.service_relever.Menu_relveur.class);
                Rechercher_compteur.this.startActivity(menuIn);
            }
        });
    }
}