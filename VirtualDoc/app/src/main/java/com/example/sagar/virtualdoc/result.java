package com.example.sagar.virtualdoc;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import junit.framework.Test;


public class result extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("hi","res4");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setTitle("Result :");
        Log.i("hi","res1");

        TextView disease=(TextView)findViewById(R.id.disease);
        disease.setPaintFlags(disease.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        TextView remedies=(TextView)findViewById(R.id.remedies);
        remedies.setPaintFlags(remedies.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        TextView precautions=(TextView)findViewById(R.id.precautions);
        precautions.setPaintFlags(precautions.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        Log.i("hi","res2");
        TextView infectious=(TextView)findViewById(R.id.infectious);
        infectious.setPaintFlags(infectious.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        TextView references=(TextView)findViewById(R.id.references);
        references.setPaintFlags(references.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        Log.i("hi","res3");

        String abc="";
        Bundle extras=getIntent().getExtras();
        if(extras!=null) {
            abc = extras.getString("Key");
        }
        /*if(abc == "arthritis" ) {

            TextView dname = (TextView) findViewById(R.id.dname);
            dname.setText("");

            TextView rname = (TextView) findViewById(R.id.dname);
            rname.setText("");

            TextView pname = (TextView) findViewById(R.id.dname);
            pname.setText("");

            TextView yn = (TextView) findViewById(R.id.yn);
            yn.setText("");

            TextView refname = (TextView) findViewById(R.id.dname);
            refname.setText("");
        }*/

        TextView dname = (TextView) findViewById(R.id.dname);

        TextView rname = (TextView) findViewById(R.id.rname);

        TextView pname = (TextView) findViewById(R.id.pname);

        TextView yn = (TextView) findViewById(R.id.yn);

        TextView refname = (TextView) findViewById(R.id.refname);


        if (abc.equals("chickenpox")){

            dname.setText ("Chicken Pox");

            rname.setText ("->  Rest \n"+
                            "->  Paracetamol for fever \n" +
                            "->  NO ASPIRIN \n"+
                            "->  Itching can be treated with lotions such as calamine available from a pharmacy.\n"+
                            "->  Tepid baths with half cup of sodium bicarbonate or solutions such as Pinetarsol added can also be helpful in relieving itching. \n"+
                            "->  Complete treatment within 7-10 days of beginning of spots \n"+
                            "->  Use of antibacterial soaps \n"+
                            "->  No scratching should be done on red spot ");

            pname.setText ("->  Vaccination available-should be taken to avoid chickenpox in future \n"+
                            "->  Avoid salty food \n"+
                            "->  Should take only cool and light food \n"+
                             "->  Light dressing ");

            refname.setText ("https://www.southerncross.co.nz/AboutTheGroup/HealthResources/MedicalLibrary/tabid/178/vw/1/ItemID/197/Chickenpox-symptoms-treatment-vaccination.aspx \n"+"\n"+
                              "http://www.nhs.uk/Conditions/Chickenpox/Pages/Symptoms.aspx ");
            yn.setText ("Yes ");
        }

        else if (abc.equals("cholera")){
            dname.setText ("Cholera");

            rname.setText ("->  Vaccination available \n"+
                            "->  Rehydration - oral rehydration salts (ORS)\n"+
                            "->  Intravenous fluids\n"+
                            "->  Antibiotics  A single dose of doxycycline (Monodox, Oracea, Vibramycin) or azithromycin (Zithromax, Zmax) may be effective.\n"+
                            "->  Zinc supplements may decrease and shorten the duration of diarrhea in children with cholera. ");

            pname.setText ("->  Drink only bottled, boiled, or chemically treated water.\n"+
                            "->  Use bottled, boiled, or chemically treated water to wash dishes and brush teeth.\n"+
                            "->  Keep flies away from food\n"+
                            "->  Avoid ice cubes (unless they are made from purified water), ice cream, unpasteurized milk, and salads, which can easily be contaminated with bacteria.\n"+
                            "->  Cook all foods thoroughly and eat them while they're hot.\n"+
                            "->  Avoid foods and drinks from street vendors.\n"+
                            "->  Wash hands often with soap and water. ");

            refname.setText ("http://chealth.canoe.com/channel_condition_info_details.asp?channel_id=1020&relation_id=55796&disease_id=31&page_no=2\n"+"\n"+
                              "http://www.webmd.com/a-to-z-guides/cholera-faq ");

            yn.setText ("No ");
        }

        else if (abc.equals("arthritis")){

            dname.setText("Arthritis");

            rname.setText ("->  Joint exercises\n" +"->  Avoid straining joints");
            pname.setText ("->  Regular exercise\n"+"->  Adequate sleep\n"+"->  Loose extra weights ");

            refname.setText ("http://www.medicinenet.com/rheumatoid_arthritis_early_symptoms/views.htm\n"+"\n"+
                            "http://www.medicalnewstoday.com/articles/7621.php#signs_and_symptoms\n"+"\n"+
                            "http://www.livestrong.com/article/216112-arthritis-precautions/ ");

            yn.setText ("may or may not be there are different types of ");
        }


        else if (abc.equals("asthma")){

            dname.setText ("Asthma");

            rname.setText ("->  Spirometry test\n"+
                            "->  Allergy testing\n"+
                            "->  NO CURE but can be controlled\n"+
                            "->  Controller medications such as  corticosteroids,budesonide,mometasone,ciclesonide,flunisolide,beclomethasone\n"+
                            "->  Leukotriene modifiers are oral medications that include montelukast (Singulair), zafirlukast (Accolate) and zileuton (Zyflo, Zyflo CR). ");

            pname.setText ("Adults suffering from asthma should be vaccinated yearly. ");

            refname.setText ("http://www.aaaai.org/conditions-and-treatments/asthma.aspx");

            yn.setText ("no ");
        }

        else if (abc.equals("dehydration")){

            dname.setText ("Dehydration (whole body) ");

            rname.setText (" ");

            pname.setText ("->  Break up exposure to hot environment\n"+
                            "->  Drink plenty of water and juices\n"+
                            "->  Wear light clothes ");

            refname.setText ("http://www.mayoclinic.org/diseases-conditions/dehydration/basics/symptoms/con-20030056 ");

            yn.setText ("no ");
        }

        else if (abc.equals("acute bronchitis")){

            dname.setText ("Acute Bronchitis ");

            rname.setText ("->  Chest x-ray\n"+
                            "->  Pulmonary function test\n"+
                           "->  Plenty of rests and oral fluids\n"+
                            "->  For adults aspirin may be taken ");

            pname.setText ("Avoid smoke and fumes ");

            refname.setText ("http://www.healthline.com/health/bronchitis#Symptoms3 ");

            yn.setText ("majority are ");
        }

        else if (abc.equals("diarrhea")){

            dname.setText ("Diarrhea");

            rname.setText ("->  Stay hydrated\n"+
                           "->  Ors ");

            pname.setText (" ");

            refname.setText ("http://www.webmd.com/digestive-disorders/digestive-diseases-diarrhea ");

            yn.setText ("no ");
        }

        else if (abc.equals("epilepsy")){

            dname.setText ("Epilepsy");

            rname.setText ("->  Ketogenic Diet - The diet is very high in fat and low in carbohydrates\n"+
                            "->  The diet is very high in fat and low in carbohydrates ");

            pname.setText ("->  Cushion the person's head.\n"+
                           "->  Loosen any tight neckwear.\n"+
                            "->  Do not hold the person down or restrain the person.\n"+
                            "->  Do not place anything in the mouth or try to pry the teeth apart.\n"+
                            "->  Observe seizure characteristics -- length, type of movements, direction of head or eye turning. These characteristics may help the doctor diagnose the type of seizure. ");

            refname.setText ("http://www.mayoclinic.org/diseases-conditions/epilepsy/symptoms-causes/dxc-20117207 ");

            yn.setText ("N" +
                    "o ");
        }

        else if (abc.equals("hepatitis B")){

            dname.setText("Hepatitis B ");

            rname.setText("Vaccination after birth ");

            pname.setText(" ");

            refname.setText("http://www.mayoclinic.org/diseases-conditions/hepatitis-b/basics/symptoms/con-20022210 ");

            yn.setText("no ");
        }

        else if (abc.equals("hyperglycemia")) {

            dname.setText("Hyperglycemia");

            rname.setText("Insulin ");

            pname.setText(" ");

            refname.setText(" ");

            yn.setText(" ");
        }

        else if (abc.equals("hypothyroidism")){

            dname.setText ("Hypothyroidism");

            rname.setText ("->  Thyroxine test\n"+
                            "->  Blood test ");

            pname.setText (" ");

            refname.setText ("http://www.mayoclinic.org/diseases-conditions/hypothyroidism/basics/symptoms/con-20021179 ");

            yn.setText ("no ");
        }

        else if (abc.equals("diabetes mellitus")) {

                dname.setText("Diabetes Mellitus (whole body) ");

                rname.setText("->  Blood test to know about the disease\n"+
                              "->  Should take insulin\n"+
                              "->  Body glucose measurement should be done at regular interval");

                pname.setText(" ");

                refname.setText("http://www.ucsfhealth.org/conditions/diabetes_mellitus/signs_and_symptoms.html ");

                yn.setText("no ");
        }


        else if (abc.equals("influenza")){

            dname.setText ("Influenza");

            rname.setText (" ");

            pname.setText (" ");

            refname.setText ("http://www.mayoclinic.org/diseases-conditions/flu/basics/definition/con-20035101\n"+"\n"+
                    "http://www.cdc.gov/flu/about/disease/symptoms.htm ");

            yn.setText (" ");
        }


        else if (abc.equals("anaemia")) {

            dname.setText("Anaemia");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.webmd.boots.com/a-to-z-guides/anaemia-symptoms-treatment ");

            yn.setText(" ");
        }

        else if (abc.equals("kidney stone")){

            dname.setText ("Kidney Stone");

            rname.setText ("->  Ultra sound\n"+
                    "->  IVP\n"+
                    "->  CT scan\n"+
                    "->  urinalysis ");

            pname.setText (" ");

            refname.setText ("http://www.mayoclinic.org/diseases-conditions/kidney-stones/basics/symptoms/con-20024829 ");

            yn.setText ("no ");
        }


        else if (abc.equals("malaria")){


            dname.setText ("Malaria (whole body) ");

            rname.setText ("->  Chloroquine (Aralen),\n"+
                    "->  Doxycycline (Vibramycin, Oracea, Adoxa, Atridox)\n"+
                    "->  Quinine (Qualaquin)\n"+
                    "->  Mefloquine\n"+
                    "->  Atovaquone/proguanil (Malarone)\n"+
                    "->  Artemether/lumefantrine (Coartem) ");

                    pname.setText (" ");

            refname.setText ("http://www.webmd.com/a-to-z-guides/malaria-symptoms\n"+"\n"+
                    "http://www.medicinenet.com/malaria_facts/page4.htm#what_is_the_treatment_for_malaria ");

            yn.setText ("Generally no\n"+
                    "Can be transferred with blood or any intravenous method ");
        }

        else if (abc.equals("osteomyelitis")){

            dname.setText ("Osteomyelitis");

            rname.setText ("->  X-rays\n"+
                           "->  Blood test\n"+
                           "->  MRI\n"+
                            "->  Bone scan\n"+
                            "->  Bone biopsy\n"+
                            "->  Antibiotics\n"+
                            "->  Surgery ");

            pname.setText ("Diabetic persons are most likely to suffer ");

            refname.setText ("http://www.webmd.com/pain-management/osteomyeltis-treatment-diagnosis-symptoms ");

            yn.setText ("no ");
        }

        else if (abc.equals("osteoporosis")){

            dname.setText ("Osteoporosis");

            rname.setText ("->  DEXA Scan (Dual X-ray Absorptiometry)\n"+
                            "->  Ultrasound and quantitative computed tomography (QCT)\n"+
                            "->  Blood test\n"+
                            "->  X-rays\n"+
                            "->  Basic CDE’s” -- calcium(C), vitamin D (D), weight-bearing exercise (E), prevention of Falls (F), and bone-friendly medicines ");

            pname.setText (" ");

            refname.setText ("http://www.mayoclinic.org/diseases-conditions/osteoporosis/basics/symptoms/con-20019924\n"+
                                                                                       " http://www.webmd.com/osteoporosis/ ");

            yn.setText ("no ");
        }

        else if (abc.equals("conjunctivitis")){

           dname.setText ("Conjunctivitis");

           rname.setText ("->  Eye drop \n" +
                          "->  If situation is worst eye surgery will be done ");

           pname.setText (" ");

           refname.setText ("http://www.webmd.com/eye-health/eye-health-conjunctivitis ");

           yn.setText ("no ");
       }

        else if (abc.equals("pneumonia")){

            dname.setText ("Pneumonia");

            rname.setText ("->  Chest x-ray\n"+
                            "->  cbc blood test\n"+
                            "->  ct scan of chest ");

            pname.setText (" ");

            refname.setText ("http://www.lung.org/lung-disease/pneumonia/symptoms-diagnosis-and.html\n"+"\n"+
                              "http://www.lung.org/lung-disease/pneumonia/symptoms-diagnosis-and.html ");

            yn.setText ("no ");
        }

        else if (abc.equals("ringworm")){

            dname.setText ("Ringworm");

            rname.setText ("Antifungal creams\n"+
                            "for example, terbinafine, clotrimazole, econazole, ketoconazole and miconazole. ");

            pname.setText (" ");

            refname.setText ("http://www.nhs.uk/Conditions/Ringworm/Pages/Symptoms.aspx ");

            yn.setText ("yes by touching ");
        }

        else if (abc.equals("tuberculosis")){

            dname.setText ("Tuberculosis");

            rname.setText ("->  Blood test\n"+
                           "->  Chest xray\n"+
                           "->  CT scan\n"+
                           "->  Isoniazid\n"+
                           "->  Rifampin\n"+
                           "->  Ethambutol\n"+
                           "->  Pyrazinamide ");

            pname.setText ("Vaccination\n"+
                            "Wear a mask ");

            refname.setText ("http://www.cdc.gov/features/tbsymptoms/ ");

            yn.setText ("yes ");
        }

        else if (abc.equals("ulcers")) {

            dname.setText("Ulcers");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.webmd.com/digestive-disorders/digestive-diseases-peptic-ulcer-disease ");

            yn.setText(" ");
        }

        else if (abc.equals("jaundice")){

            dname.setText ("Jaundice");

            rname.setText ("->  Rest\n"+
                           "->  Fruits ");

            pname.setText (" ");

            refname.setText ("http://www.webmd.boots.com/a-to-z-guides/jaundice ");

            yn.setText (" ");
        }

        else if (abc.equals("typhoid")) {

            dname.setText("Typhoid");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.medicinenet.com/typhoid_fever/page3.htm ");

            yn.setText(" ");
        }

        else if (abc.equals("dengue")) {

            dname.setText("Dengue");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.webmd.com/a-to-z-guides/dengue-fever-reference ");

            yn.setText(" ");
        }

        else if (abc.equals("throat infection")) {

            dname.setText("Throat Infection");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.nps.org.au/conditions/ear-nose-mouth-and-throat-disorders/ear-nose-and-throat-infections/sore-throat/for-individuals/Symptoms ");

            yn.setText(" ");
        }

        else if (abc.equals("fracture")) {

            dname.setText("Fracture");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.webmd.com/a-to-z-guides/understanding-fractures-symptoms ");

            yn.setText(" ");

        }

        else if (abc.equals("sprain")) {

            dname.setText("Sprain");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.niams.nih.gov/health_info/sprains_strains/sprains_and_strains_ff.asp ");

            yn.setText(" ");
        }

        else if (abc.equals("flu")) {
            dname.setText("Flu ");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.flu.gov/symptoms-treatment/symptoms/ ");

            yn.setText(" ");
        }

        else if (abc.equals("food poisoning")) {

            dname.setText("Food Poisoning");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.healthline.com/health/food-poisoning#Overview1 ");

            yn.setText(" ");
        }

        else if (abc.equals("constipation")) {

            dname.setText("Constipation");

            rname.setText(" ");

            pname.setText(" ");

            refname.setText("http://www.webmd.com/digestive-disorders/digestive-diseases-consipation ");

            yn.setText(" ");
        }

        else if (abc.equals("myopia")){

             dname.setText ("nearsightedness (Myopia) ");

             rname.setText ("->  Eye lens\n"+
                            "->  Spectacles after doctor check up\n"+
                            "->  Myopia is usually diagnosed between the ages of 8 and 12.\n"+
                            "->  Can also be caused by diabetes in  adults\n"+
                            "->  Risk factor is visual stress which can be caused due to sitting over laptop for a large time.\n"+
                            "->  Corneal refractive therapy\n"+
                            "->  Refractive surgery ");

             pname.setText (" ");

             refname.setText ("http://www.healthline.com/health/eye-health ");

             yn.setText (" ");

        }

        else if (abc.equals("hypermetropia")){

             dname.setText ("farsightedness (Hypermetropia) ");

             rname.setText ("->  Eye lens\n"+
                                    "->  Spectacles\n"+
                                    "->  Refractive surgery\n"+
                                    "->  Laser-assisted in-situ keratomileusis (LASIK)\n"+
                                    "->  However glasses are safer than refractive surgery ");

             pname.setText (" ");

             refname.setText ("http://www.healthline.com/health/eye-health ");

             yn.setText (" ");
        }

        else if (abc.equals("astigmatism")){

             dname.setText ("Astigmatism ");

             rname.setText ("->  Visual Acuity Assessment Test (VAT)\n"+
                                       "->  Refractor Test\n"+
                                       "->  Keratometry\n"+
                                       "->  Surgery\n"+
                                       "->  Corrective lens ");

             pname.setText (" ");

             refname.setText ("http://www.healthline.com/health/ ");

             yn.setText (" ");

        }

        else if (abc.equals("presbyopia")){

             dname.setText ("Presbyopia");

             rname.setText ("->  Prescription reading glasses\n"+
                                            "->  Bifocals\n"+
                                            "->  Modified monovision contact lenses\n"+
                                            "->  Progressive bifocal lenses ");

             pname.setText (" ");

             refname.setText ("http://www.healthline.com/health/presbyopia ");

             yn.setText (" ");
        }

        else if (abc.equals("night blindness")) {

            dname.setText("Night Blindness");

            rname.setText("Surgery ");

            pname.setText(" ");

            refname.setText(" ");

            yn.setText(" ");

        }

        else if (abc.equals("hypertensive retinopathy")) {

            dname.setText("Hypertensive Retinopathy");

            rname.setText("->  Blood pressure medicines such as diuretics or ACE inhibitors\n"+

                          "->  Eye examination by ophthalmoscope\n"+

                          "->  Fluorescein angiography test");

            pname.setText(" ");

            refname.setText("http://www.healthline.com/health/hypertensive-retinopathy#Diagnosis5 ");

            yn.setText(" ");
        }

        else if (abc.equals("asbestosis")){

            dname.setText ("Asbestosis - lung disease ");

            rname.setText ("->  Chest x-ray\n"+
                                                        "->  Lung function test\n"+
                                                        "->  Biopsy\n"+
                                                        "->  CT scan\n"+
                                                        "->  Aerosol medicines to thin secretions\n"+
                                                        "->  Oxygen by mask or by a plastic piece that fits into nostrils\n"+
                                                        "->  Lung transplantation ");

            pname.setText ("->  It can not be treated\n"+
                           "->  It can only be prevented ");

            refname.setText ("http://www.lung.org/lung-disease/asbestosis/symptoms-diagnosis-treatment.html ");

            yn.setText (" ");
        }

        else if (abc.equals("byssinosis")){

            dname.setText ("Byssinosis ");

            rname.setText ("->  Chest x-ray\n"+
                    "->  Lung function test\n"+
                    "->  Less exposure to dust\n"+
                    "->  Medicines like bronchodilators\n"+
                    "->  In severe case corticosteroids\n"+
                "->  Respiratory treatments as nebulizers\n"+
                "->  Quit smoking\n"+
                "->  Physical exercise\n"+
                "->  Breathing exercise\n"+
                "->  Use of face mask ");

            pname.setText (" ");

            refname.setText ("http://www.lung.org/lung-disease/byssinosis/ ");

            yn.setText (" ");
        }

        else if (abc.equals("silicosis")){
            dname.setText ("Silicosis - lung disease ");

            rname.setText ("->  Chest x-ray\n"+
                    "->  Pulmonary functions test\n"+
                    "->  Tuberculosis skin or blood test\n"+
                    "->  Quit smoking\n"+
                    "->  Antibiotics for respiratory infections\n"+
                    "->  Stay away from silica source ");

            pname.setText (" ");

            refname.setText ("http://www.lung.org/lung-disease/silicosis/symptoms-diagnosis.html ");

            yn.setText (" ");

        }

        else if (abc.equals("sarcoidosis")){
            dname.setText ("Sarcoidosis ");

            rname.setText ("->  Pulmonary function test\n"+
                    "->  Lung x-ray\n"+
                    "->  Quit smoking\n"+
                    "->  Stay away from dust\n"+
                    "->  Stay away from chemicals that can harm your lungs\n"+
                    "->  Regular check up ");

                    pname.setText (" ");

            refname.setText ("http://www.lung.org/lung-disease/sarcoidosis/symptoms-diagnosis.html ");

            yn.setText (" ");

        }

        else if (abc.equals("pertussis")){
            dname.setText ("Pertussis- lung disease ");

            rname.setText ("->  Cough syrups and drop will not work\n"+
                    "->  Antibiotics like erythromycin and amoxicillin\n"+
                    "->  Intravenous fluids\n"+
                    "->  Oxygen tent with high humidity ");

                    pname.setText (" ");

            refname.setText ("http://www.lung.org/lung-disease/pertussis/symptoms-diagnosis.html ");

            yn.setText (" ");

        }

        else if (abc.equals("mesothelioma")){
            dname.setText ("Mesothelioma - lung disease ");

            rname.setText ("->  Blood test\n"+
                    "->  Lung x-ray\n"+
                    "->  CT scan\n"+
                    "->  Biopsy\n"+
                    "->  Radiation\n"+
                    "->  Chemotherapy ");

            pname.setText (" ");

            refname.setText ("http://www.lung.org/lung-disease/mesothelioma/symptoms-diagnosis.html ");

            yn.setText (" ");

        }

        else if (abc.equals("lupus")){
            dname.setText ("Lupus");

            rname.setText ("->  Regular exercise\n"+
                    "->  Use of relaxation texation\n"+
                    "->  Take short break in between ");

            pname.setText (" ");

            refname.setText (" ");

            yn.setText (" ");

        }

        else if (abc.equals("ezcema")){
            dname.setText ("Ezcema");

            rname.setText ("->  Certirizine(zyrtec)\n"+
                    "->  Diphenhydramine (benadryl)\n"+
                    "->  Fexofendaine (allegra)\n"+
                    "->  Loratidine (claritin)\n"+
                    "->  Cortisone (steroid) cream ");

                    pname.setText (" ");

            refname.setText (" ");

            yn.setText (" ");

        }

        else if (abc.equals("outer ear cancer")) {

            dname.setText("Outer Ear Cancer ");

            rname.setText("Surgery to remove the affected area ");

            pname.setText(" ");

            refname.setText(" ");

            yn.setText(" ");
        }

        else if (abc.equals("cancer of the auditory canal")){

            dname.setText ("Cancer of the Auditory Canal ");

            rname.setText ("->  Surgery to remove parts of the middle ear\n"+
                            "->  Radiation ");

            pname.setText (" ");

            refname.setText (" ");

            yn.setText (" ");

        }
        else if (true){
            disease.setVisibility(View.INVISIBLE);
            references.setVisibility(View.GONE);
            remedies.setVisibility(View.INVISIBLE);
            precautions.setVisibility(View.INVISIBLE);
            infectious.setVisibility(View.GONE);
            dname.setVisibility(View.INVISIBLE);
            rname.setVisibility(View.INVISIBLE);
            refname.setVisibility(View.GONE);
            yn.setVisibility(View.GONE);
            pname.setTextSize(25);
            pname.setTypeface(Typeface.SERIF);
            pname.setText("  Sorry, No Match Found");

        }


    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
