package com.example.bahroel.consumptionjsonretrofit.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bahroel.consumptionjsonretrofit.Model.Android;
import com.example.bahroel.consumptionjsonretrofit.R;

import java.util.ArrayList;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.AndroidViewHolder> {
    private Context context;
    ArrayList<Android> androidArrayList;

    public AndroidAdapter(ArrayList<Android> androidArrayList) {
        this.androidArrayList = androidArrayList;
    }

    public AndroidAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Android> getAndroidArrayList() {
        return androidArrayList;
    }

    public void setAndroidArrayList(ArrayList<Android> androidArrayList){
        this.androidArrayList = androidArrayList;
    }


    @Override
    public AndroidViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_android, parent, false);
        return new AndroidViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidViewHolder holder, int position) {
        holder.ver.setText(getAndroidArrayList().get(position).getVer());
        holder.name.setText(getAndroidArrayList().get(position).getName());
        holder.api.setText(getAndroidArrayList().get(position).getApi());
    }

    @Override
    public int getItemCount() {
        return getAndroidArrayList().size();
    }

    class AndroidViewHolder extends RecyclerView.ViewHolder{
        TextView ver;
        TextView name;
        TextView api;

        public AndroidViewHolder(View itemView) {
            super(itemView);
            ver = (TextView)itemView.findViewById(R.id.tvVer);
            name = (TextView)itemView.findViewById(R.id.tvName);
            api = (TextView)itemView.findViewById(R.id.tvApi);
        }
    }
}
