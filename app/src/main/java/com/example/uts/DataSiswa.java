package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DataSiswa extends AppCompatActivity {
    public static final String NIS_KEY = "Nis";
    public static final String NAMA_KEY = "nama";
    public static final String ALAMAT_KEY = "alamat";
    public static final String HANDPHONE_KEY = "handphone";
    public static final String KETERANGAN_KEY = "keterangan";

    private EditText nisinput;
    private EditText namainput;
    private EditText alamatinput;
    private EditText handphoneinput;
    private EditText keteranganinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_siswa);

        nisinput = findViewById(R.id.input_Nis);
        namainput = findViewById(R.id.input_nama);
        alamatinput = findViewById(R.id.input_alamat);
        handphoneinput = findViewById(R.id.input_handphone);
        keteranganinput = findViewById(R.id.input_keterangan);


    }

    public void handleOk(View view) {
        int Nis = Integer.parseInt(nisinput.getText().toString());
        String nama = namainput.getText().toString();
        String alamat = alamatinput.getText().toString();
        int handphone = Integer.parseInt(handphoneinput.getText().toString());
        String keterangan = keteranganinput.getText().toString();

        Intent intent = new Intent(this, DataActivity.class);

        intent.putExtra(NIS_KEY, Nis);
        intent.putExtra(NAMA_KEY, nama);
        intent.putExtra(ALAMAT_KEY, alamat);
        intent.putExtra(HANDPHONE_KEY, handphone);
        intent.putExtra(KETERANGAN_KEY, keterangan);



        startActivity(intent);

    }
}
