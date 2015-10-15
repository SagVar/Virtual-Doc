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


public class Eye extends ActionBarActivity {

    String conjunctivitis="conjunctivitis",scleritis="scleritis",cornealulcer="corneal ulcer",glaucoma="glaucoma",myopia="myopia",hypermetropia="hypermetropia",astigmatism="astigmatism",presbyopia="presbyopia",nightblindness="night blindness",hypertensiveretinopathy="hypertensive retinopathy",strabismus="strabismus";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};}
    int[] cj;{cj = new int[] {0,2,3,0,0,62,117,118,122,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] sl;{sl = new int[] {0,0,3,0,0,0,117,0,0,169,170,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] cul;{cul = new int[] {0,0,0,0,16,0,117,0,0,169,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] gm;{gm = new int[] {0,2,0,0,0,0,0,0,0,0,170,172,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] mp;{mp = new int[] {0,2,0,6,16,0,0,0,0,0,170,172,0,175,178,0,0,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] hm;{hm = new int[] {1,0,3,6,0,0,0,0,0,0,0,0,174,0,176,177,178,0,0,0,0,0,0,0,0,0,0,0,0};}
    int[] am;{am = new int[] {0,0,3,6,0,62,0,0,0,0,0,0,0,0,0,0,178,180,182,185,186,0,0,0,0,0,0,0,0};}
    int[] pb;{pb = new int[] {1,0,0,6,0,0,0,0,0,0,0,0,0,0,0,0,178,0,0,0,0,188,190,191,0,0,0,0,0};}
    int[] nb;{nb = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,192,0,0,0,218};}
    int[] hr;{hr = new int[] {1,0,0,6,16,0,0,0,0,0,170,0,0,0,0,0,0,0,0,0,0,0,0,0,0,195,196,0,0};}
    int[] sb;{sb = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,201,0};}
    int i=0,cc=0,cl=0,cu=0,cg=0,cm=0,ch=0,ca=0,cp=0,cn=0,cr=0,cs=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setPaintFlags(textView6.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }






    public void onEyeCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox12:
                if (checked) {
                    A[0] = 1;
                    Log.i("Hi1","hello");

                }
                break;
            case R.id.checkBox13:
                if (checked) {
                    A[1] = 2;
                    Log.i("Hi2","hello");

                }
                break;
            case R.id.checkBox14:
                if (checked) {
                    A[2] = 3;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox15:
                if (checked) {
                    A[3] = 6;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox16:
                if (checked) {
                    A[4] = 16;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox17:
                if (checked) {
                    A[5] = 62;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox18:
                if (checked) {
                    A[6] = 117;
                    Log.i("Hi7","hello");

                }
                break;
            case R.id.checkBox19:
                if (checked) {
                    A[7] = 118;
                    Log.i("Hi8","hello");

                }
                break;
            case R.id.checkBox20:
                if (checked) {
                    A[8] = 122;
                    Log.i("Hi9","hello");

                }
                break;
            case R.id.checkBox21:
                if (checked) {
                    A[9] = 169;
                    Log.i("Hi10","hello");

                }
                break;
            case R.id.checkBox11:
                if (checked) {
                    A[10] = 170;
                    Log.i("Hi11","hello");

                }
                break;
            case R.id.checkBox22:
                if (checked) {
                    A[11] = 172;
                    Log.i("Hi12","hello");

                }
                break;
            case R.id.checkBox23:
                if (checked) {
                    A[12] = 174;
                    Log.i("Hi13","hello");

                }
                break;

            case R.id.checkBox24:
                if (checked) {
                    A[13] = 175;
                    Log.i("Hi14","hello");

                }
                break;

            case R.id.checkBox25:
                if (checked) {
                    A[14] = 176;
                    Log.i("Hi15","hello");

                }
                break;

            case R.id.checkBox26:
                if (checked) {
                    A[15] = 177;
                    Log.i("Hi16","hello");

                }
                break;

            case R.id.checkBox27:
                if (checked) {
                    A[16] = 178;
                    Log.i("Hi17","hello");

                }
                break;

            case R.id.checkBox28:
                if (checked) {
                    A[17] = 180;
                    Log.i("Hi18","hello");

                }
                break;
            case R.id.checkBox29:
                if (checked) {
                    A[18] = 182;
                    Log.i("Hi19","hello");

                }
                break;
            case R.id.checkBox30:
                if (checked) {
                    A[19] = 185;
                    Log.i("Hi20","hello");

                }
                break;
            case R.id.checkBox31:
                if (checked) {
                    A[20] = 186;
                    Log.i("Hi21","hello");

                }
                break;
            case R.id.checkBox32:
                if (checked) {
                    A[21] = 188;
                    Log.i("Hi22","hello");

                }
                break;
            case R.id.checkBox33:
                if (checked) {
                    A[22] = 190;
                    Log.i("Hi23","hello");

                }
                break;
            case R.id.checkBox34:
                if (checked) {
                    A[23] = 191;
                    Log.i("Hi24","hello");

                }
                break;
            case R.id.checkBox35:
                if (checked) {
                    A[24] = 192;
                    Log.i("Hi25","hello");

                }
                break;
            case R.id.checkBox36:
                if (checked) {
                    A[25] = 195;
                    Log.i("Hi26","hello");

                }
                break;
            case R.id.checkBox37:
                if (checked) {
                    A[26] = 196;
                    Log.i("Hi27","hello");

                }
                break;
            case R.id.checkBox38:
                if (checked) {
                    A[27] = 201;
                    Log.i("Hi28","hello");

                }
                break;
            case R.id.checkBox39:
                if (checked) {
                    A[28] = 218;
                    Log.i("Hi29","hello");

                }
                break;

        }
        // Log.i("hello","hello");

    }


    public void onEyeButtonClicked(View v){
        for (int j = 0; j < 29; j++) {
            if (A[j] == cj[j]) {
                cc++;

            }
            if (A[j] == sl[j]) {
                cl++;
            }
            if (A[j] == cul[j]) {
                cu++;
            }
            if (A[j] == gm[j]) {
                cg++;
            }
            if (A[j] == mp[j]) {
                cm++;
            }
            if (A[j] == hm[j]) {
                ch++;
            }
            if (A[j] == am[j]) {
                ca++;
            }
            if (A[j] == pb[j]) {
                cp++;
            }
            if (A[j] == nb[j]) {
                cn++;
            }
            if (A[j] == hr[j]) {
                cr++;
            }
            if (A[j] == sb[j]) {
                cs++;
            }

            Log.i("hello",""+cc+"");
            Log.i("hello",""+cl+"");
            Log.i("hello",""+cu+"");
            Log.i("hello",""+cg+"");
            Log.i("hello",""+cm+"");
            Log.i("hello",""+ch+"");
            Log.i("hello",""+ca+"");
            Log.i("hello",""+cp+"");
            Log.i("hello",""+cn+"");
            Log.i("hello",""+cr+"");
            Log.i("hello",""+cs+"");

        }
       /* TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (cc >= cl && cc >= cu && cc>=cg && cc>=cm && cc>=ch && cc>=ca && cc>=cp && cc>=cn && cc>=cr && cc>=cs) {
            /*textView18.setText("conjunctivitis");
            Toast.makeText(getApplicationContext(),"conjunctivitis",Toast.LENGTH_SHORT).show()*/;
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",conjunctivitis);
            startActivity(i);
        }
        else if (cl >= cc && cl >= cu && cl>=cg && cl>=cm && cl>=ch && cl>=ca && cl>=cp && cl>=cn && cl>=cr && cl>=cs) {
            /*textView18.setText("scleritis");
            Toast.makeText(getApplicationContext(),"scleritis",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",scleritis);
            startActivity(i);
        }
        else if (cu >= cc && cu >= cl && cu>=cg && cu>=cm && cu>=ch && cu>=ca && cu>=cp && cu>=cn && cu>=cr && cu>=cs) {
            /*textView18.setText("corneal ulcer");
            Toast.makeText(getApplicationContext(),"corneal ulcer",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",cornealulcer);
            startActivity(i);
        }
        else if (cg >= cl && cg >= cu && cg>=cc && cg>=cm && cg>=ch && cg>=ca && cg>=cp && cg>=cg && cg>=cr && cg>=cs) {
            /*textView18.setText("glaucoma");
            Toast.makeText(getApplicationContext(),"glaucoma",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",glaucoma);
            startActivity(i);
        }
        else if (cm >= cl && cm >= cu && cm>=cg && cm>=cc && cm>=ch && cm>=ca && cm>=cp && cm>=cn && cm>=cr && cm>=cs) {
           /* textView18.setText("myopia");
            Toast.makeText(getApplicationContext(),"myopia",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",myopia);
            startActivity(i);
        }
        else if (ch >= cl && ch >= cu && ch>=cg && ch>=cm && ch>=cc && ch>=ca && ch>=cp && ch>=cn && ch>=cr && ch>=cs) {
           /* textView18.setText("hypermetropia");
            Toast.makeText(getApplicationContext(),"hypermetropia",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",hypermetropia);
            startActivity(i);
        }
        else if (ca >= cl && ca >= cu && ca>=cg && ca>=cm && ca>=ch && ca>=cc && ca>=cp && ca>=cn && ca>=cr && ca>=cs) {
            /*textView18.setText("astigmatism");
            Toast.makeText(getApplicationContext(),"astigmatism",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",astigmatism);
            startActivity(i);
        }
        else if (cp>= cl && cp >= cu && cp>=cg && cp>=cm && cp>=ch && cp>=ca && cp>=cc && cp>=cn && cp>=cr && cp>=cs) {
            /*textView18.setText("presbyopia");
            Toast.makeText(getApplicationContext(),"presbyopia",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",presbyopia);
            startActivity(i);
        }
        else if (cn >= cl && cn >= cu && cn>=cg && cn>=cm && cn>=ch && cn>=ca && cn>=cp && cn>=cc && cn>=cr && cn>=cs) {
           /* textView18.setText("night blindness");
            Toast.makeText(getApplicationContext(),"night blindness",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",nightblindness);
            startActivity(i);
        }
        else if (cr >= cl && cr >= cu && cr>=cg && cr>=cm && cr>=ch && cr>=ca && cr>=cp && cr>=cn && cr>=cc && cr>=cs) {
            /*textView18.setText("hypertensive retinopathy");
            Toast.makeText(getApplicationContext(),"hypertensive retinopathy",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",hypertensiveretinopathy);
            startActivity(i);
        }
        else if (cs >= cl && cs >= cu && cs>=cg && cs>=cm && cs>=ch && cs>=ca && cs>=cp && cs>=cn && cs>=cc && cs>=cr) {
            /*textView18.setText("strabismus");
            Toast.makeText(getApplicationContext(),"strabismus",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Eye.this,result.class);
            i.putExtra("Key",strabismus);
            startActivity(i);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_eye, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/
        switch (id) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

            //return super.onOptionsItemSelected(item);
        }
    }
}
