package com.example.chenwenping.androidandh5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
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

        WebView webView1 = (WebView) findViewById(R.id.web1);
        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView1.addJavascriptInterface(new JsInterface(getApplicationContext()), "control");

        webView.loadUrl("file：///android_asset/demo1.html");




    }
}
