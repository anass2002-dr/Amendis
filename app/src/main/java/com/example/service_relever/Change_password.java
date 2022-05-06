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

public class Change_password extends AppCompatActivity {
    Button menu,ok_pass;
    EditText txt_login,txt_pass,txt_new_pass,txt_confirme;
    String user1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        getSupportActionBar().hide();
        txt_login=(EditText)findViewById(R.id.txt_login);
        txt_pass=(EditText)findViewById(R.id.txt_ancien);
        txt_new_pass=(EditText)findViewById(R.id.txt_nvpass);
        txt_confirme=(EditText)findViewById(R.id.txt_confrmer_pass);

        txt_login.setText(MainActivity.login);
        txt_login.setEnabled(false);


        ok_pass=(Button)findViewById(R.id.btn_ok_password);
        ok_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login=txt_login.getText().toString();
                String ancien=txt_pass.getText().toString();
                String nv=txt_new_pass.getText().toString();
                String confirme=txt_confirme.getText().toString();
                Mydb dd=new Mydb(Change_password.this);
                SQLiteDatabase db=dd.getWritableDatabase();
                if (MainActivity.pass.equals(ancien)){
                    if(nv.equals(confirme)){
                        Mydb.update_password(db,MainActivity.user1,login,nv);
                        Toast.makeText(Change_password.this,"changer avec succes",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(Change_password.this,"le mot de passe de confirmation est incorrect!!",Toast.LENGTH_SHORT).show();
                        txt_confirme.setText("");

                    }
                }
                else
                {
                    txt_pass.setText("");
                    Toast.makeText(Change_password.this, "le mot de pass ancien est incorrect!", Toast.LENGTH_SHORT).show();

                }

            }
        });
        Button annuler=(Button)findViewById(R.id.btn_annuler_password);
        annuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_pass.setText("");
                txt_confirme.setText("");
                txt_new_pass.setText("");

            }
        });

        menu=(Button)findViewById(R.id.btn_menu_password);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent();
                String user=intent2.getStringExtra("user");
                if(user.equals("agent")){
                    Intent intent=new Intent(Change_password.this,com.example.service_relever.Menu_Agent.class);
                    startActivity(intent);
                }
                else if(user.equals("admin")){
                    Intent intent=new Intent(Change_password.this,com.example.service_relever.Menu_admin.class);
                    startActivity(intent);
                }
                else if(user.equals("releveur")){
                    Intent intent=new Intent(Change_password.this,com.example.service_relever.Menu_relveur.class);
                    startActivity(intent);
                }
            }
        });
        Button fermer=(Button)findViewById(R.id.btn_fermer_password);
        fermer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu.performClick();
            }
        });
    }
}