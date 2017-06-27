package com.example.cn.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        WebView webView = (WebView)this.findViewById(R.id.webview);

        webView.loadUrl("http://www.163.com");

    }
}
