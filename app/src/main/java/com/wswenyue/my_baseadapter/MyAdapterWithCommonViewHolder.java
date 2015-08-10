package com.wswenyue.my_baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wswenyue.my_baseadapter.bean.Bean;
import com.wswenyue.my_baseadapter.utils.MyViewHolder;

import java.util.List;

/**
 * Created by wswenyue on 2015/8/2.
 */
public class MyAdapterWithCommonViewHolder extends BaseAdapter {

    private LayoutInflater minflater;
    private List<Bean> mDatas;
    private Context mContext;

    public MyAdapterWithCommonViewHolder(Context context, List<Bean> datas) {
        mContext = context;
        minflater = LayoutInflater.from(context);
        mDatas = datas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyViewHolder holder = MyViewHolder.getHolder(mContext, convertView,
                parent, R.layout.item_listview, position);

        Bean bean = mDatas.get(position);
        ((TextView) holder.getView(R.id.id_title)).setText(bean.getTitle());
        ((TextView) holder.getView(R.id.id_desc)).setText(bean.getDesc());
        ((TextView) holder.getView(R.id.id_time)).setText(bean.getTime());
        ((TextView) holder.getView(R.id.id_phone)).setText(bean.getPhone());
        return holder.getmConvertView();
    }


}
