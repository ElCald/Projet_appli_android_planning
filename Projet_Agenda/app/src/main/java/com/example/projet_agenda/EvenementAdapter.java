package com.example.projet_agenda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class EvenementAdapter extends BaseAdapter {

    //attribut
    private Context contexte;
    private List<Evenement> listeEvent;
    private LayoutInflater inflater;


    //const
    public EvenementAdapter(Context contexte, List<Evenement> listeEvent){
        this.listeEvent = listeEvent;
        this.contexte = contexte;
        this.inflater = LayoutInflater.from(contexte);
    }

    @Override
    public int getCount() {
        return listeEvent.size();
    }

    @Override
    public Evenement getItem(int position) {
        return listeEvent.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.adapter_item, null);

        Evenement currentItem = getItem(i);

        String itemTitre = currentItem.getTitre();

        TextView itemTitreView = (TextView) view.findViewById(R.id.titre);

        itemTitreView.setText(itemTitre);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(contexte, "Vous avez cliqué sur "+itemTitre,  Toast.LENGTH_SHORT).show();
            }
        });//fin onClick view


        return view;
    }
}//fin class
