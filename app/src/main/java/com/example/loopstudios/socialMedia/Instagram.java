package com.example.loopstudios.socialMedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.loopstudios.R;

public class Instagram extends AppCompatActivity {

    private WebView socialMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        socialMedia = findViewById(R.id.socialMedia);
        socialMedia.loadUrl("https://www.instagram.com/thirzq/");
    }
}