package com.sample.simplewebview.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.kokohadoko.instil.simplewebview.SimpleWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleWebView simpleWebView = new SimpleWebView(this, "https://www.facebook.com/instil.kokohadoko.net/");
        simpleWebView.setTitle("this is test");
        simpleWebView.setLoadText("読み込み中");
        simpleWebView.startWebViewActivity();
    }
}
