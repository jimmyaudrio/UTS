package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonsiswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsiswa = findViewById(R.id.buttonsiswa);
    }

    public void handleSiswa(View view) {
        Intent intent =  new Intent(this,DataSiswa.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }
}
