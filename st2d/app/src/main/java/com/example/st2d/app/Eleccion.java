package com.example.st2d.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Eleccion extends ActionBarActivity {
Button caminando;
Button automovil;
Button camion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleccion);
        caminando=(Button)findViewById(R.id.button);
        automovil=(Button)findViewById(R.id.button2);
        camion=(Button)findViewById(R.id.button3);
        caminando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uno();
                dos();
                tres();
            }
        });


    }

    private void tres() {
        Intent tres = new Intent(this,mapa.class);
        startActivityForResult(tres,0);
    }

    private void dos() {
        Intent dos= new Intent(this,mapa.class);
        startActivityForResult(dos,0);
    }

    private void uno() {
        Intent uno = new Intent(this,mapa.class);
        startActivityForResult(uno,0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.eleccion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
