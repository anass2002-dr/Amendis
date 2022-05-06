package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.service_relever.les_class.Mydb;
import com.example.service_relever.les_class.fluid;
import com.example.service_relever.les_class.releveur;

import java.util.ArrayList;

public class Parametrage_fluid_agent extends AppCompatActivity {
    Button ok,annuler,ferme;
    Spinner sp;
    EditText txt_max,txt_min,txt_infirieur,txt_suppiereur;
    Mydb dd;
    SQLiteDatabase db;
    ArrayList<fluid> fel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametrage_fluid_agent);
        getSupportActionBar().hide();

        txt_max=(EditText)findViewById(R.id.txt_filter_max);
        txt_min=(EditText)findViewById(R.id.txt_filter_min);
        txt_infirieur=(EditText)findViewById(R.id.txt_filter_infirieur);
        txt_suppiereur=(EditText)findViewById(R.id.txt_filter_superieur);
        sp=(Spinner)findViewById(R.id.sp_fluid_agent);
        dd=new Mydb(Parametrage_fluid_agent.this);

        SQLiteDatabase db2=dd.getWritableDatabase();
        ArrayList<fluid> li=new ArrayList<fluid>();

//        String code1="EA";

//        db2.execSQL("insert into fluid(code_fluid,filter_max,filter_supperieur,filter_infirieur,filter_min) values('"+code1+"',80.5,58.2,36.9,24.2)");


//        db2.execSQL("insert into fluid(code_fluid,filter_max,filter_supperieur,filter_infirieur,filter_min) values('"+code+"',80.5,14.9,52.8,91.4)");
        db=dd.getReadableDatabase();
        ArrayList<fluid> list=new ArrayList<fluid>();
        Cursor cr=db.rawQuery("select * from fluid",null);
        cr.moveToNext();
        while (cr.moveToNext()){
            fluid fluid=new fluid();
            fluid.setId_fluid(cr.getInt(0));
            fluid.setCode_fluid(cr.getString(1));
            fluid.setFilter_max(cr.getDouble(2));
            fluid.setFilter_min(cr.getDouble(3));
            fluid.setFilte_infirieur(cr.getDouble(4));
            fluid.setFilter_supperieur(cr.getDouble(5));
            list.add(fluid);
        }
        cr.close();
        ArrayList<String> ff=new ArrayList<>();
        for(fluid f:list){
            ff.add(f.getCode_fluid());
        }
        ArrayAdapter<String> ad=new ArrayAdapter<String>(Parametrage_fluid_agent.this, android.R.layout.simple_list_item_1,ff);
        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String cod=adapterView.getItemAtPosition(i).toString();
                Cursor cr=db.rawQuery("select * from fluid where code_fluid ='"+cod+"'",null);
                cr.moveToNext();
                while (cr.moveToNext()){
                    txt_max.setText(Double.toString(cr.getDouble(1)));
                    txt_min.setText(Double.toString(cr.getDouble(4)));
                    txt_suppiereur.setText(Double.toString(cr.getDouble(2)));
                    txt_infirieur.setText(Double.toString(cr.getDouble(3)));
                }
                cr.close();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ok=(Button)findViewById(R.id.btn_ok_fluid_parametrage);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button menu=(Button)findViewById(R.id.btn_menu_fluid_parametrage);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu_intent=new Intent(Parametrage_fluid_agent.this,com.example.service_relever.Menu_Agent.class);
                Parametrage_fluid_agent.this.startActivity(menu_intent);
            }
        });

    }
    public void remplir(){

    }
}