package com.workshop.androidwidgets.ui.containers.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder> {

    private List<UserModel> userModelList;
    private ClickListener clickListener;

    public SimpleAdapter(ClickListener clickListener) {
        this.clickListener = clickListener;
        userModelList = new ArrayList<>();
    }

    public interface ClickListener {
        void onUserClicked(UserModel model);
    }

    public void setUserModelList(List<UserModel> models) {
        if (models == null) {
            return;
        }
        userModelList.clear();
        userModelList.addAll(models);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile, parent, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder holder, int position) {
        UserModel model = userModelList.get(position);
        holder.bindDataToViews(model);
    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }

    class SimpleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tvName;
        private TextView tvDesignation;
        private TextView tvLocaiton;

        public SimpleViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvName = itemView.findViewById(R.id.tv_name);
            tvDesignation = itemView.findViewById(R.id.tv_designation);
            tvLocaiton = itemView.findViewById(R.id.tv_location);
        }

        public void bindDataToViews(UserModel model) {
            tvName.setText(model.getName());
            tvDesignation.setText(model.getDesignation());
            tvLocaiton.setText(model.getLocation());
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position < 0)
                return;
            UserModel model = userModelList.get(position);
            clickListener.onUserClicked(model);
        }
    }

}
