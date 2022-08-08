package com.example.mmehs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class HomePage extends AppCompatActivity {
 WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        w = findViewById(R.id.webA);

        WebSettings webSettings =w.getSettings();
        webSettings.setJavaScriptEnabled(true);
        w.loadUrl("https://www.mmehs.com");
        w.setWebViewClient(new WebViewClient());
    }
}