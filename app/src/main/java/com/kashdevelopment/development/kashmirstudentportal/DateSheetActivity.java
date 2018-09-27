package com.kashdevelopment.development.kashmirstudentportal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class DateSheetActivity extends AppCompatActivity {
    private WebView webView;


    private AdView mAdView;
    private Button button101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_sheet);
        getSupportActionBar().setTitle("DateSheet");


    }










    public void univer(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://egov.uok.edu.in/courseinfo/onlinedatesheets/prelogin/default.aspx?ch=1"));
        startActivity(browserIntent);

    }


    public void centre1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.cukashmir.ac.in/displaydepartment.aspx?sid=65&did=36&pag=560"));
        startActivity(browserIntent);

    }
    public void ignou1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.ignou.ac.in/ignou/studentzone/results/1"));
        startActivity(browserIntent);

    }

    public void bose1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://jkbose.jk.gov.in/datesheet.php"));
        startActivity(browserIntent);

    }


}
