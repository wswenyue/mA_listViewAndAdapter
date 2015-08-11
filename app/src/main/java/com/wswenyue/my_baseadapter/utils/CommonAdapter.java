package com.wswenyue.my_baseadapter.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wswenyue.my_baseadapter.R;
import com.wswenyue.my_baseadapter.bean.Bean;

import java.util.List;

/**
 * Created by wswenyue on 2015/8/10.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {

    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;

    public CommonAdapter(Context context,List<T> datas) {
        this.mContext =context;
        mInflater = LayoutInflater.from(context);
        this.mDatas = datas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public  View getView(int position, View convertView, ViewGroup parent){

        MyViewHolder holder = MyViewHolder.getHolder(mContext, convertView,
                parent, R.layout.item_listview, position);
        convert(holder,getItem(position));
        return holder.getmConvertView();
    }

    public abstract void convert(MyViewHolder holder,T t);


}
