package com.example.himnariojovenes;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.himnariojovenes.db.dbHelper;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class fragment15 extends Fragment {

    public fragment15() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LayoutInflater lf = getActivity().getLayoutInflater();
        View view =lf.inflate(R.layout.fragment_fragment15, container, false);

        TextView tvNameHimno = (TextView) view.findViewById(R.id.nameHimno15);
        TextView tvNumberHimno = (TextView) view.findViewById(R.id.numberHimno15);

        dbHelper db = new dbHelper(getActivity(), "administrar", null, 1);
        SQLiteDatabase basedeDatos = db.getWritableDatabase();

        Cursor fila = basedeDatos.rawQuery("SELECT number, name FROM himnos WHERE number LIKE '15'", null);

        if (fila.moveToFirst()){
            tvNumberHimno.setText(fila.getString(0));
            tvNameHimno.setText(fila.getString(1));
        }

        return view;
    }
}