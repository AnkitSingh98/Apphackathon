package com.ankithacks.apphackathon;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class livestream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livestream);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://192.168.137.1:7000");
        final WebSettings settings=myWebView.getSettings();
        settings.setJavaScriptEnabled(true);

        Button button= (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            @SuppressWarnings("MissingPermission")

            public void onClick(View arg0) {

                String posted_by = "100";
                String uri = "tel:" + posted_by.trim();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(uri));
                startActivity(intent);


 }

        });


    }

    public void start(View view)
    {
        finish();
       // System.exit(0);

    }
}
