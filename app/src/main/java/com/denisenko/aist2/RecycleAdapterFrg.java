package com.denisenko.aist2;

import android.app.FragmentTransaction;
import android.content.Intent; //[Comment] Unused import
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.androidbelieve.aist2.R;



public class RecycleAdapterFrg extends RecyclerView.Adapter<RecycleAdapterFrg.ViewHolder> {

    private int[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(this);
            mImageView = (ImageView) v.findViewById(R.id.tv_recycle_item);
        }

        @Override
        public void onClick(View v) {

        }
    }

    public RecycleAdapterFrg(int[] mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public RecycleAdapterFrg.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.first_rec_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mImageView.setImageResource(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
