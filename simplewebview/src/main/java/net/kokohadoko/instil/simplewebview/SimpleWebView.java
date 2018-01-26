package net.kokohadoko.instil.simplewebview;

import android.content.Context;
import android.content.Intent;

import net.kokohadoko.instil.simplewebview.view.SimpleWebViewActivity;

/**
 * SimpleWebView
 *
 * @author katsuya
 * @since 1.0.0
 */
public class SimpleWebView {

    private Context context = null;
    private String url = null;
    private String title = "";
    private String loadText = "Now loading...";

    /**
     * constructer
     *
     * @param context context
     * @param url display url using webview
     */
    public SimpleWebView(Context context, String url) {
        this.context = context;
        this.url = url;
    }

    /**
     * constructer
     *
     * @param url display url using webview
     * @param title title of webview
     */
    public SimpleWebView(Context context, String url, String title) {
        this.context = context;
        this.url = url;
        this.title = title;
    }

    /**
     * start web view activity
     */
    public void startWebViewActivity() {
        Intent intent = new Intent(context, SimpleWebViewActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("url", url);
        context.startActivity(intent);
    }

}
