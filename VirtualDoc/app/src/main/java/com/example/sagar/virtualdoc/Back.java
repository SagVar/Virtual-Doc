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


public class Back extends ActionBarActivity {

    String osteoporosis="osteoporosis",sprain="sprain";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1};}
    int[] ot;{ot = new int[] {16,0,110,111,112,114,0,0};}
    int[] sp;{sp = new int[] {16,18,0,0,0,0,159,161};}
    int i=0,co=0,cs=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView14=(TextView)findViewById(R.id.textView14);
        textView14.setPaintFlags(textView14.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }



    public void onBackCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox60:
                if (checked) {
                    A[0] = 16;
                    Log.i("Hi1","hello");

                }
                break;
            case R.id.checkBox61:
                if (checked) {
                    A[1] = 18;
                    Log.i("Hi2","hello");

                }
                break;
            case R.id.checkBox62:
                if (checked) {
                    A[2] = 110;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox63:
                if (checked) {
                    A[3] =111;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox64:
                if (checked) {
                    A[4] = 112;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox65:
                if (checked) {
                    A[5] = 114;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox66:
                if (checked) {
                    A[6] = 159;
                    Log.i("Hi7","hello");

                }
                break;
            case R.id.checkBox67:
                if (checked) {
                    A[7] = 161;
                    Log.i("Hi8","hello");

                }
                break;

        }
        // Log.i("hello","hello");

    }


    public void onBackButtonClicked(View v){
        Log.i("Hi","for");
        for (int j = 0; j < 8; j++) {
            if (A[j] == ot[j]) {
                co++;
                Log.i("Hi","ot");

            }
            if (A[j] == sp[j]) {
                cs++;
                Log.i("Hi","sp");
            }



            /*Log.i("hello",""+co+"");
            Log.i("hello", "" + cs + "");*/
        }
        /*TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (co>=cs ) {
            Log.i("Hi","if1");
            /*textView18.setText("osteoporosis");
            Toast.makeText(getApplicationContext(), "osteoporosis", Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Back.this,result.class);
            i.putExtra("Key",osteoporosis);
            startActivity(i);
        }
        else if (cs>co) {
            Log.i("Hi","if2");
           /* textView18.setText("sprain");
            Toast.makeText(getApplicationContext(),"sprain",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Back.this,result.class);
            i.putExtra("Key",sprain);
            startActivity(i);
        }

    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_back, menu);
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
