package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonRojo;
    private Button buttonVerde;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InicializarButtonsWithFindview();

        buttonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cambiarFragment(new RojoFragment());

                }
        });

        buttonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarFragment(new VerdeFragment());
            }
        });



    }

    private void cambiarFragment (Fragment fragmento){

        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layoutContenedorFragments, fragmento).addToBackStack(null).commit();
    }

    private void InicializarButtonsWithFindview() {
        buttonRojo = findViewById(R.id.buttonRojo);
        buttonVerde = findViewById(R.id.buttonVerde);
    }
}
