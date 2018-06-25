package com.yohn.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BaseQuickAdapter<String,BaseViewHolder> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView=findViewById(R.id.recyclerView);
        List<String> arrayList=new ArrayList<>();
        for(int i=0;i<20;i++){
            arrayList.add("this is "+ i+ " item");
        }
        mAdapter=new BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_layout,arrayList) {
            @Override
            protected void convert(BaseViewHolder helper, String item) {
                helper.setText(R.id.name,item);

            }
        };
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(mAdapter);
    }
}
