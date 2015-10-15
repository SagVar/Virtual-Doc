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


public class Ear extends ActionBarActivity {

    String boils="boils",outerearcancer="outer ear cancer",canceroftheauditorycanal="cancer of the auditory canal",menieresdisease="meniere's disease";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,};}
    int[] bl;{bl = new int[] {0,16,0,220,222,223,0,0,0,0,0};}
    int[] oc;{oc = new int[] {1,0,18,0,0,0,0,0,0,0,0};}
    int[] cac;{cac = new int[] {0,16,0,0,222,0,227,228,0,0,0};}
    int[] md;{md = new int[] {1,16,18,0,0,0,227,0,231,232,233};}
    int i=0,cb=0,co=0,ca=0,cm=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView5=(TextView)findViewById(R.id.textView5);
        textView5.setPaintFlags(textView5.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }



    public void onEarCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox:
                if (checked) {
                    A[0] = 1;
                    Log.i("Hi1", "hello");

                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    A[1] = 16;
                    Log.i("Hi2","hello");

                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    A[2] = 18;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox4:
                if (checked) {
                    A[3] = 220;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox5:
                if (checked) {
                    A[4] = 222;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox6:
                if (checked) {
                    A[5] = 223;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox7:
                if (checked) {
                    A[6] = 227;
                    Log.i("Hi7","hello");

                }
                break;
            case R.id.checkBox8:
                if (checked) {
                    A[7] = 228;
                    Log.i("Hi8","hello");

                }
                break;
            case R.id.checkBox9:
                if (checked) {
                    A[8] = 231;
                    Log.i("Hi9","hello");

                }
                break;
            case R.id.checkBox10:
                if (checked) {
                    A[9] = 232;
                    Log.i("Hi10","hello");

                }
                break;
            case R.id.checkBox11:
                if (checked) {
                    A[10] = 233;
                    Log.i("Hi11","hello");

                }
                break;

        }
        // Log.i("hello","hello");

    }


    public void onEarButtonClicked(View v){
        for (int j = 0; j < 11; j++) {
            if (A[j] == bl[j]) {
                cb++;
            }
            if (A[j] == oc[j]) {
                co++;
            }
            if (A[j] == cac[j]) {
                ca++;
            }
            if (A[j] == md[j]) {
                cm++;
            }

            Log.i("hello",""+cb+"");
            Log.i("hello",""+co+"");
            Log.i("hello",""+ca+"");
            Log.i("hello",""+cm+"");

        }
        /*TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (cb>=co && cb>=ca && cb>=cm) {
            /*textView18.setText("boils");
            Toast.makeText(getApplicationContext(), "boils", Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Ear.this,result.class);
            i.putExtra("Key",boils);
            startActivity(i);
        }
        else if (co>=cb && co>=ca && co>=cm) {
           /* textView18.setText("outer ear cancer");
            Toast.makeText(getApplicationContext(),"outer ear cancer",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Ear.this,result.class);
            i.putExtra("Key",outerearcancer);
            startActivity(i);
        }
        else if (ca>=co && ca>=cb && ca>=cm) {
            /*textView18.setText("cancer of the auditory canal");
            Toast.makeText(getApplicationContext(),"cancer of the auditory canal",Toast.LENGTH_SHORT).show()*/;
            Intent i=new Intent(Ear.this,result.class);
            i.putExtra("Key",canceroftheauditorycanal);
            startActivity(i);
        }
        if (cm>=co && cm>=ca && cm>=cb) {
            /*textView18.setText("meniere's disease");
            Toast.makeText(getApplicationContext(),"meniere's disease",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Ear.this,result.class);
            i.putExtra("Key",menieresdisease);
            startActivity(i);
        }

    }










    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ear, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        /*if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    }
}
