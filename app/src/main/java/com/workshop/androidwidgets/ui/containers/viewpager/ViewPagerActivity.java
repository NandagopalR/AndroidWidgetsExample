package com.workshop.androidwidgets.ui.containers.viewpager;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.ui.base.BaseActivity;

import static androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;

public class ViewPagerActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        getSupportActionBar().setTitle("ViewPager Tutorial");

        CustomPagerAdapter pagerAdapter = new CustomPagerAdapter(getSupportFragmentManager(), BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        ViewPager viewPager = findViewById(R.id.pager);

        viewPager.setAdapter(pagerAdapter);
    }
}
