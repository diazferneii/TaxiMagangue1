package com.example.taximagangue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioActivity extends AppCompatActivity {
    Button btnCliente;
    Button btnConductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnConductor =(Button)findViewById(R.id.btnConduct);
        btnCliente =(Button)findViewById(R.id.btnClient);

        btnCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSelectAuth();
            }
        });

        btnConductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSelectAuth();
            }
        });

    }

    private void gotoSelectAuth() {
        Intent intent = new Intent(InicioActivity.this, OptionAuthActivity.class);
        startActivity(intent);
    }
}