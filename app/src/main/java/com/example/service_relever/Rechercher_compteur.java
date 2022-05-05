package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.service_relever.les_class.Mydb;
import com.example.service_relever.les_class.admin;
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
        rechercher=(Button)findViewById(R.id.btn_ok_rechercher);
        txt_num=(TextView)findViewById(R.id.txt_num);
        rechercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Rechercher_compteur.this, "rechercher", Toast.LENGTH_SHORT).show();
                Mydb dd=new Mydb(Rechercher_compteur.this);
                SQLiteDatabase db=dd.getReadableDatabase();
                Cursor cr=db.rawQuery("select * from admin",null);
                cr.moveToNext();
                ArrayList<admin> lir=new ArrayList<admin>();
                while (cr.moveToNext()){
                    admin re=new admin(cr.getString(1).toString(),cr.getString(2).toString());

                    lir.add(re);
                }
                String varb="";
                for (admin r:lir){
                    varb=r.getEmail();
                }
                txt_num.setText(varb);
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