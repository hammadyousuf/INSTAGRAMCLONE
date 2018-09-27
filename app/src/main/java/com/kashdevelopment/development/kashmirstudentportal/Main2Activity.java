package com.kashdevelopment.development.kashmirstudentportal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.kashdevelopment.development.kashmirstudentportal.activities.MainActivity;


public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private InterstitialAd interstitial;
    private WebView webView;
    private AdView mAdView;

  Button kashmirgram;

    // battery
    private BroadcastReceiver broad=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level=intent.getIntExtra("level",0);  //level of battery//
            ProgressBar pb=(ProgressBar) findViewById(R.id.progress);
            pb.setProgress(level);

            TextView tv =(TextView) findViewById(R.id.textView9);
            tv.setText("Battery level:"+Integer.toString(level)+"%");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        kashmirgram=(Button)findViewById(R.id.kashmirgram);
        interstitial=new InterstitialAd(Main2Activity.this);
        registerReceiver(broad,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        webView=(WebView)findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://wwww.msn.com/en-in");

        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.getAllowContentAccess();
        webSettings.supportMultipleWindows();
        webSettings.supportZoom();
        webSettings.setDisplayZoomControls(true);
        webSettings.setAllowFileAccess(true);








        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        kashmirgram=(Button)findViewById(R.id.kashmirgram);
        kashmirgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it =new Intent(Main2Activity.this,MainActivity.class);
                startActivity(it);
            }
        });


    }

    public void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_pg) {

            Intent i=new Intent(Main2Activity.this,notespgmedbedActivity.class);
            startActivity(i);

            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });

        } else if (id == R.id.nav_ug) {

            Intent i =new Intent(Main2Activity.this,GradActivity.class);
            startActivity(i);
            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });
        } else if (id == R.id.nav_10th) {

            Intent i= new Intent(Main2Activity.this,tenth12thnotesActivity.class);
            startActivity(i);
            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });
        } else if (id == R.id.games) {
            Intent i= new Intent(Main2Activity.this,gamesActivity.class);
            startActivity(i);
            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });

        } else if (id == R.id.nav_results) {

            Intent i= new Intent(Main2Activity.this,ResultsActivity.class);
            startActivity(i);
            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });

        } else if (id == R.id.nav_admissions) {
            Intent i= new Intent(Main2Activity.this,AdmissionsActivity.class);
            startActivity(i);
            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });
        } else if (id == R.id.nav_entrances) {
            Intent i= new Intent(Main2Activity.this,EntranceActivity.class);
            startActivity(i);
            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });
        } else if (id == R.id.nav_datesheets) {
            Intent i= new Intent(Main2Activity.this,DateSheetActivity.class);
            startActivity(i);
            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });
        } else if (id == R.id.nav_papers) {
            Intent i= new Intent(Main2Activity.this,PreviousPapersActivity.class);
            startActivity(i);
            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });

        } else if (id == R.id.nav_PG) {

            Intent i= new Intent(Main2Activity.this,PGActivity.class);
            startActivity(i);

            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });


        } else if (id == R.id.nav_GRAD) {

            Intent i= new Intent(Main2Activity.this,GraduationActivity.class);
            startActivity(i);

            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });

        } else if (id == R.id.nav_12th) {


            Intent i =new Intent(Main2Activity.this,twelveActivity.class);
            startActivity(i);

            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });

        } else if (id == R.id.nav_1oth) {

            Intent i = new Intent(Main2Activity.this,tenthActivity.class);
            startActivity(i);

            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });


        } else if (id == R.id.nav_tips) {

            Intent i = new Intent(Main2Activity.this,tipsActivity.class);
            startActivity(i);

            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });




        } else if (id == R.id.nav_faq) {

            Intent i = new Intent(Main2Activity.this,FAQActivity.class);
            startActivity(i);

            //intertertial code
            interstitial= new InterstitialAd(getApplicationContext());
            interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
            AdRequest adRequest=new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    if (interstitial.isLoaded()){
                        interstitial.show();
                    }
                }
            });


        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }







}
