package com.example.loopstudios.listActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.loopstudios.R;

public class aot extends AppCompatActivity {

    private ImageView image_desc;
    private TextView long_desc, name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aot);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        initView();

        long_desc.setText(R.string.aot);
        image_desc.setImageResource(R.drawable.aot);
        name.setText("Attack Of Titan");






    }

    private void initView() {
        long_desc = findViewById(R.id.long_desc);
        name = findViewById(R.id.name);
        image_desc = findViewById(R.id.image_desc);
    }
}