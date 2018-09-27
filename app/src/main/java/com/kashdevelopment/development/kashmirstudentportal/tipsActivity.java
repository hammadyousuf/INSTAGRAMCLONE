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

public class tipsActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button button118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        getSupportActionBar().setTitle("Tips for Student");









    }

    public void mt1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=qmhv2_7qdfY&list=PLWIaM3DYnY4UcY1twS-lXmEaVhUXTa3xK"));
        startActivity(browserIntent);


    }

    public void et1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=xOeR0XYh0Pg&list=PL1GhFN8B5nbFx4j2WStkMevIZ5-q5BeL5"));
        startActivity(browserIntent);


    }

    public void ct1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=LpCroQFEWHM&list=PLo5mqsRSpbw7JoT8QPkJzEJn-Wp4Fj7Cm"));
        startActivity(browserIntent);


    }

    public void ft1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://apkpure.com/game"));
        startActivity(browserIntent);


    }

    public void at1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://apkpure.com/app"));
        startActivity(browserIntent);


    }







}
