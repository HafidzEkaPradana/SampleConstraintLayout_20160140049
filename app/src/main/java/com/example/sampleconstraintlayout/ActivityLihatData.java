package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);


        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama){
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122244433");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08122244411");
                break;
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("08122244400");
                break;
            case "Eris":
                tvnama.setText("Eris C M");
                tvnomor.setText("08599944433");
                break;
            case "Maul":
                tvnama.setText("Maul N");
                tvnomor.setText("08976244433");
                break;
            case "Intan":
                tvnama.setText("Intan B");
                tvnomor.setText("08122244433");
                break;
            case "Vina":
                tvnama.setText("Vina P");
                tvnomor.setText("08122847233");
                break;
            case "Gita":
                tvnama.setText("Gita K");
                tvnomor.setText("08502244433");
                break;
            case "Lutfi":
                tvnama.setText("M Lutfi");
                tvnomor.setText("085613743912");
                break;
            case "Vian":
                tvnama.setText("Vian N");
                tvnomor.setText("08184724433");
                break;

        }


    }
}