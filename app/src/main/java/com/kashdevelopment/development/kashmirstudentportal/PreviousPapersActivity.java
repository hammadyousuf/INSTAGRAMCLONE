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

public class PreviousPapersActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button button112;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_papers);
        getSupportActionBar().setTitle("PreviousPapers");







    }


    public void kpapers(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.kashmiruniversity.net/papers.aspx"));
        startActivity(browserIntent);


    }
    public void BED(View view) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse
                            ("https://kashmirpulse.com/edupedia/model-papers/previous-question-" +
                                    "papers-b-ed-examination-university-kashmir/26628.html"));
            startActivity(browserIntent);

        }


    public void kas(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.examrace.com/SPSC/Jammu-and-Kashmir-PSC/KAS-Exam-Papers/Prelims/"));
        startActivity(browserIntent);

    }


    public void ignousp(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse
                        ("https://webservices.ignou.ac.in/Pre-Question/"));
        startActivity(browserIntent);

    }

    public void bosep(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://kashmirpulse.com/edupedia/model-papers/jkbose-class-12th-model-papers-2017/25489.html"));
        startActivity(browserIntent);

    }




}

