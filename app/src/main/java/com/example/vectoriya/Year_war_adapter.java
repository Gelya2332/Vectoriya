package com.example.vectoriya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Year_war_adapter extends RecyclerView.Adapter<Year_war_adapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<War_button> war_list;

    Year_war_adapter(Context context, List<War_button> war_list) {
        this.war_list = war_list;
        this.inflater = LayoutInflater.from(context);
    }
    interface OnWarClickListener{
        void onWarClick(War_button war_btn, int position);
    }
    @Override
    public Year_war_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.adapter_year_war, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Year_war_adapter.ViewHolder holder, int position) {
        War_button war_btn = war_list.get(position);
        holder.btn_war.setText(war_btn.getName());
    }

    @Override
    public int getItemCount() {
        return war_list.size();
    }
    //хранить кнопки адаптера
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageButton img_btn;
        final TextView btn_war;
        ViewHolder(View view){
            super(view);
            img_btn = view.findViewById(R.id.flag_btn);
            btn_war = view.findViewById(R.id.year_btn);
        }
    }

    // Найти какие позиции на экране
    // Отправить если они изменились

}
