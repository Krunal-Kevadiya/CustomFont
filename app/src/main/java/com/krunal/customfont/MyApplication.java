package com.krunal.customfont;

import android.app.Application;

import com.kevadiyakrunalk.customfont.CustomFontConfig;
import com.krunal.customfont.font.CustomViewWithTypefaceSupport;
import com.krunal.customfont.font.TextField;

public class MyApplication extends Application {//MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }

    public void initFont() {
        CustomFontConfig.Builder builder = new CustomFontConfig.Builder();
        //builder.setDefaultFontPath("fonts/Roboto-ThinItalic.ttf");
        builder.setFontAttrId(R.attr.fontPath);
        builder.addCustomViewWithSetTypeface(CustomViewWithTypefaceSupport.class);
        builder.addCustomStyle(TextField.class, R.attr.textFieldStyle);

        CustomFontConfig.initDefault(builder.build());
    }
}
