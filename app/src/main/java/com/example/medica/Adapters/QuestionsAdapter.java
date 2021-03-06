package com.example.medica.Adapters;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.medica.DataBaseRoom.QuizModel;
import com.example.medica.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsAdapter.viewHolder>{

    List<QuizModel> data;

    public QuestionsAdapter(List<QuizModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(
                R.layout.card_item,parent,false);

        return  new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        QuizModel x=data.get(position);
        holder.txt.setText(x.getDevice());
        holder.txt2.setText(x.getCo());

    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {


        TextView txt;
        TextView txt2;
        CardView cardView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            cardView=itemView.findViewById(R.id.card_item);
            txt=itemView.findViewById(R.id.option);
            txt2=itemView.findViewById(R.id.option2);
            cardView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

            menu.add(this.getAdapterPosition(),121,0,"21888");
            menu.add(this.getAdapterPosition(),123,0,"35840");

        }
    }
}
