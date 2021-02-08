package com.example.fake_google;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bat;
    EditText et;
    WebView wV;
    String stringUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bat = (Button) findViewById(R.id.button);
        et = (EditText) findViewById(R.id.et);
        wV = (WebView) findViewById(R.id.wbV);
        wV.getSettings().setJavaScriptEnabled(true);
        wV.setWebViewClient(new MyWebViewClient());
    }

    public void go(View view) {
        stringUrl = et.getText().toString();
        wV.loadUrl(stringUrl);

    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(stringUrl);
            return true;

        }
    }
}