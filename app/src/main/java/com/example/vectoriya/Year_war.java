package com.example.vectoriya;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Year_war extends AppCompatActivity {
ArrayList<War_button> list = new ArrayList<War_button>();
String[] list_war;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_war);
    list_war = getResources().getStringArray(R.array.war_list);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.scroll_layout);
        // создаем адаптер
        Year_war_adapter adapter = new Year_war_adapter(this, list);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        for(String i: list_war){
            list.add(new War_button (i));
        }
    }
}