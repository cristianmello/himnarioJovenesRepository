package com.example.himnariojovenes;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.himnariojovenes.db.dbHelper;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class fragment1 extends Fragment {

    public fragment1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LayoutInflater lf = getActivity().getLayoutInflater();
        View view =lf.inflate(R.layout.fragment_fragment1, container, false);

        TextView tvNameHimno = (TextView) view.findViewById(R.id.nameHimno1);
        TextView tvNumberHimno = (TextView) view.findViewById(R.id.numberHimno1);

        dbHelper db = new dbHelper(getActivity(), "administrar", null, 1);
        SQLiteDatabase basedeDatos = db.getWritableDatabase();

        Cursor fila = basedeDatos.rawQuery("SELECT number, name FROM himnos WHERE number LIKE '1'", null);

        if (fila.moveToFirst()){
            tvNumberHimno.setText(fila.getString(0));
            tvNameHimno.setText(fila.getString(1));
        }

        return view;
    }

}


