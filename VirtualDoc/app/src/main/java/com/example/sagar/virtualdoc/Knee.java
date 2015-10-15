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


public class Knee extends ActionBarActivity {

    String arthiritis="arthritis",fracture="fracture",sprain="sprain";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1};}
    int[] ar;{ar = new int[] {1,2,16,18,20,0,0};}
    int[] fr;{fr = new int[] {0,0,16,18,0,159,161};}
    int[] sp;{sp = new int[] {0,0,16,18,0,0,161};}
    int i=0,cs=0,ca=0,cf=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knee);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView18=(TextView)findViewById(R.id.textView18);
        textView18.setPaintFlags(textView18.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }



    public void onKneeCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox8:
                if (checked) {
                    A[0] = 1;
                    Log.i("Hi1", "hello");

                }
                break;
            case R.id.checkBox9:
                if (checked) {
                    A[1] = 2;
                    Log.i("Hi2","hello");

                }
                break;
            case R.id.checkBox10:
                if (checked) {
                    A[2] = 16;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox11:
                if (checked) {
                    A[3] = 18;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox12:
                if (checked) {
                    A[4] = 20;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox13:
                if (checked) {
                    A[5] = 159;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox14:
                if (checked) {
                    A[6] = 161;
                    Log.i("Hi7","hello");

                }
                break;

        }
        // Log.i("hello","hello");

    }


    public void onKneeButtonClicked(View v){
        for (int j = 0; j < 7; j++) {
            if (A[j] == ar[j]) {
                ca++;

            }
            if (A[j] == fr[j]) {
                cf++;
            }
            if (A[j] == sp[j]) {
                cs++;
            }

            Log.i("hello",""+ca+"");
            Log.i("hello",""+cf+"");
            Log.i("hello",""+cs+"");

        }
       /* TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (ca>=cf && ca>=cs) {
            /*textView18.setText("arthiritis");
            Toast.makeText(getApplicationContext(), "arthiritis", Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Knee.this,result.class);
            i.putExtra("Key",arthiritis);
            startActivity(i);
        }
        else if (cs>=cf && cs>=ca) {
            /*textView18.setText("sprain");
            Toast.makeText(getApplicationContext(),"sprain",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Knee.this,result.class);
            i.putExtra("Key",sprain);
            startActivity(i);
        }
        else if (cf>=ca && cf>=cs) {
           /* textView18.setText("fracture");
            Toast.makeText(getApplicationContext(),"fracture",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Knee.this,result.class);
            i.putExtra("Key",fracture);
            startActivity(i);
        }


    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_knee, menu);
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
