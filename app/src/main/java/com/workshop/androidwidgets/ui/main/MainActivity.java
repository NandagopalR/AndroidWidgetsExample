package com.workshop.androidwidgets.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.ui.containers.recyclerview.RecyclerViewActivity;
import com.workshop.androidwidgets.ui.containers.viewpager.ViewPagerActivity;
import com.workshop.androidwidgets.ui.edittext.EditTextActivity;
import com.workshop.androidwidgets.ui.imageview.ImageViewActivity;
import com.workshop.androidwidgets.ui.radiogroup.RadioGroupActivity;
import com.workshop.androidwidgets.ui.textview.TextViewActivity;
import com.workshop.androidwidgets.ui.videoview.VideoViewActivity;
import com.workshop.androidwidgets.ui.webview.WebViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTextView;
    private Button btnEditText;
    private Button btnImageView;
    private Button btnRadioGroup;
    private Button btnWebView;
    private Button btnVideoView;
    private Button btnRecyclerview;
    private Button btnViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (btnTextView = findViewById(R.id.btn_textview)).setOnClickListener(this);
        (btnEditText = findViewById(R.id.btn_edittext)).setOnClickListener(this);
        (btnImageView = findViewById(R.id.btn_imageview)).setOnClickListener(this);
        (btnRadioGroup = findViewById(R.id.btn_radiogroup)).setOnClickListener(this);
        (btnWebView = findViewById(R.id.btn_webview)).setOnClickListener(this);
        (btnVideoView = findViewById(R.id.btn_videoview)).setOnClickListener(this);
        (btnRecyclerview = findViewById(R.id.btn_recyclerview)).setOnClickListener(this);
        (btnViewPager = findViewById(R.id.btn_viewpager)).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_textview:
                intent = new Intent(this, TextViewActivity.class);
                break;
            case R.id.btn_edittext:
                intent = new Intent(this, EditTextActivity.class);
                break;
            case R.id.btn_imageview:
                intent = new Intent(this, ImageViewActivity.class);
                break;
            case R.id.btn_radiogroup:
                intent = new Intent(this, RadioGroupActivity.class);
                break;
            case R.id.btn_webview:
                intent = new Intent(this, WebViewActivity.class);
                break;
            case R.id.btn_videoview:
                intent = new Intent(this, VideoViewActivity.class);
                break;
            case R.id.btn_recyclerview:
                intent = new Intent(this, RecyclerViewActivity.class);
                break;
            case R.id.btn_viewpager:
                intent = new Intent(this, ViewPagerActivity.class);
                break;
        }
        startActivity(intent);
    }
}
