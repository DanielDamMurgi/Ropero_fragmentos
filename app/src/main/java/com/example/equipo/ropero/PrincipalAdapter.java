package com.example.equipo.ropero;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Equipo on 13/01/2018.
 */

public class PrincipalAdapter extends ArrayAdapter<Ropa> {
    public PrincipalAdapter(Context context, ArrayList<Ropa> ropa) {
        super(context, 0 , ropa);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.esqueleto, parent,false);

        }

        final Ropa ropa = getItem(position);

        ImageView foto = listItemView.findViewById(R.id.imagen);
        foto.setImageResource(ropa.getFoto());

        TextView nombre = listItemView.findViewById(R.id.nombre);
        nombre.setText(ropa.getNombre());

        TextView descripcion = listItemView.findViewById(R.id.descripcion);
        descripcion.setText(ropa.getDescripcion());

        String precio = String.valueOf(ropa.getPrecio());
        TextView precioT = listItemView.findViewById(R.id.precio);
        precioT.setText(precio);


        return listItemView;
    }
}
