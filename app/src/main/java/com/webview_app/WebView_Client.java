package com.webview_app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebView_Client extends WebViewClient {
    private Activity activity = null;
    public WebView_Client(Activity activity) {
        this.activity = activity;
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if(url.contains("google.com.br")) return false;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }
}