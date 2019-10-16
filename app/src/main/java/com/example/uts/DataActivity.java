package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    private TextView nistext;
    private TextView namatext;
    private TextView alamattext;
    private TextView handphonetext;
    private TextView keterangantext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        nistext = findViewById(R.id.text_nis);
        namatext = findViewById(R.id.text_nama);
        alamattext = findViewById(R.id.text_alamat);
        handphonetext = findViewById(R.id.text_handphone);
        keterangantext = findViewById(R.id.text_keterangan);

//        Untuk mendapatkan akses data yang telah dikirimkan dapat menggunakan method
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            nistext.setText(String.valueOf(getIntent().getIntExtra("Nis", 0)));
            namatext.setText(extras.getString("nama"));
            alamattext.setText(extras.getString("alamat"));
            handphonetext.setText(String.valueOf(getIntent().getIntExtra("handphone", 0)));
            keterangantext.setText(extras.getString("keterangan"));
        }
    }
}
