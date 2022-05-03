package com.example.service_relever;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
//                new task().execute();
//                String result="Database connection success\n";
//                try {
//                StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
//                StrictMode.setThreadPolicy(policy);
//
//                    Class.forName("com.mysql.jdbc.Driver");
//
//                    Connection con= DriverManager.getConnection(url,user,pass);
//                    Statement st=con.createStatement();
//                    ResultSet rs=st.executeQuery("select * from admin");
//                    while (rs.next()){
//                        result+=rs.getString(1);
//                    }
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//                Toast.makeText(MainActivity.this, " "+result, Toast.LENGTH_SHORT).show();
//
                txt=email.getText().toString();
                String aa="agent";
//                int aaa=email.getText().length();
//
                if(txt.equals(new String("agent"))){

                    Intent intent =new Intent(MainActivity.this,com.example.service_relever.Menu_Agent.class);
                    intent.putExtra("user","agent");
                    MainActivity.this.startActivity(intent);
                }
                else if (txt.equals(new String("releveur"))) {


                    Intent intent =new Intent(MainActivity.this,com.example.service_relever.Menu_relveur.class);
                    intent.putExtra("user","releveur");
                    MainActivity.this.startActivity(intent);
                }
                else if (txt.equals(new String("admin"))) {


                    Intent intent =new Intent(MainActivity.this,com.example.service_relever.Menu_admin.class);
                    intent.putExtra("user","admin");
                    MainActivity.this.startActivity(intent);
                }


            }
        });
    }
    public void animation(View view){
        view.animate().alpha(1).setDuration(1000).translationY(0);
    }
//    public class task extends AsyncTask<Void,Void,Void>{
//        String resulta="try again";
//        @Override
//        protected Void doInBackground(Void... voids) {
//
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/amendis","root","Ana@21s$");
//                Statement st=con.createStatement();
//                ResultSet rs=st.executeQuery("select * from admin");
//                while(rs.next()){
//                    resulta+=rs.getString(3)+"\n";
//                }
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void unused) {
//            Toast.makeText(MainActivity.this, " "+resulta, Toast.LENGTH_SHORT).show();
//            super.onPostExecute(unused);
//        }
//    }
}