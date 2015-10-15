package com.example.sagar.virtualdoc;

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


public class Loweractivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loweractivity);
        setTitle(" Lower Region:");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.vd);
        Button button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Loweractivity.this,MainActivity.class);
                startActivity(i);
            }
    });
        TextView textView4=(TextView)findViewById(R.id.textView4);
        textView4.setPaintFlags(textView4.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }

    Button button;
    public void onLRadioButtonClicked(View v){
        boolean checked=((RadioButton) v).isChecked();
        switch(v.getId()){
            case R.id.radioButton17:
                if (checked)
                    button=(Button)findViewById(R.id.button7);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Loweractivity.this,Legs.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton18:
                if (checked)
                    button=(Button)findViewById(R.id.button7);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Loweractivity.this,Knee.class);
                        startActivity(i);
                    }
                });
                break;
            case R.id.radioButton20:
                if (checked)
                    button=(Button)findViewById(R.id.button7);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Loweractivity.this,GroinL.class);
                        startActivity(i);
                    }
                });
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loweractivity, menu);
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
