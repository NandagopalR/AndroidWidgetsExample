package com.workshop.androidwidgets.ui.imageview;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.ui.base.BaseActivity;

import java.util.Random;

public class ImageViewActivity extends BaseActivity {

    private ImageView imageView;

    private int[] colors = new int[]{R.color.colorPrimary, R.color.colorPrimaryDark, R.color.colorAccent,
            R.color.colorRed, R.color.colorBlue, R.color.colorGrey,};

    private int[] images = new int[]{R.drawable.android_logo, R.drawable.apple_logo, R.drawable.google_logo};

    private ImageView.ScaleType[] scaleTypes = new ImageView.ScaleType[]{ImageView.ScaleType.CENTER, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.CENTER_CROP,};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        getSupportActionBar().setTitle("ImageView Tutorial");

        imageView = findViewById(R.id.imageView);
    }

    public void onClickOfImageActions(View view) {
        switch (view.getId()) {
            case R.id.btn_img_scaletype:
                ImageView.ScaleType scaleResource = scaleTypes[new Random().nextInt(scaleTypes.length)];
                imageView.setScaleType(scaleResource);
                break;
            case R.id.btn_change_image:
                int imageResource = images[new Random().nextInt(images.length)];
                imageView.setImageResource(imageResource);
                break;
            case R.id.btn_change_bg:
                int colorResource = colors[new Random().nextInt(colors.length)];
                imageView.setBackgroundColor(ContextCompat.getColor(this, colorResource));
                break;
        }
    }

}
