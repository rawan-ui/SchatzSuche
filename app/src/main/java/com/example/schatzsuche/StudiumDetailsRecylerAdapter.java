package com.example.schatzsuche;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudiumDetailsRecylerAdapter extends RecyclerView.Adapter<StudiumDetailsRecylerAdapter.MyViewHolder> {
    private ArrayList<Veranstaltung> lvs;

    public StudiumDetailsRecylerAdapter(ArrayList<Veranstaltung> lvs) {
        this.lvs = lvs;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.studium_course_result, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String name = lvs.get(position).getName();
        String ss = lvs.get(position).getMinimum();
        holder.nametxt.setText(name);
       // holder.ects.setText(ss);
    }

    @Override
    public int getItemCount() {
        // System.out.println("size of lvs :" + lvs);
        return lvs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nametxt;
        private TextView ects;
        public MyViewHolder(final View view) {
            super(view);
            nametxt = view.findViewById(R.id.tv);
            //ects = view.findViewById(R.id.ectss);
        }

    }


}
