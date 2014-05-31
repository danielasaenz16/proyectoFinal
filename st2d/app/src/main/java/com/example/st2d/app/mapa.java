package com.example.st2d.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class mapa extends ActionBarActivity {
Button regresar;
    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        regresar=(Button)findViewById(R.id.button);
        salir=(Button)findViewById(R.id.button2);
       final EditText  ori=(EditText)findViewById(R.id.editText);
       final EditText  des=(EditText)findViewById(R.id.editText2);
        des.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View arg0, int arg2, KeyEvent keyEvent) {
                if (arg2 == KeyEvent.KEYCODE_ENTER){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    String uri = "geo:" + des.getText() + "?q=" + des.getText();

                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
                    return true;
                }

                return false;
            }
        });
        ori.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View arg0, int arg2, KeyEvent keyEvent) {
                if (arg2 == KeyEvent.KEYCODE_ENTER){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    String uri = "geo:" + ori.getText() + "?q=" + ori.getText();
                    intent.setData(Uri.parse(uri));

                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
                    return true;
                }

                return false;
            }
        });
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reg();
                sal();
            }
        });
    }

    private void sal() {
        Intent reg=new Intent(this,MainActivity.class);
        startActivityForResult(reg,0);
    }

    private void reg() {
        Intent reg=new Intent(this,Eleccion.class);
        startActivityForResult(reg,0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mapa, menu);
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
