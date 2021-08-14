package com.example.loopstudios.listActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.loopstudios.R;

public class gradient extends AppCompatActivity {

    private TextView long_desc, name;
    private ImageView image_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aot);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        initView();
    }

    public void initView() {
        long_desc = findViewById(R.id.long_desc);
        name = findViewById(R.id.name);
        image_desc = findViewById(R.id.image_desc);
    }
}