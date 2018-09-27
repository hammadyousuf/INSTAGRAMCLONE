package com.kashdevelopment.development.kashmirstudentportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class gamesActivity extends AppCompatActivity {
    private WebView webView;



    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    private AdView mAdView;
    private Button button115;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        getSupportActionBar().setTitle("Play and Win");










        webView = (WebView) findViewById(R.id.gamesv);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.poki.com/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.getAllowContentAccess();
        webSettings.supportMultipleWindows();
        webSettings.supportZoom();
        webSettings.setDisplayZoomControls(true);
        webSettings.setAllowFileAccess(true);


}


}
