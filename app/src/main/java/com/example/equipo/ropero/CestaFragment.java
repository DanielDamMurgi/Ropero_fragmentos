package com.example.equipo.ropero;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CestaFragment extends Fragment {

    public CestaFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cesta, container, false);

        ArrayList<Ropa> ropaVendida = (ArrayList<Ropa>) getActivity().getIntent().getSerializableExtra("cesta");

        //ArrayList<Ropa> ropaVendida = new ArrayList<>();

        //ropaVendida.add(new Ropa("Calcetin rojo","100% algodon",5, R.drawable.calcetin));

        CestaAdapter cestaAdapter = new CestaAdapter(getContext(),ropaVendida);

        ListView listView = view.findViewById(R.id.lista_cesta);

        listView.setAdapter(cestaAdapter);



        return view;
    }


}
