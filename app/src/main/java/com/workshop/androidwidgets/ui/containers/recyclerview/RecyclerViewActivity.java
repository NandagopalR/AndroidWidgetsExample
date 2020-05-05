package com.workshop.androidwidgets.ui.containers.recyclerview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.model.UserModel;
import com.workshop.androidwidgets.ui.base.BaseActivity;
import com.workshop.androidwidgets.ui.containers.recyclerview.adapter.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends BaseActivity implements SimpleAdapter.ClickListener {

    private SimpleAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        getSupportActionBar().setTitle("RecyclerView Tutorial");

        RecyclerView recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        adapter = new SimpleAdapter(this);
        recyclerview.setAdapter(adapter);

        loadUserList();
    }

    private void loadUserList() {
        List<UserModel> userModelList = new ArrayList<>();

        String[] userNames = getResources().getStringArray(R.array.user_names);
        String[] userDesig = getResources().getStringArray(R.array.user_designation);
        String[] userLocations = getResources().getStringArray(R.array.user_location);
        for (int i = 0, size = userNames.length; i < size; i++) {
            userModelList.add(new UserModel(userNames[i], userDesig[i], userLocations[i]));
        }
        adapter.setUserModelList(userModelList);
    }

    @Override
    public void onUserClicked(UserModel model) {
        startActivity(DetailActivity.getCallingIntent(this, model.getName(), model.getDesignation(), model.getLocation()));
    }
}
