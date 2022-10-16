package com.example.projet_agenda;

import java.util.Date;

public class Evenement {
    //attributs
    private String titre;
    private String contenu;
    private String tag;
    private Date date;
    private String image; //lien vers le dossier image


    //const
    public Evenement(String titre, String contenu, String tag, Date date, String image){
        this.titre = titre;
        this.contenu = contenu;
        this.tag = tag;
        this.date = date;
        this.image = image;
    }


    //getters / setters
    public String getTitre(){return titre;}

    public String getContenu(){return contenu;}

    public String getTag(){return tag;}

    public Date getDate(){return date;}

    public String getImage(){return image;}

    public void setTitre(String t){this.titre = t;}

    public void setContenu(String c){this.contenu = c;}

    public void setTag(String t){this.tag = t;}

    public void setDate(Date d){this.date = d;}


}//fin class
