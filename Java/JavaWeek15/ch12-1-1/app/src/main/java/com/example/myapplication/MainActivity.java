package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private WebView web;
    private EditText txturl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = (WebView) findViewById(R.id.webview);

        web.getSettings().setJavaScriptEnabled(true);
        web.setScrollBarStyle(
                View.SCROLLBARS_INSIDE_OVERLAY);
        web.setWebViewClient(new myWebView());
        txturl = (EditText) findViewById(R.id.text);
        String str = txturl.getText().toString();
        web.loadUrl(str);

    }

    private class myWebView extends WebViewClient {
        @SuppressWarnings("deprecation")
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url)
        {
            web.loadUrl(url);
            return true;
        }
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
        {
            web.loadUrl(request.getUrl().toString());
            return true;
        }

    }
    public void button_Click(View view)
    {
        String strUrl = txturl.getText().toString();
        web.loadUrl(strUrl);
    }
}