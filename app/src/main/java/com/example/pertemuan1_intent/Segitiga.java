package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        final EditText alas =
                (EditText)findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);
        final EditText hasil =
                (EditText)findViewById(R.id.output_hasil);
        final Button hitung =
                (Button)findViewById(R.id.btn_hitung);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String inputalas = alas.getText().toString();
                String inputtinggi = tinggi.getText().toString();
                double a = Double.parseDouble(inputalas);
                double t = Double.parseDouble(inputtinggi);
                double h= a*t/2;
                String output = String.valueOf(h);
                hasil.setText(output.toString());
            }
        });
    }
}