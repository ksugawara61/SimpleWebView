package com.sample.simplewebview.sample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.kokohadoko.instil.simplewebview.SimpleWebView;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private EditText urlText;
    private EditText titleText;
    private EditText loadText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        urlText = findViewById(R.id.url);
        titleText = findViewById(R.id.title);
        loadText = findViewById(R.id.load_text);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = urlText.getText().toString();
                String title = titleText.getText().toString();
                String load = loadText.getText().toString();

                SimpleWebView simpleWebView = new SimpleWebView(context, url);
                simpleWebView.setTitle(title);
                simpleWebView.setLoadText(load);
                simpleWebView.startWebViewActivity();
            }
        });
    }
}
