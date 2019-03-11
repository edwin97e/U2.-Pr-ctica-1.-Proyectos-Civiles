package com.example.evera.tpdm_u2_practica1_edwin_ponce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewcivil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewcivil =  findViewById(R.id.listviewcivil);
        ArrayList<String>
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.crear:
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.actualizar:
                Intent intent2 = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent2);
                break;
            case R.id.eliminar:
                Intent intent3 = new Intent(MainActivity.this,Main5Activity.class);
                startActivity(intent3);
                break;
            case R.id.consultar:
                Intent intent4 = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
