package com.wswenyue.my_baseadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.wswenyue.my_baseadapter.bean.Bean;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private ListView mlistView;
    private List<Bean> mDatas;
    private MyAdapter myAdapter;

    //这里是新加的
    private MyAdapterWithCommonViewHolder myAdapterWithCommonViewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatas();

        initView();

    }

    private void initView() {
        mlistView = (ListView) findViewById(R.id.id_listview);

//        mlistView.setAdapter(myAdapter);
        mlistView.setAdapter(myAdapterWithCommonViewHolder);
    }

    private void initDatas() {
        mDatas = new ArrayList<Bean>();

        Bean bean = new Bean("Android新技能1","Android打造万能的listview和GridView适配器","2014-12-12","10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能2","Android打造万能的listview和GridView适配器","2014-12-12","10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能3","Android打造万能的listview和GridView适配器","2014-12-12","10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能4","Android打造万能的listview和GridView适配器","2014-12-12","10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能5","Android打造万能的listview和GridView适配器","2014-12-12","10086");
        mDatas.add(bean);

//        myAdapter = new MyAdapter(this,mDatas);
        myAdapterWithCommonViewHolder = new MyAdapterWithCommonViewHolder(this,mDatas);
    }


}
