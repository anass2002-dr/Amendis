package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class reliever_form extends AppCompatActivity{
    Spinner s1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_releveur_form);
        getSupportActionBar().hide();
        b1=(Button)findViewById(R.id.btn_menu_relver);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent();
                String user=intent2.getStringExtra("user");
                if(user.equals("releveur")){
                    Intent intent=new Intent(reliever_form.this,com.example.service_relever.Menu_relveur.class);
                    startActivity(intent);
                }
                else if(user.equals("admin")){
                    Intent intent=new Intent(reliever_form.this,com.example.service_relever.Menu_admin.class);
                    startActivity(intent);
                }

            }
        });
//        String[] arr={"SE","CS","RA","RM"};
//        s1=(Spinner)findViewById(R.id.sp_etat);
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arr);
//        s1.setAdapter(adapter);
//        s1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(reliever_form.this,adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

}