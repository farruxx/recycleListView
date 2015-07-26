package com.farruxx.recyclelistview;

import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by Farrux on 16.06.2015.
 */
public class RecycleViewHolder {
    public RecycleViewHolder(View view) {
        ButterKnife.inject(this,view);
    }
}
