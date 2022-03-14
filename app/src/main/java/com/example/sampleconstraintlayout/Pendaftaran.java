package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Pendaftaran extends AppCompatActivity {

    //deklarasi variable
    EditText edtNama, edtEmail, edtAlamat, edtPassword, edtRePassword;

    //deklarasi variable floating button
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        fab = findViewById(R.id.fabSimpan);
        edtNama = findViewById(R.id.edNama);
        edtEmail = findViewById(R.id.edEmail);
        edtAlamat = findViewById(R.id.edAlamat);
        edtPassword = findViewById(R.id.edPassword);
        edtRePassword = findViewById(R.id.edrePass);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNama.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() || edtRePassword.getText().toString().isEmpty()){
                    Snackbar.make(view, "Wajib isi seluruh Data !!!", Snackbar.LENGTH_LONG).show();

                }
                else{
                    if(edtPassword.getText().toString().equals(edtRePassword.getText().toString())){
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil..", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);

                    }else{
                        Snackbar.make(view, "Kedua Password tidak sama", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}