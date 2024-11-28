package com.example.vectoriya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
Button btn_exit;
ArrayList<War_button> list = new ArrayList<War_button>();
String[] list_war;
String[] era_name;
TextView text;
int firstVisiblePosition = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_war);
        btn_exit = findViewById(R.id.btn_exit_year_war);
        text = findViewById(R.id.text_era);
        list_war = getResources().getStringArray(R.array.war_list);
        era_name = getResources().getStringArray(R.array.era_string);
        text.setText(era_name[0]);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
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
                firstVisiblePosition = ((LinearLayoutManager)recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                if (firstVisiblePosition >= 0 && firstVisiblePosition <= 18) {text.setText(era_name[0]);}
                if (firstVisiblePosition >= 19 && firstVisiblePosition <= 63) {text.setText(era_name[1]);}
                if (firstVisiblePosition >= 64 && firstVisiblePosition <= 117){text.setText(era_name[2]);}
                if (firstVisiblePosition >= 118 && firstVisiblePosition <= 166){text.setText(era_name[3]);}
                if (firstVisiblePosition >= 167 && firstVisiblePosition <= 197){text.setText(era_name[4]);}
                if (firstVisiblePosition >= 198){text.setText(era_name[5]);}
            }
        });
    }
    private void setInitialData(){
        for(String i: list_war){
            list.add(new War_button (i));
        }
    }
    public void exit_btn(View v){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}