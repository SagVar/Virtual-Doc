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


public class GroinL extends ActionBarActivity {

    String hepatitisB="hepatitis B",hyperglycemia="hyperglycemia",kidneystone="kidney stone";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};}
    int[] hb;{hb = new int[] {1,4,5,6,7,0,16,0,36,49,58,59,0,0,0,0,0};}
    int[] hy;{hy = new int[] {1,0,0,6,0,0,0,32,0,0,0,0,60,61,62,0,0};}
    int[] ks;{ks = new int[] {0,4,0,6,0,11,16,0,0,49,0,0,60,0,0,101,102};}
    int i=0,ch=0,cy=0,ck=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groin_l);
        setTitle("Groin");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView20=(TextView)findViewById(R.id.textView20);
        textView20.setPaintFlags(textView20.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }



    public void onGroinCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox15:
                if (checked) {
                    A[0] = 1;
                    Log.i("Hi1","hello");

                }
                break;
            case R.id.checkBox16:
                if (checked) {
                    A[1] = 4;
                    Log.i("Hi2","hello");

                }
                break;
            case R.id.checkBox17:
                if (checked) {
                    A[2] = 5;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox18:
                if (checked) {
                    A[3] = 6;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox19:
                if (checked) {
                    A[4] = 7;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox20:
                if (checked) {
                    A[5] = 11;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox21:
                if (checked) {
                    A[6] = 16;
                    Log.i("Hi7","hello");

                }
                break;
            case R.id.checkBox22:
                if (checked) {
                    A[7] = 32;
                    Log.i("Hi8","hello");

                }
                break;
            case R.id.checkBox23:
                if (checked) {
                    A[8] = 36;
                    Log.i("Hi9","hello");

                }
                break;
            case R.id.checkBox24:
                if (checked) {
                    A[9] = 49;
                    Log.i("Hi10","hello");

                }
                break;
            case R.id.checkBox25:
                if (checked) {
                    A[10] = 58;
                    Log.i("Hi11","hello");

                }
                break;
            case R.id.checkBox26:
                if (checked) {
                    A[11] = 59;
                    Log.i("Hi12","hello");

                }
                break;
            case R.id.checkBox27:
                if (checked) {
                    A[12] = 60;
                    Log.i("Hi13","hello");

                }
                break;
            case R.id.checkBox28:
                if (checked) {
                    A[13] = 61;
                    Log.i("Hi14","hello");

                }
                break;
            case R.id.checkBox29:
                if (checked) {
                    A[14] = 62;
                    Log.i("Hi15","hello");

                }
                break;
            case R.id.checkBox30:
                if (checked) {
                    A[15] = 101;
                    Log.i("Hi16","hello");

                }
                break;
            case R.id.checkBox31:
                if (checked) {
                    A[16] = 102;
                    Log.i("Hi17","hello");

                }
                break;


        }
        // Log.i("hello","hello");

    }


    public void onGroinButtonClicked(View v){
        Log.i("hi","for loop");
        for (int j = 0; j < 17; j++) {
            if (A[j] == hb[j]) {
                ch++;

            }
            if (A[j] == hy[j]) {
                cy++;
            }
            if (A[j] == ks[j]) {
                ck++;
            }

            Log.i("hi",""+ch+"");
            Log.i("hi",""+cy+"");
            Log.i("hi", "" + ck + "");


        }
       /* TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (ch>=cy && ch>=ck) {
            Log.i("hi","if1");
            /*textView18.setText("hepatitis B");
            Toast.makeText(getApplicationContext(),"hepatitis B",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(GroinL.this,result.class);
            i.putExtra("Key",hepatitisB);
            startActivity(i);
        }
        if (cy>=ch && cy>=ck ) {
            Log.i("hi","if2");
            /*textView18.setText("hyperglycemia");
            Toast.makeText(getApplicationContext(),"hyperglycemia",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(GroinL.this,result.class);
            i.putExtra("Key",hyperglycemia);
            startActivity(i);
        }
        if (ck>=ch && ck>=cy){
            Log.i("hi","if3");
            /*textView18.setText("kidney stone");
            Toast.makeText(getApplicationContext(),"kidney stone", Toast.LENGTH_SHORT).show()*/;
            Intent i=new Intent(GroinL.this,result.class);
            i.putExtra("Key",kidneystone);
            startActivity(i);
        }

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_groin_l, menu);
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
        }
        //noinspection SimplifiableIfStatement

    }
}
