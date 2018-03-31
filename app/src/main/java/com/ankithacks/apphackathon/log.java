package com.ankithacks.apphackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class log extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView listView;

    MainActivity me=new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        listView=(ListView)findViewById(R.id.list1);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,me.getList());


        listView.setAdapter(adapter);

    }
}
