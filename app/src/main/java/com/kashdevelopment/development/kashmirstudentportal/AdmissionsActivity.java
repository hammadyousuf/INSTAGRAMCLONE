package com.kashdevelopment.development.kashmirstudentportal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class AdmissionsActivity extends AppCompatActivity {


    private AdView mAdView;
    private Button admission;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissions);
        getSupportActionBar().setTitle("Admissions");

        admission =findViewById(R.id.admission);




        AdRequest adRequest = new AdRequest.Builder().build();







        mAdView = findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void kashmir1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kashmiruniversity.net/admission.aspx"));
        startActivity(browserIntent);
    }

    public void State1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://jkbose.jk.gov.in"));
        startActivity(browserIntent);
    }
    public void skaust1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://skuastkashmir.net/frmCourses.aspx"));
        startActivity(browserIntent);
    }
    public void indra1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://rcsrinagar.ignou.ac.in/programmes/list"));
        startActivity(browserIntent);
    }
    public void baba1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://www.bgsbu.ac.in/admission"));
        startActivity(browserIntent);
    }
    public void centre1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("https://www.cukashmir.ac.in/displaydepartment.aspx?sid=67&did=36&pag=1919"));
        startActivity(browserIntent);
    }
    public void services1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://jkssb.nic.in"));
        startActivity(browserIntent);
    }
    public void psc1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://jkpsc.nic.in/static/notification.html"));
        startActivity(browserIntent);
    }



}