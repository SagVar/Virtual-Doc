package com.example.sagar.virtualdoc;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Upperactivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upperactivity);
        setTitle(" Upper Region :");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.vd);

        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Upperactivity.this,MainActivity.class);
                startActivity(i);
            }


    });
        TextView textView2=(TextView)findViewById(R.id.textView2);
        textView2.setPaintFlags(textView2.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }


    Button button;
    public void onURadioButtonClicked(View v){
        boolean checked=((RadioButton) v).isChecked();
        switch(v.getId()){
            case R.id.radioButton4:
                if (checked)
                    button=(Button)findViewById(R.id.button3);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Upperactivity.this,Eye.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton5:
                if (checked)
                    button=(Button)findViewById(R.id.button3);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Upperactivity.this,Ear.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton6:
                if (checked)
                    button=(Button)findViewById(R.id.button3);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Upperactivity.this,Nose.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton7:
                if (checked)
                    button=(Button)findViewById(R.id.button3);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Upperactivity.this,Mouth.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton8:
                if (checked)
                    button=(Button)findViewById(R.id.button3);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Upperactivity.this,Head.class);
                        startActivity(i);
                    }
                });
                break;

            }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_upperactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
