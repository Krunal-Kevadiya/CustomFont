package com.krunal.customfont.font;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.krunal.customfont.R;

public class TextField extends TextView {

    public TextField(final Context context, final AttributeSet attrs) {
        super(context, attrs, R.attr.textFieldStyle);
    }

}
