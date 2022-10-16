package com.example.projet_agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView date;
    private Button bouton3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.date = (TextView) findViewById(R.id.text_date);
        date.setText("10/10/10");

        //test

        List<Evenement> liste = new ArrayList<>();
        liste.add(new Evenement("titre1", "contenu1", "tag1", new Date(), "repertoir/image1"));
        liste.add(new Evenement("titre2", "contenu2", "tag2", new Date(), "repertoir/image1"));
        liste.add(new Evenement("titre3", "contenu2", "tag3", new Date(), "repertoir/image1"));
        liste.add(new Evenement("titre4", "contenu2", "tag4", new Date(), "repertoir/image1"));
        liste.add(new Evenement("titre5", "contenu2", "tag5", new Date(), "repertoir/image1"));


        ListView eventListView = (ListView) findViewById(R.id.list_item);
        eventListView.setAdapter(new EvenementAdapter(this, liste));

        this.bouton3 = (Button) findViewById(R.id.btn_button3);
        bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activite2 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(activite2);
                finish();
            }
        });

    }
}