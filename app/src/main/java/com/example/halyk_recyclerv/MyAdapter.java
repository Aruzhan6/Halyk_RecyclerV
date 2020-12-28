package com.example.halyk_recyclerv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    public List<GeneralInform> generalInformList;

    public MyAdapter(List<GeneralInform> generalInformList) {
        this.generalInformList = generalInformList;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_data,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        holder.contract.setText(generalInformList.get(position).getContract());
        holder.description.setText(generalInformList.get(position).getDescription());
        holder.imageView.setImageResource(generalInformList.get(position).getImageId());

    }

    @Override
    public int getItemCount() {
        return generalInformList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView contract, description;
       ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contract = (TextView) itemView.findViewById(R.id.contractTv);
            description = (TextView) itemView.findViewById(R.id.dataContactTv);
            imageView = (ImageView) itemView.findViewById(R.id.folderImageV);
        }
    }
}
