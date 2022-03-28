package com.example.sampleconstraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
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
    public boolean onCreateOptionsMenu(Menu menu) {
        //method untuk menampilkan menu
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //membuat kondisi jika yang dipilih adalah id mnDaftar
        if(item.getItemId() == R.id.mnDaftar)
        {
            //method memanggil activity "Pendaftaran"
            Intent i = new Intent(getApplicationContext(), Pendaftaran.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

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

                //set isi email yang benar
                String email = "hafidz@gmail.com";
                //set password yang benar
                String passwordAnda = "hafidz99";


                //menyimpan input user diedittext email kedalam variable name
                nama = edemail.getText().toString();

                //menyimpan input user diedittext password kedalam variable password
                password = edpassword.getText().toString();

                //membuat variable toast dan membuat toast dengan menambah nama dan password
                //Toast t = Toast.makeText(getApplicationContext(), "Email Anda : "+nama+ "dan Password anda : " +password+"",Toast.LENGTH_LONG);
                //menampilkan toast
                //t.show();
                if(nama.isEmpty() || password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(), "Email dan Password wajib diisi", Toast.LENGTH_SHORT);
                    t.show();
                }else{
                    //mengecek apakah email dan password sudah sama dengan email dan password
                    //yang sudah diset
                    if(nama.equals(email) && password.equals(passwordAnda)){
                        Toast t = Toast.makeText(getApplicationContext(), "Login Sukses",Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        //memasukkan value dari variable nama dengan kunci "a"
                        //dan dimasukkan dibundle

                        b.putString("a", nama.trim());
                        //memasukkan value dari variable nama dengan kunci "b"
                        //dan dimasukkan dibundle

                        b.putString("b", password.trim());

                        //membuat object indent berpindah activity dari mainactivity ke activityhasil
                        Intent i = new Intent(getApplicationContext(), Home_Activity.class);

                        //memasukkan bundle ke dalam intent untuk dikirimkan ke activityHasil
                        i.putExtras(b);
                        //berpindah ke ActivityHasil
                        startActivity(i);
                    }
                }


            }
        });
    }




}