package com.example.chenwenping.androidandh5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.web);
       // webView.loadUrl("http://bbs.csdn.net/topics/350165433");


        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new MyjavaScriptInterface(getApplicationContext()), "Android");
        webView.loadUrl("file：///android_asset/demo.html");




    }
}
