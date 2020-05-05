package com.workshop.androidwidgets.ui.containers.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.app.AppConstants;
import com.workshop.androidwidgets.ui.base.BaseActivity;

public class DetailActivity extends BaseActivity {

    public static Intent getCallingIntent(Context context, String name, String designation, String locaion) {
        return new Intent(context, DetailActivity.class)
                .putExtra(AppConstants.USER_NAME, name)
                .putExtra(AppConstants.USER_DESIGNATION, designation)
                .putExtra(AppConstants.USER_LOCAITON, locaion);
    }

    private String name;
    private String designation;
    private String location;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getIntent() != null) {
            name = getIntent().getStringExtra(AppConstants.USER_NAME);
            designation = getIntent().getStringExtra(AppConstants.USER_DESIGNATION);
            location = getIntent().getStringExtra(AppConstants.USER_LOCAITON);
        }

        TextView tvName = findViewById(R.id.tv_username);
        TextView tvDesig = findViewById(R.id.tv_desig);
        TextView tvLocaiton = findViewById(R.id.tv_locaiton);

        tvName.setText(name);
        tvDesig.setText(designation);
        tvLocaiton.setText(location);

    }
}
