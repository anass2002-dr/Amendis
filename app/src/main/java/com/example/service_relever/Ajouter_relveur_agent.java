package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.service_relever.les_class.Mydb;
import com.example.service_relever.les_class.releveur;

public class Ajouter_relveur_agent extends AppCompatActivity {
    Button btn_ajouter,btn_annule,menu;
    EditText txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_relveur_agent);
        getSupportActionBar().hide();

        txt1=(EditText)findViewById(R.id.txt_login_releveur);
        txt2=(EditText)findViewById(R.id.txt_pass_releveur);
        txt3=(EditText)findViewById(R.id.txt_confrmer_pass_releveur);
        btn_annule=(Button)findViewById(R.id.btn_annuler_ajouter_compte);
        btn_annule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        });
        menu=(Button)findViewById(R.id.btn_menu_ajouter_compte);
        btn_ajouter=(Button)findViewById(R.id.btn_ok_ajouter_compte);
        btn_ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mydb dd=new Mydb(Ajouter_relveur_agent.this);
                SQLiteDatabase db=dd.getWritableDatabase();
                String login=txt1.getText().toString();
                String pass=txt2.getText().toString();
                String confirme=txt3.getText().toString();
                if (pass.equals(confirme)){
                    releveur re=new releveur(login,pass);
                    Mydb.ajouter_releveur(db,re);
                    Toast.makeText(Ajouter_relveur_agent.this, "ajouter avec succes", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Ajouter_relveur_agent.this, "entre login ou mot de passe correct!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu_intent=new Intent(Ajouter_relveur_agent.this,com.example.service_relever.Menu_Agent.class);
                Ajouter_relveur_agent.this.startActivity(menu_intent);
            }
        });
    }
}