package com.workshop.androidwidgets.ui.webview;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.ui.base.BaseActivity;
import com.workshop.androidwidgets.utils.UiUtils;

public class WebViewActivity extends BaseActivity {

    private EditText edtAddress;
    private WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        getSupportActionBar().setTitle("WebView Tutorial");

        edtAddress = findViewById(R.id.edt_address);
        webView = findViewById(R.id.webview);
        setupWebView();
    }

    private void setupWebView() {
        WebSettings webSettings = webView.getSettings();

        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
    }

    public void onLoadClicked(View view) {
        if (TextUtils.isEmpty(edtAddress.getText().toString())) {
            UiUtils.showToast(this, "Please enter valid address...");
            return;
        }
        webView.loadUrl(edtAddress.getText().toString());
    }

}
