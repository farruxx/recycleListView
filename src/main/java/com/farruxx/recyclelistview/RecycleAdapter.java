package com.farruxx.recyclelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;


/**
 * Created by Farrux on 16.06.2015.
 */
public abstract class RecycleAdapter<T,ViewHolder extends RecycleViewHolder> extends BaseAdapter {
    List<T> items;
    Context context;
    LayoutInflater inflater;
    Class<ViewHolder> viewHolder;

    protected RecycleAdapter(Context context, List<T> items, Class<ViewHolder> viewHolder) {
        this.items = items;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.viewHolder = viewHolder;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public T getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        T item = items.get(position);
        if(convertView == null){
            convertView = inflater.inflate(getLayoutId(), parent, false);
            try {
                holder = (ViewHolder) viewHolder.getConstructors()[0].newInstance(convertView);
                convertView.setTag(holder);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        initValues(item, holder, position);
        return convertView;
    }

    protected abstract int getLayoutId();
    protected abstract void initValues(T t, ViewHolder holder, int position);
}
