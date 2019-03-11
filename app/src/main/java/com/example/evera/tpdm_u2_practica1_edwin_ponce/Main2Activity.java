package com.example.evera.tpdm_u2_practica1_edwin_ponce;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText descripcion,ubicacion,fecha,presupuesto;
    Button insertar,cerrar;
    Civil base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        base = new Civil(this,"Civil",null,1);
        descripcion = findViewById(R.id.descripcion);
        ubicacion = findViewById(R.id.ubicacion);
        fecha = findViewById(R.id.fehca);
        presupuesto = findViewById(R.id.fehca);

        insertar = findViewById(R.id.insertar);
        cerrar = findViewById(R.id.cerrar);

        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertar();
            }
        });

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void insertar(){
        try{
            SQLiteDatabase insert = base.getWritableDatabase();
            String SQL = "INSERT INTO PROYECTOS VALUES(NULL,'%1','%2','%3','%4')";

            SQL = SQL.replace("%1",descripcion.getText().toString());
            SQL = SQL.replace("%2",ubicacion.getText().toString());
            SQL = SQL.replace("%3",fecha.getText().toString());
            SQL = SQL.replace("%4",presupuesto.getText().toString());

            insert.execSQL(SQL);
            insert.close();
            descripcion.setText("");
            ubicacion.setText("");
            fecha.setText("");
            presupuesto.setText("");

        }catch (SQLiteException e){
            mensaje("ERROR DE INSERCION",e.getMessage());
        }
    }


    private void mensaje(String Titulo,String Mensaje){
        AlertDialog.Builder a = new AlertDialog.Builder(Main2Activity.this);
            a.setTitle(Titulo)
                    .setMessage(Mensaje)
                    .setPositiveButton("Aceptar",null)
                    .show();
    }

}
