package com.mustofa.aplikasimuslimku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataDoaku extends AppCompatActivity {

    //Deklarassi Variable
    private TextView Getdoa, Getarab, Getbaca, Getarti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doaku);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getbaca = findViewById(R.id.getbaca);
        Getarti = findViewById(R.id.getarti);
        showData();
    }

    @SuppressWarnings("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Doa dari Activity sebelumnya
        String doa = getIntent().getExtras().getString ("MyName");

        //Menentukan identitas yang ditampilkan berdasarkan doa yang dipilih
        switch (doa){
            case "Doa Sebelum Makan":
                Getdoa.setText("Doa Sebelum Makan");
                Getarab.setText("اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
                Getbaca.setText("Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar");
                Getarti.setText("Artinya: Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka");
                break;

            case "Doa Sesudah Makan":
                Getdoa.setText("Doa Sesudah Makan");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَِ");
                Getbaca.setText("Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin");
                Getarti.setText("Artinya: Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam");
                break;

            case "Doa Sesudah Minum":
                Getdoa.setText("Doa Sesudah Minum");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ جَعَلَهُ عَذْبًا فُرَاتًا بِرَحْمَتِهِ وَلَمْ يَجْعَلْهُ مِلْحًا اُجَاجًا بِذُنُوْبِنَاِ");
                Getbaca.setText("Alhamdu lillaahil ladzi ja'alahuu 'adzbam furootam birohmatihii wa lamyaj'alhu milhan ujaajam bidzunuubinaa");
                Getarti.setText("Artinya: Segala puji bagi Allah yang telah menjadikan air ini (minuman) segar dan menggiatkan dengan rahmat-Nya dan tidak menjadikan air ini (minuman) asin lagi pahit karena dosa-dosa kami");
                break;

            case "Doa Ketika Makan Lupa Membaca Doa":
                Getdoa.setText("Doa Ketika Makan Lupa Membaca Doa");
                Getarab.setText("بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهَِِ");
                Getbaca.setText("Bismillaahi fii awwalihi wa aakhirihi");
                Getarti.setText("Artinya: Dengan menyebut nama Allah pada awal dan akhirnya");
                break;

            case "Doa Sebelum Tidur":
                Getdoa.setText("Doa Sebelum Tidur");
                Getarab.setText("بِسْمِكَ االلّٰهُمَّ اَحْيَا وَبِاسْمِكَ اَمُوْتَُِِ");
                Getbaca.setText("Bismikallaahuma ahyaa wa bismika amuutu");
                Getarti.setText("Artinya: Dengan menyebut nama-Mu, Ya Allah, aku hidup dan dengan menyebut nama-Mu aku mati");
                break;

            case "Doa Ketika Mimpi Buruk":
                Getdoa.setText("Doa Ketika Mimpi Buruk");
                Getarab.setText("اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمَِِِ");
                Getbaca.setText("Allaahumma innii a'uudzubika min 'amalisy syaithaani wa sayyiaatil ahlami");
                Getarti.setText("Artinya: Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk");
                break;

            case "Doa Ketika Mimpi Baik":
                Getdoa.setText("Doa Ketika Mimpi Baik");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتُِ");
                Getbaca.setText("Alhamdulillahil ladzii qodzoo haajaati");
                Getarti.setText("Artinya: Segala puji bagi Allah yang telah memberi hajatku");
                break;

            case "Doa Masuk Kamar Mandi":
                Getdoa.setText("Doa Masuk Kamar Mandi");
                Getarab.setText("اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثُُِِ");
                Getbaca.setText("Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi");
                Getarti.setText("Artinya: Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan setan perempuan");
                break;

            case "Doa Istinja":
                Getdoa.setText("Doa Istinja");
                Getarab.setText("اَللّٰهُمَّ حَسِّنْ فَرْجِىْ مِنَ الْفَوَاخِشِ وَظَهِّرْ قَلْبِيْ مِنَ النِّفَاقُِِ");
                Getbaca.setText("Alloohumma thahhir qolbii minan nifaaqi wa hashshin fajrii minal fawaahisyi");
                Getarti.setText("Artinya : Wahai Tuhanku, sucikanlah hatiku dari sifat kepura-puraan (munafiq) serta peliharalah kemaluanku dari perbuatan keji");

        }
    }
}