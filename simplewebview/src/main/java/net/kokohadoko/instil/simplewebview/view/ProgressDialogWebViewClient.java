package net.kokohadoko.instil.simplewebview.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 *
 * @author katsuya
 * @since 1.0.0
 */
public class ProgressDialogWebViewClient extends WebViewClient {

    private ProgressDialog progressDialog;

    /**
     * constructer
     *
     * @param context context
     * @param message message of progress dialog
     */
    public ProgressDialogWebViewClient(Context context, String message) {
        super();

        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(message);
    }

    @Override
    public void onPageStarted(WebView webView, String url, Bitmap favicon) {
        super.onPageStarted(webView, url, favicon);
        progressDialog.show();
    }

    @Override
    public void onPageFinished(WebView webView, String url) {
        super.onPageFinished(webView, url);
        progressDialog.dismiss();
    }
}
