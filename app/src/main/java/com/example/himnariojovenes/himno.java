package com.example.himnariojovenes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.himnariojovenes.db.dbHelper;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class himno extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himno);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String numHimno = getIntent().getStringExtra("numeroHimno");

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (numHimno.equals("1")){
            ft.replace(R.id.fgContenedor, new fragment1());
            ft.commit();
        }
        if (numHimno.equals("2")){
            ft.replace(R.id.fgContenedor, new fragment2());
            ft.commit();
        }
        if (numHimno.equals("3")){
            ft.replace(R.id.fgContenedor, new fragment3());
            ft.commit();
        }
        if (numHimno.equals("4")){
            ft.replace(R.id.fgContenedor, new fragment4());
            ft.commit();
        }
        if (numHimno.equals("5")){
            ft.replace(R.id.fgContenedor, new fragment5());
            ft.commit();
        }
        if (numHimno.equals("6")){
            ft.replace(R.id.fgContenedor, new fragment6());
            ft.commit();
        }
        if (numHimno.equals("7")){
            ft.replace(R.id.fgContenedor, new fragment7());
            ft.commit();
        }
        if (numHimno.equals("8")){
            ft.replace(R.id.fgContenedor, new fragment8());
            ft.commit();
        }
        if (numHimno.equals("9")){
            ft.replace(R.id.fgContenedor, new fragment9());
            ft.commit();
        }
        if (numHimno.equals("10")){
            ft.replace(R.id.fgContenedor, new fragment10());
            ft.commit();
        }
        if (numHimno.equals("11")){
            ft.replace(R.id.fgContenedor, new fragment11());
            ft.commit();
        }
        if (numHimno.equals("12")){
            ft.replace(R.id.fgContenedor, new fragment12());
            ft.commit();
        }
        if (numHimno.equals("13")){
            ft.replace(R.id.fgContenedor, new fragment13());
            ft.commit();
        }
        if (numHimno.equals("14")){
            ft.replace(R.id.fgContenedor, new fragment14());
            ft.commit();
        }
        if (numHimno.equals("15")){
            ft.replace(R.id.fgContenedor, new fragment15());
            ft.commit();
        }
        if (numHimno.equals("16")){
            ft.replace(R.id.fgContenedor, new fragment16());
            ft.commit();
        }
        if (numHimno.equals("17")){
            ft.replace(R.id.fgContenedor, new fragment17());
            ft.commit();
        }
        if (numHimno.equals("18")){
            ft.replace(R.id.fgContenedor, new fragment18());
            ft.commit();
        }
        if (numHimno.equals("19")){
            ft.replace(R.id.fgContenedor, new fragment19());
            ft.commit();
        }
        if (numHimno.equals("20")){
            ft.replace(R.id.fgContenedor, new fragment20());
            ft.commit();
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}