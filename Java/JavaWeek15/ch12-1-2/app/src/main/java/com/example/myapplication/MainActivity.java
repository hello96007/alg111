package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private WebView web;
    private EditText txturl;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = (WebView) findViewById(R.id.webview);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        web.setWebChromeClient(new WebChromeClient()
        {
            @Override
            public void onProgressChanged(WebView view,int progress)
            {
                progressBar.setProgress(progress);
                super.onProgressChanged(view,progress);
            }
        });
      //  txturl  = (EditText)findViewById(R.id.text);
        txturl = (EditText) findViewById(R.id.text);
        String str = txturl.getText().toString();
        web.loadUrl(str);

        web.getSettings().setJavaScriptEnabled(true);
        web.setScrollBarStyle(
                View.SCROLLBARS_INSIDE_OVERLAY);
        web.setWebViewClient(new myWebView());


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

    @Override
    public void onBackPressed()
    {
        if(web.canGoBack())
        {
            web.goBack();
            return;
        }
        super.onBackPressed();
    }
    public void button_Click(View view)
    {
        String strUrl = txturl.getText().toString();
        web.loadUrl(strUrl);
    }
}