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


public class Nose extends ActionBarActivity {

    String acutebronchitis="acute bronchitis",flu="flu";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};}
    int[] ab;{ab = new int[] {0,2,4,0,0,16,18,0,0,28,0,0,214,0};}
    int[] fl;{fl = new int[] {1,2,4,6,7,16,0,0,26,28,49,51,0,217};}
    int i=0,ca=0,cf=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView7=(TextView)findViewById(R.id.textView7);
        textView7.setPaintFlags(textView7.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }

    public void onNoseCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox41:
                if (checked) {
                    A[0] = 1;
                    Log.i("Hi1", "hello");

                }
                break;
            case R.id.checkBox42:
                if (checked) {
                    A[1] = 2;
                    Log.i("Hi2","hello");

                }
                break;
            case R.id.checkBox43:
                if (checked) {
                    A[2] = 4;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox44:
                if (checked) {
                    A[3] = 6;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox45:
                if (checked) {
                    A[4] = 7;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox46:
                if (checked) {
                    A[5] = 16;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox47:
                if (checked) {
                    A[6] = 18;
                    Log.i("Hi7","hello");

                }
                break;
            case R.id.checkBox48:
                if (checked) {
                    A[7] = 23;
                    Log.i("Hi8","hello");

                }
                break;
            case R.id.checkBox49:
                if (checked) {
                    A[8] = 26;
                    Log.i("Hi9","hello");

                }
                break;
            case R.id.checkBox50:
                if (checked) {
                    A[9] = 28;
                    Log.i("Hi10","hello");

                }
                break;
            case R.id.checkBox51:
                if (checked) {
                    A[10] = 49;
                    Log.i("Hi11","hello");

                }
                break;
            case R.id.checkBox52:
                if (checked) {
                    A[11] = 51;
                    Log.i("Hi12","hello");

                }
                break;
            case R.id.checkBox53:
                if (checked) {
                    A[12] = 214;
                    Log.i("Hi13","hello");

                }
                break;
            case R.id.checkBox54:
                if (checked) {
                    A[13] = 217;
                    Log.i("Hi14","hello");

                }
                break;


        }
        // Log.i("hello","hello");

    }


    public void onNoseButtonClicked(View v){
        for (int j = 0; j < 14; j++) {
            if (A[j] == ab[j]) {
                ca++;

            }
            if (A[j] == fl[j]) {
                cf++;
            }

            Log.i("hello",""+ca+"");
            Log.i("hello",""+cf+"");

        }

        if (ca>=cf) {
            /*textView18.setText("acute bronchitis");
            Toast.makeText(getApplicationContext(), "acute bronchitis", Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Nose.this,result.class);
            i.putExtra("Key",acutebronchitis);
            startActivity(i);
        }
        else if (cf>=ca) {
            /*textView18.setText("flu");
            Toast.makeText(getApplicationContext(),"flu",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Nose.this,result.class);
            i.putExtra("Key",flu);
            startActivity(i);
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nose, menu);
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
