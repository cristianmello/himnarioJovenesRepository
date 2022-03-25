package com.example.himnariojovenes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.himnariojovenes.db.dbHelper;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList <himnos> listHimnos;
    DatabaseReference mRootReference = FirebaseDatabase.getInstance().getReference();
    String stringNumberHimno = "";
    ImageView btnNumber1;
    ImageView btnNumber2;
    ImageView btnNumber3;
    ImageView btnNumber4;
    ImageView btnNumber5;
    ImageView btnNumber6;
    ImageView btnNumber7;
    ImageView btnNumber8;
    ImageView btnNumber9;
    ImageView btnNumber0;
    ImageView btnDelete;
    ImageView btnSearch;
    ImageView imageNumber1;
    ImageView imageNumber2;
    ImageView imageNumber3;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menumain,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent intent = new Intent(this,himno.class);

        switch (item.getItemId()) {
            case R.id.itemhimno1:
                intent.putExtra("numeroHimno", "1");
                startActivity(intent);
                break;

            case R.id.itemhimno2:
                intent.putExtra("numeroHimno", "2");
                startActivity(intent);
                break;

            case R.id.itemhimno3:
                intent.putExtra("numeroHimno", "3");
                startActivity(intent);
                break;

            case R.id.itemhimno4:
                intent.putExtra("numeroHimno", "4");
                startActivity(intent);
                break;

            case R.id.itemhimno5:
                intent.putExtra("numeroHimno", "5");
                startActivity(intent);
                break;

            case R.id.itemhimno6:
                intent.putExtra("numeroHimno", "6");
                startActivity(intent);
                break;

            case R.id.itemhimno7:
                intent.putExtra("numeroHimno", "7");
                startActivity(intent);
                break;

            case R.id.itemhimno8:
                intent.putExtra("numeroHimno", "8");
                startActivity(intent);
                break;

            case R.id.itemhimno9:
                intent.putExtra("numeroHimno", "9");
                startActivity(intent);
                break;

            case R.id.itemhimno10:
                intent.putExtra("numeroHimno", "10");
                startActivity(intent);
                break;

            case R.id.itemhimno11:
                intent.putExtra("numeroHimno", "11");
                startActivity(intent);
                break;

            case R.id.itemhimno12:
                intent.putExtra("numeroHimno", "12");
                startActivity(intent);
                break;

            case R.id.itemhimno13:
                intent.putExtra("numeroHimno", "13");
                startActivity(intent);
                break;

            case R.id.itemhimno14:
                intent.putExtra("numeroHimno", "14");
                startActivity(intent);
                break;

            case R.id.itemhimno15:
                intent.putExtra("numeroHimno", "15");
                startActivity(intent);
                break;

            case R.id.itemhimno16:
                intent.putExtra("numeroHimno", "16");
                startActivity(intent);
                break;

            case R.id.itemhimno17:
                intent.putExtra("numeroHimno", "17");
                startActivity(intent);
                break;

            case R.id.itemhimno18:
                intent.putExtra("numeroHimno", "18");
                startActivity(intent);
                break;

            case R.id.itemhimno19:
                intent.putExtra("numeroHimno", "19");
                startActivity(intent);
                break;

            case R.id.itemhimno20:
                intent.putExtra("numeroHimno", "20");
                startActivity(intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dbHelper db = new dbHelper(this, "administrar", null, 1);
        SQLiteDatabase basedeDatos = db.getWritableDatabase();

        mRootReference.child("himnos").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    for(DataSnapshot ds: snapshot.getChildren()){
                        himnos himno = ds.getValue(himnos.class);

                        ContentValues registro = new ContentValues();
                        registro.put("number", himno.getNumber());
                        registro.put("name", himno.getName());
                        basedeDatos.insert("himnos", null, registro);

                    }
                    basedeDatos.close();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        btnNumber1 = (ImageView) findViewById(R.id.idImagen1);
        btnNumber1.setOnClickListener(this);
        btnNumber2 = (ImageView) findViewById(R.id.idImagen2);
        btnNumber2.setOnClickListener(this);
        btnNumber3 = (ImageView) findViewById(R.id.idImagen3);
        btnNumber3.setOnClickListener(this);
        btnNumber4 = (ImageView) findViewById(R.id.idImagen4);
        btnNumber4.setOnClickListener(this);
        btnNumber5 = (ImageView) findViewById(R.id.idImagen5);
        btnNumber5.setOnClickListener(this);
        btnNumber6 = (ImageView) findViewById(R.id.idImagen6);
        btnNumber6.setOnClickListener(this);
        btnNumber7 = (ImageView) findViewById(R.id.idImagen7);
        btnNumber7.setOnClickListener(this);
        btnNumber8 = (ImageView) findViewById(R.id.idImagen8);
        btnNumber8.setOnClickListener(this);
        btnNumber9 = (ImageView) findViewById(R.id.idImagen9);
        btnNumber9.setOnClickListener(this);
        btnNumber0 = (ImageView) findViewById(R.id.idImagen0);
        btnNumber0.setOnClickListener(this);
        btnDelete = (ImageView) findViewById(R.id.idImagenDelete);
        btnDelete.setOnClickListener(this);
        btnSearch = (ImageView) findViewById(R.id.idImagenSearch);
        btnSearch.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        imageNumber1 = (ImageView) findViewById(R.id.idImagenNumber1);
        imageNumber2 = (ImageView) findViewById(R.id.idImagenNumber2);
        imageNumber3 = (ImageView) findViewById(R.id.idImagenNumber3);


        if (view.getId() == R.id.idImagen1) {
            if (imageNumber1.getDrawable() == null) {
                imageNumber1.setImageResource(R.mipmap.numero1);
                stringNumberHimno += "1";
            } else if (imageNumber2.getDrawable() == null) {
                imageNumber2.setImageResource(R.mipmap.numero1);
                stringNumberHimno += "1";
            } else if (imageNumber3.getDrawable() == null) {
                imageNumber3.setImageResource(R.mipmap.numero1);
                stringNumberHimno += "1";
            }
        }

        if (view.getId() == R.id.idImagen2) {
            if (imageNumber1.getDrawable() == null) {
                imageNumber1.setImageResource(R.mipmap.numero2);
                stringNumberHimno += "2";
            } else if (imageNumber2.getDrawable() == null) {
                imageNumber2.setImageResource(R.mipmap.numero2);
                stringNumberHimno += "2";
            } else if (imageNumber3.getDrawable() == null) {
                imageNumber3.setImageResource(R.mipmap.numero2);
                stringNumberHimno += "2";
            }
        }
        if (view.getId() == R.id.idImagen3) {
            if (imageNumber1.getDrawable() == null) {
                imageNumber1.setImageResource(R.mipmap.numero3);
                stringNumberHimno += "3";
            } else if (imageNumber2.getDrawable() == null) {
                imageNumber2.setImageResource(R.mipmap.numero3);
                stringNumberHimno += "3";
            } else if (imageNumber3.getDrawable() == null) {
                imageNumber3.setImageResource(R.mipmap.numero3);
                stringNumberHimno += "3";
            }
        }

        if (view.getId() == R.id.idImagen4) {
            if (imageNumber1.getDrawable() == null) {
                imageNumber1.setImageResource(R.mipmap.numero4);
                stringNumberHimno += "4";
            } else if (imageNumber2.getDrawable() == null) {
                imageNumber2.setImageResource(R.mipmap.numero4);
                stringNumberHimno += "4";
            } else if (imageNumber3.getDrawable() == null) {
                imageNumber3.setImageResource(R.mipmap.numero4);
                stringNumberHimno += "4";
            }
        }
        if (view.getId() == R.id.idImagen5) {
            if (imageNumber1.getDrawable() == null) {
                imageNumber1.setImageResource(R.mipmap.numero5);
                stringNumberHimno += "5";
            } else if (imageNumber2.getDrawable() == null) {
                imageNumber2.setImageResource(R.mipmap.numero5);
                stringNumberHimno += "5";
            } else if (imageNumber3.getDrawable() == null) {
                imageNumber3.setImageResource(R.mipmap.numero5);
                stringNumberHimno += "5";
            }
        }
        if (view.getId() == R.id.idImagen6) {
            if (imageNumber1.getDrawable() == null) {
                imageNumber1.setImageResource(R.mipmap.numero6);
                stringNumberHimno += "6";
            } else if (imageNumber2.getDrawable() == null) {
                imageNumber2.setImageResource(R.mipmap.numero6);
                stringNumberHimno += "6";
            } else if (imageNumber3.getDrawable() == null) {
                imageNumber3.setImageResource(R.mipmap.numero6);
                stringNumberHimno += "6";
            }
        }
        if (view.getId() == R.id.idImagen7) {
            if (imageNumber1.getDrawable() == null) {
                imageNumber1.setImageResource(R.mipmap.numero7);
                stringNumberHimno += "7";
            } else if (imageNumber2.getDrawable() == null) {
                imageNumber2.setImageResource(R.mipmap.numero7);
                stringNumberHimno += "7";
            } else if (imageNumber3.getDrawable() == null) {
                imageNumber3.setImageResource(R.mipmap.numero7);
                stringNumberHimno += "7";
            }
        }
        if (view.getId() == R.id.idImagen8) {
            if (imageNumber1.getDrawable() == null) {
                imageNumber1.setImageResource(R.mipmap.numero8);
                stringNumberHimno += "8";
            } else if (imageNumber2.getDrawable() == null) {
                imageNumber2.setImageResource(R.mipmap.numero8);
                stringNumberHimno += "8";
            } else if (imageNumber3.getDrawable() == null) {
                imageNumber3.setImageResource(R.mipmap.numero8);
                stringNumberHimno += "8";
            }
        }
        if (view.getId() == R.id.idImagen9) {
            if (imageNumber1.getDrawable() == null) {
                imageNumber1.setImageResource(R.mipmap.numero9);
                stringNumberHimno += "9";
            } else if (imageNumber2.getDrawable() == null) {
                imageNumber2.setImageResource(R.mipmap.numero9);
                stringNumberHimno += "9";
            } else if (imageNumber3.getDrawable() == null) {
                imageNumber3.setImageResource(R.mipmap.numero9);
                stringNumberHimno += "9";
            }
        }
        if (view.getId() == R.id.idImagen0) {
            if (imageNumber1.getDrawable() != null) {
                if (imageNumber2.getDrawable() == null) {
                    imageNumber2.setImageResource(R.mipmap.numero0);
                    stringNumberHimno += "0";
                } else if (imageNumber3.getDrawable() == null) {
                    imageNumber3.setImageResource(R.mipmap.numero0);
                    stringNumberHimno += "0";
                }
            }
        }

        if (view.getId() == R.id.idImagenDelete) {
            imageNumber1.setImageDrawable(null);
            imageNumber2.setImageDrawable(null);
            imageNumber3.setImageDrawable(null);
            stringNumberHimno = "";
        }

        if (view.getId() == R.id.idImagenSearch) {
            Intent intent = new Intent(this,himno.class);
            intent.putExtra("numeroHimno", stringNumberHimno);
            startActivity(intent);
        }

    }

}