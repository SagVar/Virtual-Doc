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


public class Chest extends ActionBarActivity {

    String asthma="asthma",acutebronchitis="acute bronchitis",pneumonia="pneumonia",tuberculosis="tuberculosis",asbestosis="asbestosis",byssinosis="byssinosis",silicosis="silicosis",sarcoidosis="sarcoidosis",pertussis="pertussis",mesothelioma="mesithelioma";
    int[] A;{A = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};}
    int[] as;{as = new int[] {0,0,0,0,6,16,0,21,22,23,26,28,0,0,0,0,0,0};}
    int[] ab;{ab = new int[] {0,0,4,0,0,16,18,21,0,23,26,28,0,0,0,0,0,0};}
    int[] pn;{pn = new int[] {1,0,4,5,6,16,0,0,0,23,26,0,30,0,53,104,0,0};}
    int[] tb;{tb = new int[] {1,0,4,5,0,16,0,21,0,0,26,0,0,0,0,104,0,0};}
    int[] sa;{sa = new int[] {0,0,0,5,0,16,0,0,22,23,26,0,0,0,0,0,0,0};}
    int[] by;{by = new int[] {0,0,0,0,0,0,0,21,0,23,26,0,0,0,0,0,205,0};}
    int[] sl;{sl = new int[] {1,2,4,0,0,16,18,0,0,23,26,0,0,0,0,0,0,0};}
    int[] pu;{pu = new int[] {0,0,4,0,0,0,0,0,22,0,0,28,0,51,53,0,0,214};}
    int[] sr;{sr= new int[] {1,2,4,0,0,0,18,0,0,23,0,0,0,0,0,0,205,0};}
    int[] me;{me= new int[] {0,0,4,0,0,16,18,0,0,23,26,0,0,51,0,0,0,214};}

    int i=0,ca=0,cb=0,cp=0,ct=0,cs=0,cy=0,cl=0,cr=0,cu=0,cm=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView12=(TextView)findViewById(R.id.textView12);
        textView12.setPaintFlags(textView12.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }



    public void onChestCheckboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox8:
                if (checked) {
                    A[0] = 1;
                    Log.i("Hi1","hello");

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
                    A[2] = 4;
                    Log.i("Hi3","hello");

                }
                break;
            case R.id.checkBox11:
                if (checked) {
                    A[3] = 5;
                    Log.i("Hi4","hello");

                }
                break;
            case R.id.checkBox12:
                if (checked) {
                    A[4] = 6;
                    Log.i("Hi5","hello");

                }
                break;
            case R.id.checkBox13:
                if (checked) {
                    A[5] = 16;
                    Log.i("Hi6","hello");

                }
                break;
            case R.id.checkBox14:
                if (checked) {
                    A[6] = 18;
                    Log.i("Hi7","hello");

                }
                break;
            case R.id.checkBox15:
                if (checked) {
                    A[7] = 21;
                    Log.i("Hi8","hello");

                }
                break;
            case R.id.checkBox16:
                if (checked) {
                    A[8] = 22;
                    Log.i("Hi9","hello");

                }
                break;
            case R.id.checkBox17:
                if (checked) {
                    A[9] = 23;
                    Log.i("Hi10","hello");

                }
                break;
            case R.id.checkBox18:
                if (checked) {
                    A[10] = 26;
                    Log.i("Hi11","hello");

                }
                break;
            case R.id.checkBox19:
                if (checked) {
                    A[11] = 28;
                    Log.i("Hi12","hello");

                }
                break;
            case R.id.checkBox20:
                if (checked) {
                    A[12] = 30;
                    Log.i("Hi13", "hello");

                }
                break;
            case R.id.checkBox21:
                if (checked) {
                    A[13] = 51;
                    Log.i("Hi14","hello");

                }
                break;
            case R.id.checkBox22:
                if (checked) {
                    A[14] = 53;
                    Log.i("Hi15","hello");

                }
                break;
            case R.id.checkBox23:
                if (checked) {
                    A[15] = 104;
                    Log.i("Hi16","hello");

                }
                break;
            case R.id.checkBox24:
                if (checked) {
                    A[16] = 205;
                    Log.i("Hi17","hello");

                }
                break;
            case R.id.checkBox25:
                if (checked) {
                    A[17] = 214;
                    Log.i("Hi18","hello");

                }
                break;


        }
        // Log.i("hello","hello");

    }


    public void onChestButtonClicked(View v){
        for (int j = 0; j < 18; j++) {
            if (A[j] == as[j]) {
                ca++;

            }
            if (A[j] == ab[j]) {
                cb++;
            }
            if (A[j] == pn[j]) {
                cp++;
            }
            if (A[j] == tb[j]) {
                ct++;
            }
            if (A[j] == sa[j]) {
                cs++;
            }
            if (A[j] == by[j]) {
                cy++;
            }
            if (A[j] == sl[j]) {
                cl++;
            }
            if (A[j] == sr[j]) {
                cr++;
            }
            if (A[j] == pu[j]) {
                cu++;
            }
            if (A[j] == me[j]) {
                cm++;
            }

            Log.i("hello",""+ca+"");
            Log.i("hello",""+cb+"");
            Log.i("hello",""+cp+"");
            Log.i("hello",""+ct+"");
            Log.i("hello",""+cs+"");
            Log.i("hello",""+cy+"");
            Log.i("hello",""+cl+"");
            Log.i("hello",""+cr+"");
            Log.i("hello",""+cu+"");
            Log.i("hello",""+cm+"");

        }
        /*TextView textView18 = (TextView) findViewById(R.id.textView18);*/
        if (ca>=cb && ca>=cp && ca>=ct && ca>=cs && ca>=cy && ca>=cl && ca>=cr && ca>=cu && ca>=cm) {
           /* textView18.setText("asthma");
            Toast.makeText(getApplicationContext(), "asthma", Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",asthma);
            startActivity(i);
        }
        else if (cb>=ca && cb>=cp && cb>=ct && cb>=cs && cb>=cy && cb>=cl && cb>=cr && cb>=cu & cb>=cm) {
            /*textView18.setText("acute bronchitis");
            Toast.makeText(getApplicationContext(),"acute bronchitis",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",acutebronchitis);
            startActivity(i);
        }
        else if (cp>=cb && cp>=ca && cp>=cp && cp>=cs && cp>=cy && cp>=cl && cp>=cr && cp>=cu && cp>=cm) {
            /*textView18.setText("pneumonia");
            Toast.makeText(getApplicationContext(),"pneumonia",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",pneumonia);
            startActivity(i);
        }
        else if (ct>=cb && ct>=cp && ct>=ca && ct>=cs && ct>=cy && ct>=cl && ct>=cr && ct>=cu && ct>=cm) {
           /* textView18.setText("tuberculosis");
            Toast.makeText(getApplicationContext(),"tuberculosis",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",tuberculosis);
            startActivity(i);
        }
        else if (cs>=cb && cs>=cp && cs>=ct && cs>=ca && cs>=cy && cs>=cl && cs>=cr && cs>=cu && cs>=cm) {
            /*textView18.setText("asbestosis");
            Toast.makeText(getApplicationContext(),"asbestosis",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",asbestosis);
            startActivity(i);
        }
        else if (cy>=cb && cy>=cp && cy>=ct && cy>=cs && cy>=cy && cy>=cl && cy>=cr && cy>=cu && cy>=cm) {
            /*textView18.setText("byssinosis");
            Toast.makeText(getApplicationContext(),"byssinosis",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",byssinosis);
            startActivity(i);
        }
        else if (cl>=cb && cl>=cp && cl>=ct && cl>=cs && cl>=cy && cl>=ca && cl>=cr && cl>=cu && cl>=cm) {
            /*textView18.setText("silicosis");
            Toast.makeText(getApplicationContext(),"silicosis",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",silicosis);
            startActivity(i);
        }
        else if (cr>=cb && cr>=cp && cr>=ct && cr>=cs && cr>=cy && cr>=cl && cr>=ca && cr>=cu && cr>=cm) {
            /*textView18.setText("sarcoidosis");
            Toast.makeText(getApplicationContext(),"sarcoidosis",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",sarcoidosis);
            startActivity(i);
        }
        else if (cu>=cb && cu>=cp && cu>=ct && cu>=cs && cu>=cy && cu>=cl && cu>=cr && cu>=ca && cu>=cm) {
           /* textView18.setText("pertussis");
            Toast.makeText(getApplicationContext(),"pertussis",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",pertussis);
            startActivity(i);
        }
        else if (cm>=cb && cm>=cp && cm>=ct && cm>=cs && cm>=cy && cm>=cl && cm>=cr && cm>=cu && cm>=ca) {
           /* textView18.setText("mesothelioma");
            Toast.makeText(getApplicationContext(),"mesothelioma",Toast.LENGTH_SHORT).show();*/
            Intent i=new Intent(Chest.this,result.class);
            i.putExtra("Key",mesothelioma);
            startActivity(i);
        }

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chest, menu);
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
