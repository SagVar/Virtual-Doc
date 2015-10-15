package com.example.sagar.virtualdoc;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class middleactivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middleactivity);
        setTitle(" Middle Region:");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.vd);
        Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(middleactivity.this,MainActivity.class);
                startActivity(i);
            }
    });
        TextView textView3=(TextView)findViewById(R.id.textView3);
        textView3.setPaintFlags(textView3.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);
    }

    Button button;
    public void onMRadioButtonClicked(View v){
        boolean checked=((RadioButton) v).isChecked();
        switch(v.getId()){
            case R.id.radioButton10:
                if (checked)
                    button=(Button)findViewById(R.id.button5);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(middleactivity.this,Hands.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton11:
                if (checked)
                    button=(Button)findViewById(R.id.button5);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(middleactivity.this,Chest.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton12:
                if (checked)
                    button=(Button)findViewById(R.id.button5);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(middleactivity.this,Stomach.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton13:
                if (checked)
                    button=(Button)findViewById(R.id.button5);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(middleactivity.this,Back.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton14:
                if (checked)
                    button=(Button)findViewById(R.id.button5);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(middleactivity.this,Skin.class);
                        startActivity(i);
                    }
                });
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_middleactivity, menu);
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
