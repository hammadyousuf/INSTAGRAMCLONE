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

public class tenth12thnotesActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth12thnotes);
        getSupportActionBar().setTitle("10TH 12TH NOTES");





    }


    public void teneng(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/J7Ipb3gi/english.html"));
        startActivity(browserIntent);

    }


    public void tensci(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/_zI352ag/science.html"));
        startActivity(browserIntent);

    }

    public void tenssc(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/uk291Bcv/social_science.html"));
        startActivity(browserIntent);

    }

    public void tenuru(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/_9p5sor8/urdu.html"));
        startActivity(browserIntent);

    }

    public void twephy(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/defQWC9J/physics.html"));
        startActivity(browserIntent);

    }

    public void twezoo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/KuyZKX_W/zoology.html"));
        startActivity(browserIntent);

    }

    public void twebot(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/6j73r6a8/botony.html"));
        startActivity(browserIntent);

    }

    public void twemat(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/OzX91Bcv/maths.html"));
        startActivity(browserIntent);

    }

    public void tweeco(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/Bnl5sor8/ecnomics.html"));
        startActivity(browserIntent);

    }

    public void tweedu(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/fkfeX8dK/education.html"));
        startActivity(browserIntent);

    }

    public void twepol(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/6twOdbTO/poltical_science.html"));
        startActivity(browserIntent);

    }

    public void twephysical(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/v-Qjowv7/physial_education.html"));
        startActivity(browserIntent);

    }


    public void tweesi(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.4shared.com/folder/oD_2wRqn/enviroment_science.html"));
        startActivity(browserIntent);

    }


}




















































