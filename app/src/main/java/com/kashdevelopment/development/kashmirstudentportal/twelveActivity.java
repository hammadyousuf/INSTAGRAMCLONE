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

public class twelveActivity extends AppCompatActivity {

    Button button66;

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);
        getSupportActionBar().setTitle("12th Lectures Online");




        button66=(Button) findViewById(R.id.button66);

        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it =new Intent(twelveActivity.this,tenth12thnotesActivity.class);
                startActivity(it);
            }
        });

    }
      public void eng12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=z7ZRBC8dUEs&list=PL9vL8QnJ37pKMn-EDikojIgfxXm8eyNvg"));
        startActivity(browserIntent);
        }

    public void phy12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=BjkzTGFgqxs&list=PLIQkEkEOvayLNLWXsCcQRpBWTUBiByh6_"));
        startActivity(browserIntent);
    }
    public void che12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=Ie7353tICaY&list=PLIQkEkEOvayKRrhSlWdO9_Vu6YgXNSqEQ"));
        startActivity(browserIntent);
    }

    public void bio12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=_nY48um5vsU&list=PLbqaIHr86HDFiGKqx6qj5OrVLkc4Qvcl9"));
        startActivity(browserIntent);
    }

    public void mat12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=Uw78QGAUCEk&list=PLJZk2__oyAljXOnYsLYoY9GKl5ImQ0Iey"));
        startActivity(browserIntent);
    }

    public void uru12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=GCU_V08U2hQ&list=PL1F0978C2482B8F5C"));
        startActivity(browserIntent);
    }

    public void chemi12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=Y1BnCHJAB98&list=PLZFRrHYYcHFpdv3Curbm1bx8doQpyNKAI"));
        startActivity(browserIntent);
    }


    public void pol12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=gS9JaN_nFhA&list=PLjIyhHpFdJbiiuO7Z73G8jZfEdH0v8V2n"));
        startActivity(browserIntent);
    }
    public void his12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=uzAXg5f_YzQ&list=PLm4mHNnXLSkWxmBpLO0gt3P4gBGjDnVuU"));
        startActivity(browserIntent);
    }
    public void eco12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=kJWUOG2kRsk&list=PLgC10_Xv-BGg5n3YU6oEV7_HIzBuEbbOz"));
        startActivity(browserIntent);
    }
    public void e12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=6M0EvoKem-E&list=PLNsppmbLKJ8KvS7zkl3Y4NLj89Ea_YxYW"));
        startActivity(browserIntent);
    }
    public void ara12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=Nshil-6uOJE&list=PLIE2yVt5Dy5hy94N9b_xCW0QRYYLIm_usv"));
        startActivity(browserIntent);
    }


}


