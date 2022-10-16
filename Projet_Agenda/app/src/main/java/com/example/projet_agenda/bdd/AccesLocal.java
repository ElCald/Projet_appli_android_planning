package com.example.projet_agenda.bdd;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;

import com.example.projet_agenda.Evenement;

import java.util.Date;

public class AccesLocal {

    //attributs
    private String nomBDD = "bdAgenda.sqlite";
    private Integer versionBase = 1;
    private MySQLiteOpenHelper accesBD;
    private SQLiteDatabase bdd;

    //const
    public AccesLocal(Context contexte){
        accesBD = new MySQLiteOpenHelper(contexte, nomBDD, null, versionBase);
    }

    //methodes
    public void ajout(@NonNull Evenement event){
        bdd = accesBD.getWritableDatabase();

        String titre = event.getTitre();
        String contenu = event.getContenu();
        String tag = event.getTag();
        Date date = event.getDate();
        String image = event.getImage();


        String req = "INSERT INTO agenda (titre, contenu, tag, date, image) VALUES (\""+titre+"\",\""+contenu+"\",\""+tag+"\",\""+new Date()+"\",\""+image+"\")";
        bdd.execSQL(req);
    }



    public Evenement recupN(int n){
        bdd = accesBD.getReadableDatabase();
        Evenement event = null;
        String req = "SELECT * FROM agenda";
        Cursor curseur = bdd.rawQuery(req, null);
        curseur.moveToPosition(n);

        if(!curseur.isAfterLast()){
            String titre = curseur.getString(0);
            String contenu = curseur.getString(1);
            String tag = curseur.getString(2);
            Date date = new Date();
            String image = curseur.getString(4);

            event = new Evenement(titre, contenu, tag, date, image);
        }

        curseur.close();
        return event;

    }//fin recup


}//fin class

