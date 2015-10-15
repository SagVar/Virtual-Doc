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


public class Stomach extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stomach);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView13=(TextView)findViewById(R.id.textView13);
        textView13.setPaintFlags(textView13.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }




    String cholera="cholera",dehydration="dehydration",diarrhea="diarrhea",hepatitisB="hepatitis B",hypothyroidism="hypothyroidism",diabetesmellitus="diabetes mellitus",kidneystone="kidney stone",ulcers="ulcers",jaundice="jaundice",typhoid="typhoid",foodpoisoning="food poisoning",constipation="constipation";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};}
    int[] cho;{cho = new int[]{1,0,0,0,7,8,9,10,11,13,14,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] dy;{dy = new int[]{1,0,0,6,0,0,0,0,11,0,0,0,0,30,32,34,36,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] dr;{dr = new int[]{0,4,0,6,7,0,0,0,0,0,0,16,0,0,0,0,0,47,49,50,51,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] hb;{hb = new int[]{1,4,5,6,7,0,0,0,0,0,0,16,0,0,0,0,36,0,49,0,0,58,59,0,0,0,0,0,0,0,0,0,0,0};}
    int[] hp;{hp = new int[]{1,4,0,6,0,0,0,0,0,0,0,16,18,30,0,0,36,0,0,0,0,0,0,64,66,68,70,71,72,73,75,0,0,0};}
    int[] dm;{dm = new int[]{1,0,0,0,0,0,0,0,0,0,0,0,18,30,0,0,0,0,0,0,51,0,0,0,0,0,0,0,0,0,0,85,94,0};}
    int[] ks;{ks = new int[]{0,4,0,6,0,0,0,0,11,0,0,16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] ul;{ul = new int[]{0,0,0,6,0,0,0,0,0,0,0,16,0,0,0,0,0,0,49,0,51,0,0,0,0,0,0,0,0,0,0,0,0,137};}
    int[] jd;{jd = new int[]{1,4,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,51,58,59,0,0,0,0,0,0,0,0,0,0,0,137};}
    int[] ty;{ty = new int[]{1,4,5,6,7,0,0,0,0,0,0,16,0,0,0,0,36,0,0,0,0,0,0,0,0,0,0,0,0,0,0,85,0,0};}
    int[] fp;{fp = new int[]{0,4,0,6,7,0,0,0,0,0,0,16,0,0,0,0,0,0,49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] con;{con = new int[]{0,0,0,0,0,0,0,0,0,0,0,16,18,0,0,0,36,0,49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}

    int i=0,cc=0,cd=0,cr=0,ch=0,cp=0,cm=0,ck=0,cu=0,cj=0,ct=0,cf=0,cn=0;


        public void onStomachCheckboxClicked(View v) {

            boolean checked = ((CheckBox) v).isChecked();
            switch (v.getId()) {
                case R.id.checkBox26:
                    if (checked) {
                        A[0] = 1;
                        Log.i("Hi1","hello");

                    }
                    break;
                case R.id.checkBox27:
                    if (checked) {
                        A[1] = 4;
                        Log.i("Hi2","hello");

                    }
                    break;
                case R.id.checkBox28:
                    if (checked) {
                        A[2] = 5;
                        Log.i("Hi3","hello");

                    }
                    break;
                case R.id.checkBox29:
                    if (checked) {
                        A[3] = 6;
                        Log.i("Hi4","hello");

                    }
                    break;
                case R.id.checkBox30:
                    if (checked) {
                        A[4] = 7;
                        Log.i("Hi5","hello");

                    }
                    break;
                case R.id.checkBox31:
                    if (checked) {
                        A[5] = 8;
                        Log.i("Hi6","hello");

                    }
                    break;
                case R.id.checkBox32:
                    if (checked) {
                        A[6] = 9;
                        Log.i("Hi7","hello");

                    }
                    break;
                case R.id.checkBox33:
                    if (checked) {
                        A[7] = 10;
                        Log.i("Hi8","hello");

                    }
                    break;
                case R.id.checkBox34:
                    if (checked) {
                        A[8] = 11;
                        Log.i("Hi9","hello");

                    }
                    break;
                case R.id.checkBox35:
                    if (checked) {
                        A[9] = 13;
                        Log.i("Hi10","hello");

                    }
                    break;
                case R.id.checkBox36:
                    if (checked) {
                        A[10] = 14;
                        Log.i("Hi11","hello");

                    }
                    break;
                case R.id.checkBox37:
                    if (checked) {
                        A[11] = 16;
                        Log.i("Hi12","hello");

                    }
                    break;
                case R.id.checkBox38:
                    if (checked) {
                        A[12] = 18;
                        Log.i("Hi13","hello");

                    }
                    break;

                case R.id.checkBox39:
                    if (checked) {
                        A[13] = 30;
                        Log.i("Hi14","hello");

                    }
                    break;

                case R.id.checkBox40:
                    if (checked) {
                        A[14] = 32;
                        Log.i("Hi15","hello");

                    }
                    break;

                case R.id.checkBox41:
                    if (checked) {
                        A[15] = 34;
                        Log.i("Hi16","hello");

                    }
                    break;

                case R.id.checkBox42:
                    if (checked) {
                        A[16] = 36;
                        Log.i("Hi17","hello");

                    }
                    break;

                case R.id.checkBox43:
                    if (checked) {
                        A[17] = 47;
                        Log.i("Hi18","hello");

                    }
                    break;
                case R.id.checkBox44:
                    if (checked) {
                        A[18] = 49;
                        Log.i("Hi19","hello");

                    }
                    break;
                case R.id.checkBox45:
                    if (checked) {
                        A[19] = 50;
                        Log.i("Hi20","hello");

                    }
                    break;
                case R.id.checkBox46:
                    if (checked) {
                        A[20] = 51;
                        Log.i("Hi21","hello");

                    }
                    break;
                case R.id.checkBox47:
                    if (checked) {
                        A[21] = 58;
                        Log.i("Hi22","hello");

                    }
                    break;
                case R.id.checkBox48:
                    if (checked) {
                        A[22] = 59;
                        Log.i("Hi23","hello");

                    }
                    break;
                case R.id.checkBox49:
                    if (checked) {
                        A[23] = 64;
                        Log.i("Hi24","hello");

                    }
                    break;
                case R.id.checkBox50:
                    if (checked) {
                        A[24] = 66;
                        Log.i("Hi25","hello");

                    }
                    break;
                case R.id.checkBox51:
                    if (checked) {
                        A[25] = 68;
                        Log.i("Hi26","hello");

                    }
                    break;
                case R.id.checkBox52:
                    if (checked) {
                        A[26] = 70;
                        Log.i("Hi27","hello");

                    }
                    break;
                case R.id.checkBox53:
                    if (checked) {
                        A[27] = 71;
                        Log.i("Hi28","hello");

                    }
                    break;
                case R.id.checkBox54:
                    if (checked) {
                        A[28] = 72;
                        Log.i("Hi29","hello");

                    }
                    break;
                case R.id.checkBox55:
                    if (checked) {
                        A[29] = 73;
                        Log.i("Hi30","hello");

                    }
                    break;
                case R.id.checkBox56:
                    if (checked) {
                        A[30] = 75;
                        Log.i("Hi31","hello");

                    }
                    break;
                case R.id.checkBox57:
                    if (checked) {
                        A[31] = 85;
                        Log.i("Hi32","hello");

                    }
                    break;
                case R.id.checkBox58:
                    if (checked) {
                        A[32] = 94;
                        Log.i("Hi33","hello");

                    }
                    break;
                case R.id.checkBox59:
                    if (checked) {
                        A[33] = 137;
                        Log.i("Hi34","hello");

                    }
                    break;


            }
            // Log.i("hello","hello");

        }


    public void onStomachButtonClicked(View v){
        for (int j = 0; j < 34; j++) {
            if (A[j] == cho[j]) {
                cc++;

            }
            if (A[j] == dy[j]) {
                cd++;
            }
            if (A[j] == dr[j]) {
                cr++;
            }
            if (A[j] == hb[j]) {
                ch++;
            }
            if (A[j] == hp[j]) {
                cp++;
            }
            if (A[j] == dm[j]) {
                cm++;
            }
            if (A[j] == ks[j]) {
                ck++;
            }
            if (A[j] == ul[j]) {
                cu++;
            }
            if (A[j] == jd[j]) {
                cj++;
            }
            if (A[j] == ty[j]) {
                ct++;
            }
            if (A[j] == fp[j]) {
                cf++;
            }
            if (A[j] == con[j]) {
                cn++;
            }



        }
        /*TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (cc >= cd && cc >=cr && cc>=ch && cc>=cp && cc>=cm && cc>=ck && cc>=cu && cc>=cj && cc>=ct && cc>=cf && cc>=cn) {
            /*textView18.setText("cholera");
            Toast.makeText(getApplicationContext(),"cholera",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",cholera);
            startActivity(i);
        }
        if (cd >= cc && cd >= cr && cd>=ch && cd>=cp && cd>=cm && cd>=ck && cd>=cu && cd>=cj && cd>=ct && cd>=cf && cd>=cn) {
            /*textView18.setText("dehydration");
            Toast.makeText(getApplicationContext(),"dehydration",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",dehydration);
            startActivity(i);
        }
        if (cf >cd && cf > cr && cf>ch && cf>cp && cf>cm && cf>ck && cf>cu && cf>cj && cf>ct && cf>cc && cf>cn) {
            /*textView18.setText("food poisoning");
            Toast.makeText(getApplicationContext(),"food poisoning",Toast.LENGTH_SHORT).show();*/
            Intent i = new Intent(Stomach.this, result.class);
            i.putExtra("Key", foodpoisoning);
            startActivity(i);
        }
        if (cr >= cd && cr >= cc && cr>=ch && cr>=cp && cr>=cm && cr>=ck && cr>=cu && cr>=cj && cr>=ct && cr>=cf && cr>=cn) {
           /* textView18.setText("diarrhea");
            Toast.makeText(getApplicationContext(),"diarhhea",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",diarrhea);
            startActivity(i);
        }
        if (ch >= cd && ch >=cr && ch>=cc && ch>=cp && ch>=cm && ch>=ck && ch>=cu && ch>=cj && ch>=ct && ch>=cf && ch>=cn) {
            /*textView18.setText("hepatitis B");
            Toast.makeText(getApplicationContext(),"hepatitis B",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",hepatitisB);
            startActivity(i);
        }
        if (cp >=cd && cp >=cr && cp>=ch && cp>=cc && cp>=cm && cp>=ck && cp>=cu && cp>=cj && cp>=ct && cp>=cf && cp>=cn) {
            /*textView18.setText("hypothyroidism");
            Toast.makeText(getApplicationContext(),"hypothyroidism",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",hypothyroidism);
            startActivity(i);
        }
        if (cm>= cd && cm >=cr && cm>ch && cm>cp && cm>cc && cm>ck && cm>cu && cm>cj && cm>ct && cm>cf && cm>cn) {
            /*textView18.setText("diabetes mellitus");
            Toast.makeText(getApplicationContext(),"diabetes mellitus",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",diabetesmellitus);
            startActivity(i);
        }
        if (ck >= cd && ck >= cr && ck>ch && ck>cp && ck>cm && ck>cc && ck>cu && ck>cj && ck>ct && ck>cf && ck>cn) {
            /*textView18.setText("kidney stone");
            Toast.makeText(getApplicationContext(),"kidney stone", Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",kidneystone);
            startActivity(i);
        }
        if (cu > cd && cu > cr && cu>ch && cu>cp && cu>cm && cu>ck && cu>cc && cu>cj && cu>ct && cu>cf && cu>cn) {
           /* textView18.setText("ulcers");
            Toast.makeText(getApplicationContext(),"ulcers",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",ulcers);
            startActivity(i);
        }
        if (cj >cd && cj > cr && cj>ch && cj>cp && cj>cm && cj>ck && cj>cu && cj>cc && cj>ct && cj>cf && cj>cn) {
            /*textView18.setText("jaundice");
            Toast.makeText(getApplicationContext(),"jaundice",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",jaundice);
            startActivity(i);
        }
        if (ct >cd && ct > cr && ct>ch && ct>cp && ct>cm && ct>ck && ct>cu && ct>cj && ct>ct && ct>cf && ct>cn) {
            /*textView18.setText("typhoid");
            Toast.makeText(getApplicationContext(),"typhoid",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",typhoid);
            startActivity(i);
        }


        if (cn > cd && cn > cr && cn>ch && cn>cp && cn>cm && cn>ck && cn>cu && cn>cj && cn>ct && cn>cf && cn>cc) {
            /*textView18.setText("constipation");
            Toast.makeText(getApplicationContext(),"constipation",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Stomach.this,result.class);
            i.putExtra("Key",constipation);
            startActivity(i);
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stomach, menu);
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
