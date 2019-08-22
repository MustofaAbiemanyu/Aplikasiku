package com.mustofa.aplikasimuslimku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private Button btn_doa;
    private Button btn_sholat;
    private Button btn_Halal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_doa=(Button) findViewById(R.id.btn_doa_harian);
        btn_sholat=(Button) findViewById(R.id.btn_jadwal_sholat);
        btn_Halal=(Button) findViewById(R.id.btn_produk_halal);



        btn_sholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Shalatku.class);
                startActivity(intent);
            }
        });

        btn_Halal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Produkku.class);
                startActivity(intent);
            }
        });

        btn_doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoaHarianku.class);
                startActivity(intent);
            }
        });
    }
}
