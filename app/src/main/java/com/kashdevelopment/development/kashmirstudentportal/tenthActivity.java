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

public class tenthActivity extends AppCompatActivity {

    Button button65;


    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button button114;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        getSupportActionBar().setTitle("10TH LECTURES ONLINE");











        button65=(Button) findViewById(R.id.button65);

        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it =new Intent(tenthActivity.this,tenth12thnotesActivity.class);
                startActivity(it);
            }
        });


    }

    public void eng10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=FA-UYqGqRec&list=PLKG2sD-PBJfP8Qyp5FhmIu5fFkvEq2aVP"));
        startActivity(browserIntent);
    }
    public void mat10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=sYv-FFyYiLk&list=PLYDM0qt6Z141oUcgf-Pxx6bmCq__hkJEz"));
        startActivity(browserIntent);


    }
    public void uru10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=GCU_V08U2hQ&list=PL1F0978C2482B8F5C"));
        startActivity(browserIntent);
    }

    public void bio10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=a2bHQsszrTM&list=PLY7M8elJDmwYWTJW_s517rvrEkTDYZkaS"));
        startActivity(browserIntent);
    }
    public void civ10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=ZqZGxYJn3iE&list=PLgtKqBDqOBGTPXYyPRAO_BcRFuSntpeaa"));
        startActivity(browserIntent);

    }

    public void math9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=VO8znSWoObU&list=PLIoBj2ADIaqw3YNfOXdwHM6js0PIWbPQg"));
        startActivity(browserIntent);

    }

    public void che10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=bb4Lc3EkieE&list=PLrn2lobWkqKlHQR4Dh3UBngcKp5fWdYgx"));
        startActivity(browserIntent);

    }

    public void phy10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=68T8J-aqE18&list=PLY7M8elJDmwYBVgOdEmVfm1jF6e7hD-ZG"));
        startActivity(browserIntent);

    }
    public void geo10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=fR1Q_cnd3Co&list=PLY7M8elJDmwbjRyrGJd8H3zh8UQNumiK2"));
        startActivity(browserIntent);

    }

    public void his10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=BN_qrvMo-fU&list=PLY7M8elJDmwb_hfaekDvHBx_obZu8Vcu1"));
        startActivity(browserIntent);

    }


}