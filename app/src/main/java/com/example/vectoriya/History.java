package com.example.vectoriya;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

public class History extends AppCompatActivity {
    Bundle bundle;
    String key = "key";
    TextView textWar;
    ImageView image_war;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        textWar = findViewById(R.id.text_history);
        image_war = findViewById(R.id.image_history);

        Bundle arguments = getIntent().getExtras();// getting result activity YEAR WAR
        String name = arguments.get(key).toString();// keep the name to  pressed  button
        textWar.setText(name);
//        MyDataBaseHistory db = Room.databaseBuilder(getApplicationContext(),
//                MyDataBaseHistory.class, "cityinfo").build();
//
//        EntityWarHistory user = new EntityWarHistory();
//
//        String text = db.myDao().getText(1);
//        textWar.setText(text);
    }
    //кнопка назад
    public void exit_btn(View v) {
        Intent intent = new Intent(this, Year_war.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }


}