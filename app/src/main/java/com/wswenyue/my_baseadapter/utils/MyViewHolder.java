package com.wswenyue.my_baseadapter.utils;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wswenyue on 2015/8/10.
 */
public class MyViewHolder {
    private SparseArray<View> mViews;
    private int mPosition;
    private View mConvertView;

    public MyViewHolder(Context context, ViewGroup parent,
                      int layoutId, int position) {
        this.mPosition = position;
        this.mViews = new SparseArray<View>();

        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        mConvertView.setTag(this);
    }

    public static MyViewHolder getHolder(Context context, View convertView, ViewGroup parent, int layoutId, int position) {
        if (convertView == null) {
            return new MyViewHolder(context, parent, layoutId, position);
        } else {
            MyViewHolder holder = (MyViewHolder) convertView.getTag();
            holder.mPosition = position;
            return holder;
        }
    }

    /**
     * 通过viewId获取控件
     * @param viewId
     * @param <T>
     * @return
     */
    public <T extends View> T getView(int viewId){
        View view = mViews.get(viewId);
        if(view == null){
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId,view);
        }
        return (T) view;
    }

    public View getmConvertView() {
        return mConvertView;
    }

}
