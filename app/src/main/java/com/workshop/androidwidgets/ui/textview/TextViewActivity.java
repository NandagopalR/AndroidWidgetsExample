package com.workshop.androidwidgets.ui.textview;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.ui.base.BaseActivity;
import com.workshop.androidwidgets.utils.UiUtils;

import java.util.Random;

public class TextViewActivity extends BaseActivity implements View.OnClickListener {

    private TextView tvTextView;
    private String techNames[];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texiview);
        getSupportActionBar().setTitle("TextView Tutorial");

        techNames = getResources().getStringArray(R.array.tech_names);
        tvTextView = findViewById(R.id.tut_textView);
        Button btnGetText = findViewById(R.id.btn_get);
        Button btnChangeText = findViewById(R.id.btn_change_txt);
        btnGetText.setOnClickListener(this);
        btnChangeText.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_change_txt:
                String randomString = techNames[new Random().nextInt(techNames.length)];
                tvTextView.setText(randomString);
                break;
            case R.id.btn_get:
                if (TextUtils.isEmpty(tvTextView.getText())) {
                    return;
                }
                UiUtils.showToast(this, tvTextView.getText().toString());
                break;
        }
    }
}
