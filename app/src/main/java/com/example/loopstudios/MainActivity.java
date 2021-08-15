package com.example.loopstudios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.loopstudios.listActivity.aot;
import com.example.loopstudios.listActivity.arcade;
import com.example.loopstudios.socialMedia.Facebook;
import com.example.loopstudios.socialMedia.Instagram;
import com.example.loopstudios.socialMedia.Pinterest;
import com.example.loopstudios.socialMedia.Twitter;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private RelativeLayout relativeLayout, relInteractive, relDeepEarth;
    private RelativeLayout relNightArcade, relSoccerTeam, relGrid, relAbove;
    private RelativeLayout relBorealis, relFisheye, relFooter, relCuriosity;
    private RelativeLayout relaot, reldate, relbeach, relburger, relcoca;
    private RelativeLayout relgradient, relnoragami, relsao;
    private LinearLayout linear1, linear2, linear3, linear4, linear5, linear6, linear7, linear8, linear9, linear10, linear11;
    private ImageButton icon_hamburger, facebook, twitter, pinterest, instagram, arrow_up;
    private ImageView image_hero, logo, image_interactive, image_deep_earth;
    private ImageView image_night_arcade, image_soccer_team, image_grid, image_from_above;
    private ImageView image_pocket_borealis, image_curiosity, image_fisheye;
    private ImageView image_date, image_aot, image_beach, image_burger;
    private ImageView image_coca, image_gradient, image_noragami, image_sao;
    private ImageView bgBlack, logo2;
    private Button see_all;
    private TextView immersive, leader, founded, deep_earth, night_arcade;
    private TextView soccer_team, grid, borealis, above, curiosity, fisheye;
    private TextView about, careers, events, products, support, license;
    private TextView aboutFooter, careersFooter, eventsFooter, supportFooter, productFooter;
    private TextView aot, date, beach, burger, coca;
    private TextView gradient, noragami, sao;
    private Menu option_1, option_2, option_3, option_4, option_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
        decorView.setSystemUiVisibility(uiOptions);

        initView();
        socialmedia();
        //TODO: bug on landscape


        icon_hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu = new PopupMenu(MainActivity.this, icon_hamburger);
                menu.getMenuInflater().inflate(R.menu.dropdown, menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        return false;
                    }
                });

                menu.show();
            }
        });


        see_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Started");

                see_all.setVisibility(View.GONE);
                relaot.setVisibility(View.VISIBLE);
                relbeach.setVisibility(View.VISIBLE);
                reldate.setVisibility(View.VISIBLE);
                relnoragami.setVisibility(View.VISIBLE);
                relsao.setVisibility(View.VISIBLE);
                relgradient.setVisibility(View.VISIBLE);
                relcoca.setVisibility(View.VISIBLE);
                relburger.setVisibility(View.VISIBLE);
                arrow_up.setVisibility(View.VISIBLE);
            }
        });

        arrow_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Started");

                see_all.setVisibility(View.VISIBLE);
                relaot.setVisibility(View.GONE);
                relbeach.setVisibility(View.GONE);
                reldate.setVisibility(View.GONE);
                relnoragami.setVisibility(View.GONE);
                relsao.setVisibility(View.GONE);
                relgradient.setVisibility(View.GONE);
                relcoca.setVisibility(View.GONE);
                relburger.setVisibility(View.GONE);
                arrow_up.setVisibility(View.GONE);
            }
        });



        relaot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.loopstudios.listActivity.aot.class);
                startActivity(intent);
            }
        });

        relNightArcade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, arcade.class);
            }
        });


    }
    public void socialmedia() {
        pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pinterest.class);
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Facebook.class);
                startActivity(intent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Twitter.class);
                startActivity(intent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Instagram.class);
                startActivity(intent);
            }
        });
    }


    public void initView() {
        Log.d(TAG, "initView: Started");

        relativeLayout = findViewById(R.id.relativeLayout);
        relInteractive = findViewById(R.id.relInteractive);
        relDeepEarth = findViewById(R.id.relDeepEarth);
        relNightArcade = findViewById(R.id.relNightArcade);
        relSoccerTeam = findViewById(R.id.relSoccerTeam);
        relGrid = findViewById(R.id.relGrid);
        relCuriosity = findViewById(R.id.relCuriosity);
        relAbove = findViewById(R.id.relAbove);
        relBorealis = findViewById(R.id.relBorealis);
        relFisheye = findViewById(R.id.relFisheye);
        relFooter = findViewById(R.id.relFooter);
        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        icon_hamburger = findViewById(R.id.icon_hamburger);
        facebook = findViewById(R.id.facebook);
        twitter = findViewById(R.id.twitter);
        pinterest = findViewById(R.id.pinterest);
        instagram = findViewById(R.id.instagram);
        image_hero = findViewById(R.id.image_hero);
        logo = findViewById(R.id.logo);
        image_interactive = findViewById(R.id.image_interactive);
        image_deep_earth = findViewById(R.id.image_deep_earth);
        image_night_arcade = findViewById(R.id.image_night_arcade);
        image_soccer_team = findViewById(R.id.image_soccer_team);
        image_grid = findViewById(R.id.image_grid);
        image_from_above = findViewById(R.id.image_from_above);
        image_pocket_borealis = findViewById(R.id.image_pocket_borealis);
        image_curiosity = findViewById(R.id.image_curiosity);
        image_fisheye = findViewById(R.id.image_fisheye);
        bgBlack = findViewById(R.id.bgBlack);
        logo2 = findViewById(R.id.logo2);
        see_all = findViewById(R.id.see_all);
        immersive = findViewById(R.id.immersive);
        leader = findViewById(R.id.leader);
        founded = findViewById(R.id.founded);
        deep_earth = findViewById(R.id.deep_earth);
        night_arcade = findViewById(R.id.night_arcade);
        soccer_team = findViewById(R.id.soccer_team);
        grid = findViewById(R.id.grid);
        borealis = findViewById(R.id.borealis);
        above = findViewById(R.id.above);
        curiosity = findViewById(R.id.curiosity);
        fisheye = findViewById(R.id.fisheye);
        about = findViewById(R.id.about);
        careers = findViewById(R.id.careers);
        events = findViewById(R.id.events);
        products = findViewById(R.id.products);
        support = findViewById(R.id.support);
        license = findViewById(R.id.license);
        linear4 = findViewById(R.id.linear4);
        linear5 = findViewById(R.id.linear5);
        linear6 = findViewById(R.id.linear6);
        linear7 = findViewById(R.id.linear7);
        linear8 = findViewById(R.id.linear8);
        aboutFooter = findViewById(R.id.aboutFooter);
        careersFooter = findViewById(R.id.careersFooter);
        productFooter = findViewById(R.id.productsFooter);
        eventsFooter = findViewById(R.id.eventsFooter);
        supportFooter = findViewById(R.id.supportFooter);
        relaot = findViewById(R.id.relaot);
        image_aot = findViewById(R.id.image_aot);
        aot = findViewById(R.id.aot);
        reldate = findViewById(R.id.reldate);
        image_date = findViewById(R.id.image_date);
        date = findViewById(R.id.date);
        relbeach = findViewById(R.id.relbeach);
        image_beach = findViewById(R.id.image_beach);
        beach = findViewById(R.id.beach);
        relburger = findViewById(R.id.relburger);
        image_burger = findViewById(R.id.image_burger);
        burger = findViewById(R.id.burger);
        relcoca = findViewById(R.id.relcoca);
        image_coca = findViewById(R.id.image_coca);
        coca = findViewById(R.id.coca);
        relgradient = findViewById(R.id.relgradient);
        image_gradient = findViewById(R.id.image_gradient);
        gradient = findViewById(R.id.gradient);
        relnoragami = findViewById(R.id.relnoragami);
        image_noragami = findViewById(R.id.image_noragami);
        noragami = findViewById(R.id.noragami);
        relsao = findViewById(R.id.relsao);
        image_sao = findViewById(R.id.image_sao);
        sao = findViewById(R.id.sao);
        linear9 = findViewById(R.id.linear9);
        linear10 = findViewById(R.id.linear10);
        linear11 = findViewById(R.id.linear11);
        option_1 = findViewById(R.id.option_1);
        option_2 = findViewById(R.id.option_2);
        option_3 = findViewById(R.id.option_3);
        option_4 = findViewById(R.id.option_4);
        option_5 = findViewById(R.id.option_5);
        arrow_up = findViewById(R.id.arrow_up);

    }

}