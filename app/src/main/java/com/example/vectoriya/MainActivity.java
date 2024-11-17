package com.example.vectoriya;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button train_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        train_btn = findViewById(R.id.btn_train);
    }

    public void training_activity(View view){
        Intent intent = new Intent(this, Training.class);
        startActivity(intent);
    }
    public void exit_btn(View v) {
        customExitDialog();
    }
    public  void customExitDialog()
    {
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.exit_frame);

        // getting reference of TextView
        Button dialogButtonYes = (Button) dialog.findViewById(R.id.Yes_btn);
        Button dialogButtonNo = (Button) dialog.findViewById(R.id.No_btn);

        dialogButtonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialogButtonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                finish();

            }
        });
        dialog.show();
    }
}