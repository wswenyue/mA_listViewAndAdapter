package com.wswenyue.my_baseadapter;

import android.content.Context;
import android.widget.TextView;

import com.wswenyue.my_baseadapter.bean.Bean;
import com.wswenyue.my_baseadapter.utils.CommonAdapter;
import com.wswenyue.my_baseadapter.utils.MyViewHolder;

import java.util.List;

/**
 * Created by wswenyue on 2015/8/2.
 */
public class MyAdapterWithCommonViewHolder extends CommonAdapter<Bean> {


    public MyAdapterWithCommonViewHolder(Context context, List<Bean> datas) {
        super(context, datas);
    }


    @Override
    public void convert(MyViewHolder holder, Bean bean) {

//        ((TextView) holder.getView(R.id.id_title)).setText(bean.getTitle());
        holder.setText(R.id.id_title, bean.getTitle())
                .setText(R.id.id_desc, bean.getDesc())
                .setText(R.id.id_time, bean.getTime())
                .setText(R.id.id_phone, bean.getPhone());
//        ((TextView) holder.getView(R.id.id_desc)).setText(bean.getDesc());
//        ((TextView) holder.getView(R.id.id_time)).setText(bean.getTime());
//        ((TextView) holder.getView(R.id.id_phone)).setText(bean.getPhone());
    }


}
