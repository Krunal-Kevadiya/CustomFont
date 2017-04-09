package com.krunal.customfont;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kevadiyakrunalk.customfont.CustomFontContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CustomFontContextWrapper.wrap(newBase));
    }
}
