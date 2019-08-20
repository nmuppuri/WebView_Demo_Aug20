package com.example.webview_demo_aug20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit_url;
    Button btn_load;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_url = findViewById(R.id.edit_url);
        btn_load = findViewById(R.id.btn_load);
        webview = findViewById(R.id.webview);

        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = edit_url.getText().toString();

                webview.getSettings().setLoadsImagesAutomatically(true);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

                webview.loadUrl(url);
            }
        });
    }
}
