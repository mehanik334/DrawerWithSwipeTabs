package com.denisenko.aist2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidbelieve.aist2.R;


public class InWorkFragment extends Fragment   {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.in_work_layout,container,false);
        RecyclerView mRecycleView= (RecyclerView) view.findViewById(R.id.event_recycler_view);
        mRecycleView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        mRecycleView.setLayoutManager(mLayoutManager);

        RecyclerView.Adapter mAdapter=new RecycleAdapterFrg(new int[]{R.drawable.card_12_x, R.drawable.card_12_x1,R.drawable.card_12_x2,R.drawable.card_12_x3});
        //[Comment] Very bad. You use images instead models
        mRecycleView.setAdapter(mAdapter);
        return view;
    }


}
