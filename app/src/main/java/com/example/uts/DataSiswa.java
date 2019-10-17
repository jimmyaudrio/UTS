package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DataSiswa extends AppCompatActivity {

    private Button btAlert;
    private EditText nisInput;
    private EditText namaInput;
    private EditText alamatInput;
    private EditText handphoneInput;
    private EditText keteranganInput;
    String nis, nama, alamat, handphone, keterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_siswa);
        nisInput = findViewById(R.id.input_Nis);
        namaInput = findViewById(R.id.input_nama);
        alamatInput = findViewById(R.id.input_alamat);
        handphoneInput = findViewById(R.id.input_handphone);
        keteranganInput = findViewById(R.id.input_keterangan);

    }

    public void handleOk(View view) {
        nis = nisInput.getText().toString();
        nama = namaInput.getText().toString();
        alamat = alamatInput.getText().toString();
        handphone = handphoneInput.getText().toString();
        keterangan = keteranganInput.getText().toString();
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Data siswa");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Nis : " + nis + "\nNama : " + nama + "\nAlamat : "+ alamat +"\nhandphone : "+handphone +"\nKeterangan : "+keterangan)
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        DataSiswa.this.finish();
                    }
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol ini diklik, akan menutup dialog
                        // dan tidak terjadi apa2
                        dialog.cancel();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }

    }
