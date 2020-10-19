package com.mukangulol.application3.controllers.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.mukangulol.application3.R;
import com.mukangulol.application3.adapters.LeaguesAdapter;
import com.mukangulol.application3.controllers.GlobalController;
import com.mukangulol.application3.model.LeagueModel;

import java.util.List;

public class LeaguesActivity extends AppCompatActivity {
    GlobalController globalController;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leagues);
        globalController = new GlobalController(LeaguesActivity.this);
        recyclerView = findViewById(R.id.leagues_recycler);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);

        List<LeagueModel.League> leagueList = globalController.retrieveLeagues();
        LeaguesAdapter adapter = new LeaguesAdapter(this, leagueList);
        recyclerView.setAdapter(adapter);

    }
    public void onBackPressed(){
        globalController.NextIntent(MainActivity.class);
        finish();
    }
}