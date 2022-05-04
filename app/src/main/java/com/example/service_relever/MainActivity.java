package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.service_relever.les_class.Mydb;
import com.example.service_relever.les_class.releveur;

public class MainActivity extends AppCompatActivity {

    String url="jdbc:mysql://127.0.0.1:3306/amendis";
    String user="root";
    String pass="Ana@21s$";

    EditText email,password;
    Button btn_connect;
    ImageView v1,v2,v3;
    LinearLayout li1;
    String txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        email=(EditText)findViewById(R.id.txt_email);
        password=(EditText)findViewById(R.id.txt_password);
        btn_connect =(Button)findViewById(R.id.btn_connecter);
        v1=(ImageView)findViewById(R.id.img1);
        v2=(ImageView)findViewById(R.id.img2);
        v3=(ImageView)findViewById(R.id.img3);
        li1=(LinearLayout) findViewById(R.id.linear_edit);
        animation(email);
        animation(password);
        animation(btn_connect);
        animation(v1);
        animation(v2);
        animation(v3);
        animation(li1);


        btn_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Mydb sqlit=new Mydb(MainActivity.this);

                SQLiteDatabase db=sqlit.getWritableDatabase();
                releveur r=new releveur(email.getText().toString(),password.getText().toString());
                db.execSQL("insert into releveur(email,password) values('"+r.getEmail()+"','"+r.getPassword()+"')");

//                Mydb.ajouter_releveur(db,r);
//                Cursor cr=db.rawQuery("select * from releveur",null);
//                cr.moveToNext();
//                while (cr.moveToNext()){
//                    Toast.makeText(MainActivity.this, " "+cr.getString(1), Toast.LENGTH_SHORT).show();
//                }

//                Toast.makeText(MainActivity.this, " "+sqlit.ll(), Toast.LENGTH_SHORT).show();
//                cr.close();
//                txt=email.getText().toString();
//                String aa="agent";
//
//                if(txt.equals(new String("agent"))){
//
//                    Intent intent =new Intent(MainActivity.this,com.example.service_relever.Menu_Agent.class);
//                    intent.putExtra("user","agent");
//                    MainActivity.this.startActivity(intent);
//                }
//                else if (txt.equals(new String("releveur"))) {
//
//
                    Intent intent =new Intent(MainActivity.this,com.example.service_relever.Menu_relveur.class);
                    intent.putExtra("user","releveur");
                    MainActivity.this.startActivity(intent);
//                }
//                else if (txt.equals(new String("admin"))) {
//
//
//                    Intent intent =new Intent(MainActivity.this,com.example.service_relever.Menu_admin.class);
//                    intent.putExtra("user","admin");
//                    MainActivity.this.startActivity(intent);
//                }


            }
        });
    }
    public void animation(View view){
        view.animate().alpha(1).setDuration(1000).translationY(0);
    }

}