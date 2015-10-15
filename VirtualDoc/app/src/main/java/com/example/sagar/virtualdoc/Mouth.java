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
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class Mouth extends ActionBarActivity {

    String throatinfection="throat infection";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1};}
    int[] ti;{ti = new int[] {1,4,6,16,18,19,26,28};}
    int i=0,ct=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouth);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView8=(TextView)findViewById(R.id.textView8);
        textView8.setPaintFlags(textView8.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }

    public void onMouthCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    A[0] = 1;
                    Log.i("Hi1","hello");

                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    A[1] = 4;
                    Log.i("Hi2","hello");

                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    A[2] = 6;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox4:
                if (checked) {
                    A[3] = 16;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox5:
                if (checked) {
                    A[4] = 18;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox6:
                if (checked) {
                    A[5] = 19;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox7:
                if (checked) {
                    A[6] = 26;
                    Log.i("Hi7","hello");

                }
                break;
            case R.id.checkBox8:
                if (checked) {
                    A[7] = 28;
                    Log.i("Hi8","hello");

                }
                break;


        }
        // Log.i("hello","hello");

    }


    public void onMouthButtonClicked(View v){
        for (int j = 0; j < 8; j++) {
            if (A[j] == ti[j]) {
                ct++;

            }
            Log.i("hello",""+ct+"");

        }
        /*TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (true) {
           /* textView18.setText("throat infection");
            Toast.makeText(getApplicationContext(),"throat infection",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Mouth.this,result.class);
            i.putExtra("Key",throatinfection);
            startActivity(i);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mouth, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }        //noinspection SimplifiableIfStatement

    }
}
