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
    private String loadText = Constant.DEFAULT_LOADING_TEXT;

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
     * menubar title setting
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * loading dialog text setting
     */
    public void setLoadText(String loadText) {
        this.loadText = loadText;
    }

    /**
     * start web view activity
     */
    public void startWebViewActivity() {
        Intent intent = new Intent(context, SimpleWebViewActivity.class);
        intent.putExtra(Constant.URL_KEY, url);
        intent.putExtra(Constant.TITLE_KEY, title);
        intent.putExtra(Constant.LOADING_KEY, loadText);
        context.startActivity(intent);
    }

}
