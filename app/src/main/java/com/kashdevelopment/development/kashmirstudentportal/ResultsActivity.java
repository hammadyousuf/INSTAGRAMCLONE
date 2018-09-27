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

public class ResultsActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button button116;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results2);
        getSupportActionBar().setTitle("Results");










    }

    public void kashmir1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://egov.uok.edu.in/results/"));
        startActivity(browserIntent);
    }

    public void State1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://jammu-kashmir.indiaresults.com/"));
        startActivity(browserIntent);
    }
    public void skaust1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://skuastkashmir.net/frmResults.aspx"));
        startActivity(browserIntent);
    }
    public void indra1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://www.ignou.ac.in/ignou/studentzone/results/1"));
        startActivity(browserIntent);
    }
    public void baba1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://www.bgsbu.ac.in/results"));
        startActivity(browserIntent);
    }
    public void centre1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("https://www.cukashmir.ac.in/displaydepartment.aspx?sid=65&did=36&pag=511"));
        startActivity(browserIntent);
    }
    public void service1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://jkssb.nic.in/"));
        startActivity(browserIntent);
    }
    public void psc1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
                ("http://jkpsc.nic.in/static/result.html"));
        startActivity(browserIntent);
    }


}