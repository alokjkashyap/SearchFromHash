package dev.alox.searchfromhash;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<String> SubName;
    public Adapter(List<String> subName){
        this.SubName = subName;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent,false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.SubName.setText(SubName.get(position));

    }

    @Override
    public int getItemCount() {
        return SubName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView SubName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            SubName = itemView.findViewById(R.id.SubName);
        }
    }
}
