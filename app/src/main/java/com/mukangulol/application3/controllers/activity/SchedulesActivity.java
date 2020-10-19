package com.mukangulol.application3.controllers.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.mukangulol.application3.R;
import com.mukangulol.application3.adapters.ViewPageAdapter;
import com.mukangulol.application3.controllers.GlobalController;
import com.mukangulol.application3.controllers.activity.fragment.EventsFragment;
import com.mukangulol.application3.controllers.activity.fragment.UpcomingFragment;

public class SchedulesActivity extends AppCompatActivity {
    GlobalController globalController;
    ViewPager viewPager;
    TabLayout tabLayout;
    UpcomingFragment upcomingFragment;
    EventsFragment eventsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedules);
        globalController = new GlobalController(this);
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(SchedulesActivity.this.getSupportFragmentManager(),0);
        eventsFragment = new EventsFragment();
        viewPageAdapter.addFragment(eventsFragment, "Highlights");
        upcomingFragment = new UpcomingFragment();
        viewPageAdapter.addFragment(upcomingFragment, "Upcoming");
        viewPager.setAdapter(viewPageAdapter);
    }
    @Override
    public void onBackPressed(){
        globalController.NextIntent(MainActivity.class);
        finish();
    }
}