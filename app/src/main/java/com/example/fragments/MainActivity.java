package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonRojo;
    private Button buttonVerde;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InicializarButtonsWithFindview();

        


    }

    private void InicializarButtonsWithFindview() {
        buttonRojo = findViewById(R.id.buttonRojo);
        buttonVerde = findViewById(R.id.buttonVerde);
    }
}
