package com.example.recycleranimals;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<GeneralAnimals> generalArray = new ArrayList<>();
    private Context context;
    private LayoutInflater mInflater;

    public RecyclerViewAdapter(ArrayList<GeneralAnimals> generalArray, Context context) {
        this.generalArray = generalArray;
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.recycler_view_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        final String str = generalArray.get(i).name();
        int img = generalArray.get(i).img();
        final String strVoice = generalArray.get(i).voice();

        viewHolder.name.setText(str);
        viewHolder.img.setImageResource(img);
        viewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(viewHolder.name.getText().toString().equals(str)) {
                    viewHolder.button.setText("Show voice");
                    viewHolder.name.setText(strVoice);
                } else{
                    viewHolder.name.setText(str);
                    viewHolder.button.setText("Show name");

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return generalArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView name;
        private ImageView img;
        private Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.animal_name);
            img = itemView.findViewById(R.id.image_id);
            button = itemView.findViewById(R.id.btn);
        }
    }
}
