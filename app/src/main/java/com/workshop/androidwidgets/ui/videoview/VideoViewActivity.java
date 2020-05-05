package com.workshop.androidwidgets.ui.videoview;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.ui.base.BaseActivity;
import com.workshop.androidwidgets.utils.UiUtils;

public class VideoViewActivity extends BaseActivity implements MediaPlayer.OnCompletionListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoview);
        getSupportActionBar().setTitle("VideoView Tutorial");

        VideoView videoView = findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);

        videoView.setMediaController(mediaController);

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nature));
        videoView.setOnCompletionListener(this);
        videoView.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        UiUtils.showToast(this, "Video Finished...");
    }
}
