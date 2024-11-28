package com.example.vectoriya;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Year_war extends AppCompatActivity {
ArrayList<War_button> list = new ArrayList<War_button>();
String[] list_war;
TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_war);
        test = findViewById(R.id.text1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
    list_war = getResources().getStringArray(R.array.war_list);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.scroll_layout);
        // создаем адаптер
        Year_war_adapter adapter = new Year_war_adapter(this, list);
        // устанавливаем для списка адаптер и менеджер
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        // отслеживание scroll списка
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    int firstVisiblePosition = ((LinearLayoutManager)recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                    int lastVisiblePosition = ((LinearLayoutManager)recyclerView.getLayoutManager()).findLastCompletelyVisibleItemPosition();
                    test.setText(String.valueOf(firstVisiblePosition));
                }
            }
        });

    }
    private void setInitialData(){
        for(String i: list_war){
            list.add(new War_button (i));
        }
    }
}