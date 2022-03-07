package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {

    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //menghubungkan variable txEmail dengan component TextView pada layout
        txEmail = findViewById(R.id.tvEmail2);

        //menghubungkan variable txPassword dengan component TextView pada layout
        txPassword = findViewById(R.id.tvPassword2);

        //Mendeklarasikan bundle yang akan digunakan untuk mengambil pesan
        // atau nilai yang dikirimkan melalui intent dari activity pertama ke activity kedua.

        Bundle bundle = getIntent().getExtras();

        //Buat sintak yang berfungsi untuk mengambil nilai yang dikirimkan dengan menggunakan
        // intent dari activity pertama ke activity kedua. Method yang digunakan
        // adalah method “bundle.getString(“key”)” dan kemudian simpan nilai
        // tersebut kedalam variabel dengan tipe data string.

        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        //Tampilkan nilai tersebut kedalam textview dengan menggunakan method
        // “TextView.setText(value)”.

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}