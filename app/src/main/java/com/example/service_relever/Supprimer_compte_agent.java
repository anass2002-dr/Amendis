package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.service_relever.les_class.Mydb;
import com.example.service_relever.les_class.releveur;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Supprimer_compte_agent extends AppCompatActivity {
    Button sup;
    TextView txt_login;
    ArrayList<releveur> rel;
    Mydb dd;
    Spinner sp;
    String login;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supprimer_compte_agent);
        getSupportActionBar().hide();
        sp=(Spinner)findViewById(R.id.sp_login_releveur);

remplir();
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                login=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sup=(Button)findViewById(R.id.btn_supprimer_compte_agent);
        txt_login=(TextView)findViewById(R.id.txt_login_releveur);
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aa="";
                Mydb.supprimer_compte_releveur(db,login);
                Toast.makeText(Supprimer_compte_agent.this, "suppresion avec succes", Toast.LENGTH_SHORT).show();
                remplir();

            }
        });
        Button menu=(Button)findViewById(R.id.btn_menu_supprimer_compte_agent);

        Button fermer=(Button)findViewById(R.id.btn_fermer_supprimer_compte_agent);
        fermer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu.performClick();
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Supprimer_compte_agent.this,com.example.service_relever.Menu_Agent.class);
                startActivity(intent);

            }
        });
    }
    public void remplir(){
        dd=new Mydb(Supprimer_compte_agent.this);
        db=dd.getReadableDatabase();
        ArrayList<String> relev=new ArrayList<>();
        rel=Mydb.Afficher_releveur(db);

        for(releveur r:rel){
            relev.add(r.getEmail().toString());
        }
        ArrayAdapter<String> ad=new ArrayAdapter<>(Supprimer_compte_agent.this, android.R.layout.simple_list_item_1,relev);
        sp.setAdapter(ad);
    }
}