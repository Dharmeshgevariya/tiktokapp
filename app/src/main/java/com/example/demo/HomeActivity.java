package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ViewPager2 videosViewPager = findViewById(R.id.videoViewPager);
        List<VideoItem> videoItem = new ArrayList<>();
        VideoItem videoItemCelebration = new VideoItem();
        videoItemCelebration.videourl = "https://nutritionatyou.in/1.mp4";
        videoItemCelebration.videoTitle="Hot Video";
        videoItemCelebration.videoDescription="Hot Video - Latest Girls";
        videoItem.add(videoItemCelebration);

        VideoItem videoItemParty = new VideoItem();
        videoItemParty.videourl = "https://nutritionatyou.in/2.mp4";
        videoItemParty.videoTitle="Lust Video";
        videoItemParty.videoDescription="Lust Girl Video - Lust Latest Girls";
        videoItem.add(videoItemParty);

    videosViewPager.setAdapter(new VideosAdpter(videoItem));

    }
}