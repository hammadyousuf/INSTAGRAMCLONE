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

public class notespgmedbedActivity extends AppCompatActivity {



    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button button110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notespgmedbed);
        getSupportActionBar().setTitle("PG + BED +MED NOTES");


    }


    public void pgzool(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/tdq_F-R_/ZOOLOGY_MSC.html"));
        startActivity(browserIntent);

    }

    public void pgphy(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/LNqEc3ti/PHYSICS_MSC.html"));
        startActivity(browserIntent);

    }

    public void pgit(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/JXZCdKJy/MSC_IT.html"));
        startActivity(browserIntent);

    }

    public void pgche(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/_ByDoTtR/MSC_CHEMISTRY_KU.html"));
        startActivity(browserIntent);

    }

    public void pgsoc(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/18kG-ouh/MA_SOCOLOGY.html"));
        startActivity(browserIntent);

    }

    public void pgpol(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/t8K0swz8/MA_POLTICAL_SCIENCE.html"));
        startActivity(browserIntent);

    }

    public void pgkas(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/UnAPKJ2q/MA_KASHMIRI.html"));
        startActivity(browserIntent);

    }

    public void pghis(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/7oyJngf7/MA_HISTORY.html"));
        startActivity(browserIntent);

    }

    public void pgedu(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/0hnGzAe-/MA_EDUCATION.html"));
        startActivity(browserIntent);

    }

    public void pgeco(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/lKX2Hhkq/MA_ECONOMICS.html"));
        startActivity(browserIntent);

    }

    public void pgmat(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/Ulhr7HG2/ku_math_ms.html"));
        startActivity(browserIntent);

    }

    public void pguru(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/8iozajZN/ku_Ma_URDU.html"));
        startActivity(browserIntent);

    }


    public void pgeng(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/SRFiit_j/ku_MA_Engish.html"));
        startActivity(browserIntent);

    }

    public void pgara(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/dpCk9Fpx/KU_MA_ARABIC.html"));
        startActivity(browserIntent);

    }

    public void pgbioc(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/Y6kMS71s/KASHMIR_MSC_UNIVERSITY_BIOCHEM.html"));
        startActivity(browserIntent);

    }

    public void pgbot(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/-xoJUkvd/kashhmir_University_Msc_Botony.html"));
        startActivity(browserIntent);

    }



}




















































