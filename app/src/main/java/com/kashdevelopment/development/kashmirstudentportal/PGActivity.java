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

public class PGActivity extends AppCompatActivity {


    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button button111;

    Button button67;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg);
        getSupportActionBar().setTitle("PG  Lectures Online");











        button67=(Button)findViewById(R.id.button67);

        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it =new Intent(PGActivity.this,notespgmedbedActivity.class);
                startActivity(it);
            }
        });



    }
    public void eng(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=HiqTvv3BjE8&list=PL9QS4mSP_yrYMLBm7ykk5Y7M_P6qQ2765"));
        startActivity(browserIntent);

    }
    public void eco(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=zLe-n5dngbE&list=PLB911CE409B4F3F5A"));
        startActivity(browserIntent);

    }
    public void uru(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=k-DZbmuz0cw&list=PL0446A5AA24DB2EEB"));
        startActivity(browserIntent);

    }
    public void edu(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=KNx3tbcpAjI&list=PLWnkkL_58T8nmkDUW1uc43s1WhJI1fO5d"));
        startActivity(browserIntent);

    }
    public void his(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=8SsQHHCd1nQ&list=PLEsCNjd2m9_7bf1lvOMdUhZWg2lw-kScf"));
        startActivity(browserIntent);

    }

    public void isl(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=IJBkpx4C8A4&list=PL0FF1F26AA9AD7F95"));
        startActivity(browserIntent);

    }
    public void mat(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=yYH8Ro0BAtc&list=PLktE8rb6pVnjrRxu-PJidswoM_CbdLh0-"));
        startActivity(browserIntent);

    }
    public void eng2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=l9z4jWp8U3Y&list=PLdoRvRuvlOS3ZOgZV3_D_XTYwwX_OX9YO"));
        startActivity(browserIntent);

    }
    public void bio(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=78ONLxs1Cpc&list=PLFX_EwFvKKWOwodDG9WRrOQksvKFgVcla"));
        startActivity(browserIntent);

    }
    public void mca(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=tpIctyqH29Q&list=PL8dPuuaLjXtNlUrzyH5r6jN9ulIgZBpdo"));
        startActivity(browserIntent);

    }
    public void che(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=JLzs0vf9sZ0&list=PL9jo2wQj1WCPG-fRIqIETBanxg9R7jCYJ"));
        startActivity(browserIntent);

    }
    public void mba(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=6jobOJy96jM&list=PLmrZooTDUg_cn8zjg7S1dbfgfOnocpljY"));
        startActivity(browserIntent);

    }
    public void zoo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=Lw5A1On-sGs&list=PLxeUX6YwhG33igTbZzoyDsyy4Uui6UhiF"));
        startActivity(browserIntent);

    }
    public void bot(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=Xs8a_7IWWeM&list=PLHaUAPm6keR_vV2ui8GJ8Zn9w5qdaNv1H"));
        startActivity(browserIntent);

    }

    public void phy(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=uStGuyqFCwU&list=PL6DDB2A18614F2FCA"));
        startActivity(browserIntent);

    }
    public void mit(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=5Dg-y-72bJk&list=PLpNuEnrifZ1mrLELZyBfTFBicR6ZOYQZv"));
        startActivity(browserIntent);

    }
    public void geo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=SMPO60DOTKQ&list=PLAMBum9_RkuNDtzpNQlCRcaOrNqrD4Gf7"));
        startActivity(browserIntent);

    }
    public void hin(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=2FjCbAD4eO8&list=PLNI5bqMNyTISb78Qajjmn8aQbLrvObBZZ"));
        startActivity(browserIntent);

    }
    public void pol(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=lP-BnBR0-fU&list=PLNsppmbLKJ8KOOGzYe8WSYTNq2WCHysVN"));
        startActivity(browserIntent);

    }
    public void soc(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=Tf7xXXSSdro&list=PLNsppmbLKJ8LFZwa-kQvvdZo0q0XGSufX"));
        startActivity(browserIntent);

    }
    public void phs(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=aNySINeqLFM&list=PLC6C680249272DFFC"));
        startActivity(browserIntent);

    }
    public void mcom(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=ejrKEv9DIos&list=PLVRKQWHHTPX9zf4JyQdCE0TQYb6ZEBVga"));
        startActivity(browserIntent);

    }


}
