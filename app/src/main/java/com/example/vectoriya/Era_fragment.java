package com.example.vectoriya;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Era_fragment extends Fragment {
    int count;
    String[] posts_person;
    Person people;
    TextView text_post;
    TextView text_rat;
    public Era_fragment(){
        super(R.layout.era_fragment);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        text_post = view.findViewById(R.id.text_position_person);// текст звания пользователя в игре
        text_rat = view.findViewById(R.id.text_rating);
        people = new Person("Nikita");//создаем человека
        count = people.getRating();
        posts_person = getResources().getStringArray(R.array.post_person);// массив всех 20 званий
        change_count();
        people.setRating(5300);
        change_count();
    }
    findViewById(R.id.myButtom).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onBackPressed();
        }
    });

}
