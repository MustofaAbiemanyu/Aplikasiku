package com.mustofa.aplikasimuslimku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class DoaHarianku extends AppCompatActivity {
    //Data-data yang akan dimasukan pada listview
    private String[] doa = {"Doa Sebelum Makan", "Doa Sesudah Makan", "Doa Sesudah Minum", "Doa Ketika Makan Lupa Membaca Doa", "Doa Sebelum Tidur",
            "Doa Ketika Mimpi Buruk", "Doa Ketika Mimpi Baik", "Doa Masuk Kamar Mandi", "Doa Istinja"};

    //arraylist digunakan untuk menampung data doa
    private ArrayList<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_harianku);
        ListView listView = findViewById(R.id.listitem);
        data = new ArrayList<>();
        getData();
        //ArrayAdapter digunakan untuk mengatur , bagaimana item pada ListView akan tampil
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

        //Menambahkan listener , untuk menangani kejadian saat salah satu iteem listview di klik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //mendapatkan nama pada salah satu item yang diklik, berdasarkan posisinya

                String getName=data.get(position);
                //berpindah activity dan mempassing data nama pada activity selanjutnya
                Intent sendData = new Intent(DoaHarianku.this, DataDoaku.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });

    }
    private void getData(){
        //memasukan semua data ayat kedalam arraylist
        Collections.addAll (data, doa);}}


