package com.example.equipo.ropero;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Equipo on 14/01/2018.
 */

public class CestaAdapter extends ArrayAdapter<Ropa> {
    public CestaAdapter(Context context, ArrayList<Ropa> ropaVendida) {
        super(context,0,ropaVendida);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view==null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.esqueleto_cesta, parent,false);

        }

        Ropa ropa = getItem(position);

        ImageView imageView = view.findViewById(R.id.imagen_cesta);
        imageView.setImageResource(ropa.getFoto());

        TextView nombre = view.findViewById(R.id.nombre_cesta);
        nombre.setText(ropa.getNombre());

        TextView descripcion = view.findViewById(R.id.descripcion_cesta);
        descripcion.setText(ropa.getDescripcion());

        String precio = String.valueOf(ropa.getPrecio());
        TextView precioT = view.findViewById(R.id.precio_cesta);
        precioT.setText(precio);


        return view;
    }
}
