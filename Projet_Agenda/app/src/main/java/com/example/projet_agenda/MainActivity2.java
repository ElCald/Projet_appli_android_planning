package com.example.projet_agenda;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    private Toolbar barreTache;
    private ImageView fleche_retour;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.barreTache = (Toolbar) findViewById(R.id.TBar);
        setSupportActionBar(barreTache);

        this.fleche_retour = (ImageView) findViewById(R.id.fleche_retour);
        fleche_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activite1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activite1);
                finish();
            }
        });//fin onClick fleche_retour
    }
}//fin class