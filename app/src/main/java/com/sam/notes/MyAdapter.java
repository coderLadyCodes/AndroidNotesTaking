package com.sam.notes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import io.realm.RealmResults;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    RealmResults<Notes> notesList;

    public MyAdapter(Context context, RealmResults<Notes> notesList) {
        this.context = context;
        this.notesList = notesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titleOutput;
        TextView textOutput;
        TextView timeOutput;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleOutput = itemView.findViewById(R.id.titleoutput);
            textOutput = itemView.findViewById(R.id.textoutput);
            timeOutput = itemView.findViewById(R.id.timeoutput);

        }
    }
}
