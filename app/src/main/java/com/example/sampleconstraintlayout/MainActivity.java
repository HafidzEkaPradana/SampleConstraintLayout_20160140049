package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variable untuk Button
    Button btnLogin;

    //Deklarasi variable untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variable untuk menyimpan email dan password
    String nama, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variable btn login dengan component button pada layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variable edemail dengan component pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variable edpassword dengan component pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnlogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                //menyimpan input user diedittext email kedalam variable name
                nama = edemail.getText().toString();

                //menyimpan input user diedittext password kedalam variable password
                password = edpassword.getText().toString();

                //membuat variable toast dan membuat toast dengan menambah nama dan password
                Toast t = Toast.makeText(getApplicationContext(), "Email Anda : "+nama+ "dan Password anda : " +password+"",Toast.LENGTH_LONG);
                //menampilkan toast
                t.show();
            }
        });
    }




}