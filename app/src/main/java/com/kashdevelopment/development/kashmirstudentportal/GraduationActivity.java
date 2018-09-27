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

public class GraduationActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button button108;


    Button button68;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduation);
        getSupportActionBar().setTitle("Graduation  Lectures Online");
        button108 = findViewById(R.id.button108);


        button68 = (Button) findViewById(R.id.button68);

        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(GraduationActivity.this, GradActivity.class);
                startActivity(i);

            }
        });


    }

    public void gmat(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=4G-MW4YDCl8&list=PLdM-WZokR4tY14VIoAFSEBkxJY3qcOScQ"));
        startActivity(browserIntent);

    }

    public void gama(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=NcsjSnyxWfU&list=PLpG_ISEhQ6z1FXhXOPocwIzlBCMNnfw6J"));
        startActivity(browserIntent);

    }

    public void gcom(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=xV5P205_thY&list=PLo7Pq59jpAcKw5cqQC0yREDqUFPH2uoow"));
        startActivity(browserIntent);

    }

    public void geco(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=YZ-xpxwJ_T8&list=PLlIVH9UFPr9GZM7tFDQPkntw7FLWtrYtt"));
        startActivity(browserIntent);

    }

    public void gedu(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=TZwQmDov7y0&list=PL7M-nzVML6XhPKJPLDT1AYso3ian_H3vK"));
        startActivity(browserIntent);

    }

    public void geng(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=6MG3lLO9QJs&list=PLNsppmbLKJ8KzWNRCn9G3T6LJEZEztPMa"));
        startActivity(browserIntent);

    }

    public void ggeoo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=Sq3Bh3RSUkA&list=PLQG2d3GSvQKUSN5a924hh2UlBjvp-5z77"));
        startActivity(browserIntent);

    }


    public void ggeo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=Qr7Mm-z0O-k&list=PLVJDTaS7rj9NQBOgRV77TXDWX7XItI6km"));
        startActivity(browserIntent);

    }

    public void ghin(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=2FjCbAD4eO8&list=PLNI5bqMNyTISb78Qajjmn8aQbLrvObBZZ"));
        startActivity(browserIntent);

    }


    public void ghis(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=8SsQHHCd1nQ&list=PLEsCNjd2m9_7bf1lvOMdUhZWg2lw-kScf"));
        startActivity(browserIntent);

    }


    public void gmas(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=GBqqL0wH-x8&list=PLNsppmbLKJ8IQ6pPSocBtzGh3PlA9y8NV"));
        startActivity(browserIntent);

    }


    public void gpol(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=lP-BnBR0-fU&list=PLNsppmbLKJ8KOOGzYe8WSYTNq2WCHysVN"));
        startActivity(browserIntent);

    }


    public void gsoc(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=EYbBLQ-oWus&list=PLzMGCqAlTTgjNod6ccBVDOJZWrkUqWxHa"));
        startActivity(browserIntent);

    }


    public void gurd(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=k-DZbmuz0cw&list=PL0446A5AA24DB2EEB"));
        startActivity(browserIntent);

    }

    public void gch(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=jF9tRt9g90k&list=PLL2cpUc6IcFiW7kVIVbE-2TgxxBEgajIa"));
        startActivity(browserIntent);

    }


    public void gzo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=MKBFwYlUl7M&list=PL7M-nzVML6Xh8gSMIcq0WVGVDeaXEnLEu"));
        startActivity(browserIntent);

    }


    public void gbot(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=y12Z6eSJQTE&list=PLJAzFg3PHTb3HVw18aKBsL82UGSdHGo-F"));
        startActivity(browserIntent);

    }


    public void gele(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=LljXPO3wtWA&list=PLyHNqAaJ5m-vpBCgE_o3dYPZGNPfnbrMH"));
        startActivity(browserIntent);

    }


    public void gbio(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=CHJsaq2lNjU&list=PL6HWcp6vi-OmzBcmlS0S8Z8P54M21UHWc"));
        startActivity(browserIntent);

    }


    public void gesc(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=LE9KTG9PFho&list=PLbdYxxrUK8jZqtCk9hzDZoxQGJ-HkRX_i"));
        startActivity(browserIntent);

    }


    public void ghor(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=FYAO5R9_Lsw&list=PLeIBUU7EX5WjurIp8V_vwKVEiqsVEK-49"));
        startActivity(browserIntent);

    }


    public void gph(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=_ZzE-QCCtW8&list=PL2EH1HzOamftLp6sWHMDB25AaRM72xUdX"));
        startActivity(browserIntent);

    }


    public void gph2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=uStGuyqFCwU&list=PL6DDB2A18614F2FCA"));
        startActivity(browserIntent);

    }


    public void genn(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=iKE9mjIVeik&list=PL6zKLAqTq5peLon71V2ZDTLuhKNlW4PYl"));
        startActivity(browserIntent);

    }


    public void chem2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=FB4H7l7RSYM&list=PL4v9kxKNeRD7Z90dnqygYMeBoiQAGNRWj"));
        startActivity(browserIntent);

    }


}




































