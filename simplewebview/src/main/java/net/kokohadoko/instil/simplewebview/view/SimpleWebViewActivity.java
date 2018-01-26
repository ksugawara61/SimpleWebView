package net.kokohadoko.instil.simplewebview.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import net.kokohadoko.instil.simplewebview.R;

/**
 * WebView Activity
 *
 * @author katsuya
 * @since 1.0.0
 */
public class SimpleWebViewActivity extends AppCompatActivity {

    private String url;
    private String title;

    /**
     * onCreate
     *
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplewebview);

        Intent intent = getIntent();
        url   = intent.getStringExtra("url");
        title = intent.getStringExtra("title");

        // load webview
        WebView webView = findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new ProgressDialogWebViewClient(this, "this is test"));
        webView.loadUrl(url);
    }

    /**
     * seting menu bar
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);  // 左上メニューボタン表示
        }
        return true;
    }

    /**
     * event of menu button tap
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
