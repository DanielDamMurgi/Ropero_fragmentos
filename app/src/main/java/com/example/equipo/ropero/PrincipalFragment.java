package com.example.equipo.ropero;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class PrincipalFragment extends Fragment {

    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_principal, container, false);



        final ArrayList<Ropa> ropa = new ArrayList<>();
        final ArrayList<Ropa> cesta = new ArrayList<>();

        ropa.add(new Ropa("Calcetin rojo","100% algodon",5, R.drawable.calcetin));
        ropa.add(new Ropa("Calcetin azul","100% algodon",3, R.drawable.calcetin3));
        ropa.add(new Ropa("Camiseta cebra","100% poliester",15, R.drawable.camiseta));
        ropa.add(new Ropa("Gorra"," naraja",4, R.drawable.gorra1));
        ropa.add(new Ropa("Legging","Con dibujos de mariposas",8, R.drawable.legging));

        PrincipalAdapter adapter = new PrincipalAdapter(getContext(), ropa);

        ListView listView = view.findViewById(R.id.listaRopa);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Ropa ropa1 = ropa.get(position);

                cesta.add(ropa1);



            }
        });


        Button button = view.findViewById(R.id.boton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CestaActivity.class);
                intent.putExtra("cesta", cesta);

                getActivity().startActivity(intent);
            }
        });


        return view;
    }





}

