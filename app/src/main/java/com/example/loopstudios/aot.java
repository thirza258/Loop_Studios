package com.example.loopstudios;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class aot extends AppCompatActivity {

    private ImageView image_desc;
    private TextView long_desc, name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aot);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getActionBar();
        actionBar.hide();

        initView();


    }

    private void initView() {
        long_desc = findViewById(R.id.long_desc);
        name = findViewById(R.id.name);
        image_desc = findViewById(R.id.image_desc);
    }
}