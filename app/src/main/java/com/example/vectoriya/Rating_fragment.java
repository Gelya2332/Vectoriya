package com.example.vectoriya;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Rating_fragment extends Fragment {
    int count;
    String[] posts_person;
    Person people;
    TextView text_post;
    TextView text_rat;
    public Rating_fragment(){
        super(R.layout.rating_fragment_layout);
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
    }

    public void change_count(){//функция для изменения текста звания пользователя
        text_post.setText(posts_person[people.getRating()/1000]);// установка текста
        text_rat.setText(String.valueOf(people.getRating()));
    }
}
