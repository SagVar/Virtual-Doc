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


public class Head extends ActionBarActivity {

    String hypertension="hypertension",anaemia="anaemia",dengue="dengue",epilepsy="epilepsy";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};}
    int[] ht;{ht = new int[] {1,0,0,0,0,0,0,0,0,0,0,0,0,85,0,0,96};}
    int[] an;{an = new int[] {1,0,0,6,9,16,0,23,0,0,0,0,0,0,93,94,96};}
    int[] dn;{dn = new int[] {1,2,4,6,0,16,18,0,0,0,0,0,0,85,0,0,0};}
    int[] ep;{ep = new int[] {0,0,0,0,0,0,0,0,53,54,55,56,57,0,0,0,0};}
    int i=0,ch=0,ca=0,cd=0,ce=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView9=(TextView)findViewById(R.id.textView9);
        textView9.setPaintFlags(textView9.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }

    public void onHeadCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox63:
                if (checked) {
                    A[0] = 1;
                    Log.i("Hi1","hello");

                }
                break;
            case R.id.checkBox64:
                if (checked) {
                    A[1] = 2;
                    Log.i("Hi2","hello");

                }
                break;
            case R.id.checkBox65:
                if (checked) {
                    A[2] = 4;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox66:
                if (checked) {
                    A[3] = 6;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox67:
                if (checked) {
                    A[4] = 9;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox68:
                if (checked) {
                    A[5] = 16;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox69:
                if (checked) {
                    A[6] = 18;
                    Log.i("Hi7","hello");

                }
                break;
            case R.id.checkBox70:
                if (checked) {
                    A[7] = 23;
                    Log.i("Hi8","hello");

                }
                break;
            case R.id.checkBox71:
                if (checked) {
                    A[8] = 53;
                    Log.i("Hi9","hello");

                }
                break;
            case R.id.checkBox72:
                if (checked) {
                    A[9] = 54;
                    Log.i("Hi10","hello");

                }
                break;
            case R.id.checkBox73:
                if (checked) {
                    A[10] = 55;
                    Log.i("Hi11","hello");

                }
                break;
            case R.id.checkBox74:
                if (checked) {
                    A[11] = 56;
                    Log.i("Hi12","hello");

                }
                break;
            case R.id.checkBox75:
                if (checked) {
                    A[12] = 57;
                    Log.i("Hi13","hello");

                }
                break;
            case R.id.checkBox76:
                if (checked) {
                    A[13] = 85;
                    Log.i("Hi14","hello");

                }
                break;
            case R.id.checkBox77:
                if (checked) {
                    A[14] = 93;
                    Log.i("Hi15","hello");

                }
                break;
            case R.id.checkBox78:
                if (checked) {
                    A[15] = 96;
                    Log.i("Hi16","hello");

                }
                break;
            case R.id.checkBox62:
                if (checked) {
                    A[16] = 96;
                    Log.i("Hi17","hello");

                }
                break;


        }
        // Log.i("hello","hello");

    }


    public void onHeadButtonClicked(View v){
        for (int j = 0; j < 17; j++) {
            if (A[j] == ht[j]) {
                ch++;

            }
            if (A[j] == an[j]) {
                ca++;
            }
            if (A[j] == dn[j]) {
                cd++;
            }
            if (A[j] == ep[j]) {
                ce++;
            }


            Log.i("hello",""+ch+"");
            Log.i("hello",""+ca+"");
            Log.i("hello",""+cd+"");
            Log.i("hello", "" + ce + "");

        }
        /*TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (ch>=ca && ch>=cd && ch>=ce) {
           /* textView18.setText("hypertension");
            Toast.makeText(getApplicationContext(),"hypertension",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Head.this,result.class);
            i.putExtra("Key",hypertension);
            startActivity(i);
        }
        else if (ca>=ch && ca>=cd && ca>=ce) {
            /*textView18.setText("anaemia");
            Toast.makeText(getApplicationContext(),"anaemia",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Head.this,result.class);
            i.putExtra("Key",anaemia);
            startActivity(i);
        }
        else if (cd>=ch && cd>=ca && ca>=ce) {
            /*textView18.setText("dengue");
            Toast.makeText(getApplicationContext(),"dengue",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Head.this,result.class);
            i.putExtra("Key",dengue);
            startActivity(i);
        }
        else if (ce>=ch && ce>=ca && ce>=ce && ce>=cd) {
            /*textView18.setText("epilepsy");
            Toast.makeText(getApplicationContext(), "epilepsy", Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Head.this,result.class);
            i.putExtra("Key",epilepsy);
            startActivity(i);
        }

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_head, menu);
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
