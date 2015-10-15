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


public class Skin extends ActionBarActivity {

    String chickenpox="chickenpox",cholera="cholera",hypothyroidism="hypothyroidism",ostemyelitis="ostemyelitis",ringworm="ringworm",jaundice="jaundice",lupus="lupus",ezcema="ezcema";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};}
    int[] cpox;{cpox = new int[] {1,2,3,4,5,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] cho;{cho = new int[] {1,0,0,0,0,0,7,8,9,10,11,13,14,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] hp;{hp = new int[] {1,0,3,4,0,6,0,0,0,0,0,0,0,16,18,30,36,64,66,68,70,71,72,73,75,0,0,0,0,0};}
    int[] os;{os = new int[] {1,0,3,4,0,6,0,0,0,0,0,0,0,0,18,0,0,0,0,0,0,0,0,0,0,0,109,0,0,0};}
    int[] rw;{rw = new int[] {0,2,3,0,0,0,0,0,0,0,0,0,0,0,18,0,0,0,0,0,0,0,0,0,0,0,0,129,130,0};}
    int[] jd;{jd = new int[] {1,0,3,4,5,0,0,0,0,0,0,0,0,0,0,0,0,64,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] ls;{ls = new int[] {1,2,0,4,0,6,0,0,0,0,0,0,0,16,18,30,0,0,0,0,0,0,0,73,0,0,0,0,0,217};}
    int[] ez;{ez = new int[] {1,2,3,0,0,0,0,0,0,0,0,0,0,0,0,30,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int i=0,cc=0,ch=0,cp=0,cr=0,cj=0,co=0,cl=0,ce=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView15=(TextView)findViewById(R.id.textView15);
        textView15.setPaintFlags(textView15.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }

    public void onSkinCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox68:
                if (checked) {
                    A[0] = 1;
                    Log.i("Hi1", "hello");

                }
                break;
            case R.id.checkBox69:
                if (checked) {
                    A[1] = 2;
                    Log.i("Hi2","hello");

                }
                break;
            case R.id.checkBox70:
                if (checked) {
                    A[2] = 3;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox71:
                if (checked) {
                    A[3] = 4;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox72:
                if (checked) {
                    A[4] = 5;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox73:
                if (checked) {
                    A[5] = 6;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox74:
                if (checked) {
                    A[6] = 7;
                    Log.i("Hi7","hello");

                }
                break;
            case R.id.checkBox75:
                if (checked) {
                    A[7] = 8;
                    Log.i("Hi8","hello");

                }
                break;
            case R.id.checkBox76:
                if (checked) {
                    A[8] = 9;
                    Log.i("Hi9","hello");

                }
                break;
            case R.id.checkBox77:
                if (checked) {
                    A[9] = 10;
                    Log.i("Hi10","hello");

                }
                break;
            case R.id.checkBox78:
                if (checked) {
                    A[10] = 11;
                    Log.i("Hi11","hello");

                }
                break;
            case R.id.checkBox79:
                if (checked) {
                    A[11] = 13;
                    Log.i("Hi12","hello");

                }
                break;
            case R.id.checkBox80:
                if (checked) {
                    A[12] = 14;
                    Log.i("Hi13","hello");

                }
                break;

            case R.id.checkBox81:
                if (checked) {
                    A[13] = 16;
                    Log.i("Hi14","hello");

                }
                break;

            case R.id.checkBox82:
                if (checked) {
                    A[14] = 18;
                    Log.i("Hi15","hello");

                }
                break;

            case R.id.checkBox83:
                if (checked) {
                    A[15] = 30;
                    Log.i("Hi16","hello");

                }
                break;

            case R.id.checkBox84:
                if (checked) {
                    A[16] = 36;
                    Log.i("Hi17","hello");

                }
                break;

            case R.id.checkBox85:
                if (checked) {
                    A[17] = 64;
                    Log.i("Hi18","hello");

                }
                break;
            case R.id.checkBox86:
                if (checked) {
                    A[18] = 66;
                    Log.i("Hi19","hello");

                }
                break;
            case R.id.checkBox87:
                if (checked) {
                    A[19] = 68;
                    Log.i("Hi20","hello");

                }
                break;
            case R.id.checkBox88:
                if (checked) {
                    A[20] = 70;
                    Log.i("Hi21","hello");

                }
                break;
            case R.id.checkBox89:
                if (checked) {
                    A[21] = 71;
                    Log.i("Hi22","hello");

                }
                break;
            case R.id.checkBox90:
                if (checked) {
                    A[22] = 72;
                    Log.i("Hi23","hello");

                }
                break;
            case R.id.checkBox91:
                if (checked) {
                    A[23] = 73;
                    Log.i("Hi24","hello");

                }
                break;
            case R.id.checkBox92:
                if (checked) {
                    A[24] = 75;
                    Log.i("Hi25","hello");

                }
                break;
            case R.id.checkBox93:
                if (checked) {
                    A[25] = 94;
                    Log.i("Hi26","hello");

                }
                break;
            case R.id.checkBox94:
                if (checked) {
                    A[26] = 109;
                    Log.i("Hi27","hello");

                }
                break;
            case R.id.checkBox95:
                if (checked) {
                    A[27] = 129;
                    Log.i("Hi28","hello");

                }
                break;
            case R.id.checkBox96:
                if (checked) {
                    A[28] = 130;
                    Log.i("Hi29","hello");

                }
                break;
            case R.id.checkBox97:
                if (checked) {
                    A[29] = 217;
                    Log.i("Hi30","hello");

                }
                break;
        }
        // Log.i("hello","hello");

    }


    public void onSkinButtonClicked(View v){
        for (int j = 0; j < 30; j++) {
            if (A[j] == cpox[j]) {
                cc++;

            }
            if (A[j] == cho[j]) {
                ch++;
            }
            if (A[j] == hp[j]) {
                cp++;
            }
            if (A[j] == os[j]) {
                co++;
            }
            if (A[j] == rw[j]) {
                cr++;
            }
            if (A[j] == jd[j]) {
                cj++;
            }
            if (A[j] == ls[j]) {
                cl++;
            }
            if (A[j] == ez[j]) {
                ce++;
            }

            Log.i("hello",""+cc+"");
            Log.i("hello",""+ch+"");
            Log.i("hello",""+cp+"");
            Log.i("hello",""+co+"");
            Log.i("hello",""+cr+"");
            Log.i("hello",""+cj+"");
            Log.i("hello",""+cl+"");
            Log.i("hello",""+ce+"");

        }
       /* TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (cc >= ch && cc >= cp && cc>=co && cc>=cr && cc>=cj && cc>=cl && cc>=ce) {
            /*textView18.setText("chicken pox");
            Toast.makeText(getApplicationContext(), "chicken pox", Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Skin.this,result.class);
            i.putExtra("Key",chickenpox);
            startActivity(i);
        }
        else if (ch >= cc && ch >= cp && ch>=co && ch>=cr && ch>=cj && ch>=cl && ch>=ce) {
            /*textView18.setText("cholera");
            Toast.makeText(getApplicationContext(),"cholera",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Skin.this,result.class);
            i.putExtra("Key",cholera);
            startActivity(i);
        }
        else if (cp >= cc && cp >= ch && cp>=co && cp>=cr && cp>=cj && cp>=cl && cp>=ce) {
            /*textView18.setText("hypothyroidism");
            Toast.makeText(getApplicationContext(),"hypothyroidism",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Skin.this,result.class);
            i.putExtra("Key",hypothyroidism);
            startActivity(i);
        }
        else if (co >= cc && co >= cp && co>=ch && co>=cr && co>=cj && co>=cl && co>=ce) {
            /*textView18.setText("ostemyelitis");
            Toast.makeText(getApplicationContext(),"ostemyelitis",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Skin.this,result.class);
            i.putExtra("Key",ostemyelitis);
            startActivity(i);
        }
        else if (cr >= cc && cr >= cp && cr>=co && cr>=ch && cr>=cj && cr>=cl && cr>=ce) {
            /*textView18.setText("ringworm");
            Toast.makeText(getApplicationContext(),"ringworm",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Skin.this,result.class);
            i.putExtra("Key",ringworm);
            startActivity(i);
        }
        else if (cj >= cc && cj >= cp && cj>=co && cj>=cr && cj>=ch && cj>=cl && cj>=ce) {
            /*textView18.setText("jaundice");
            Toast.makeText(getApplicationContext(),"jaundice",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Skin.this,result.class);
            i.putExtra("Key",jaundice);
            startActivity(i);
        }
        else if (cl >= cc && cl >= cp && cl>=co && cl>=cr && cl>=cj && cl>=ch && cl>=ce) {
            /*textView18.setText("lupus");
            Toast.makeText(getApplicationContext(),"lupus",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Skin.this,result.class);
            i.putExtra("Key",lupus);
            startActivity(i);
        }
        else if (ce >= cc && ce >= cp && ce>=co && ce>=cr && ce>=cj && ce>=cl && ce>=ch) {
            /*textView18.setText("ezcema");
            Toast.makeText(getApplicationContext(),"ezcema",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Skin.this,result.class);
            i.putExtra("Key",ezcema);
            startActivity(i);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_skin, menu);
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
