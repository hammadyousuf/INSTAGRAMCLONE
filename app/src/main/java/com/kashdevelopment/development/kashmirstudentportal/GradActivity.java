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

public class GradActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button button107;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grad);
        getSupportActionBar().setTitle("Graduation Notes");










    }
    public void gradeng(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/0xLJsIu8/General_english.html"));
        startActivity(BrowserIntent);

    }
    public void gradedu(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/chfvo6q7/education.html"));
        startActivity(BrowserIntent);

    }
    public void gradphy(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/i-Np8I_g/physics.html"));
        startActivity(BrowserIntent);

    }
    public void gradche(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/gced9zm3/chemistry.html"));
        startActivity(BrowserIntent);

    }
    public void gradsoc(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/qJPKvZen/socology.html"));
        startActivity(BrowserIntent);

    }

    public void graduru(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/jSC1i84z/urdu.html"));
        startActivity(BrowserIntent);

    }
    public void gradeco(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/_sYtHLaW/economics.html"));
        startActivity(BrowserIntent);

    }
    public void gradara(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/IsngrinC/arabic.html"));
        startActivity(BrowserIntent);

    }
    public void gradbot(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/irIXHbiW/botony.html"));
        startActivity(BrowserIntent);

    }
    public void gradzoo(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/Vm1aq277/zoology.html"));
        startActivity(BrowserIntent);

    }
    public void gradmat(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/SmV0WW4J/mathmatics.html"));
        startActivity(BrowserIntent);

    }
    public void gradphi(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/IDpe0O8K/philosphy.html"));
        startActivity(BrowserIntent);

    }
    public void gradpol(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/Bcvwnob7/poltial_science.html"));
        startActivity(BrowserIntent);

    }



    public void gradhis(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/8ZhN5Afg/history.html"));
        startActivity(BrowserIntent);

    }


    public void gradfun(View view){
        Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.4shared.com/folder/udpATicJ/functional_english.html"));
        startActivity(BrowserIntent);

    }














}
