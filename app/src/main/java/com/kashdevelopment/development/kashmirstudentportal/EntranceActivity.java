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

public class EntranceActivity extends AppCompatActivity {


    private AdView mAdView;
    private Button button106;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance);
        getSupportActionBar().setTitle("Entrance");

        AdRequest adRequest = new AdRequest.Builder().build();








        mAdView = findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public void cet1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jakbopee.org"));
        startActivity(browserIntent);

    }
    public void neet1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jakbopee.org"));
        startActivity(browserIntent);

    }
    public void polytechnic1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jakbopee.org"));
        startActivity(browserIntent);

    }
    public void kul1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://http://www.kashmiruniversity.net/admission.aspx"));
        startActivity(browserIntent);

    }
    public void skuast1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://skuastkashmir.net/frmCourses.aspx"));
        startActivity(browserIntent);

    }


}

