package com.example.pm04.videolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ListView mlistView;
    String[] videoList=new String[]
            {
                    "Video1","Video2","Video3","Video4","Video5","Video6","Video7","Video8"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView=(ListView)findViewById(R.id.listview);

        ArrayAdapter<String>adapter=new ArrayAdapter <>(MainActivity.this,android.R.layout.simple_list_item_2,android.R.id.text1,videoList);
        mlistView.setAdapter(adapter);

        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
               String Templistview =videoList[position].toString();
               Intent intent=new Intent(MainActivity.this,SecondActivity.class);
               intent.putExtra("Listviewclickvalues",Templistview);
               startActivity(intent);

            }
        });


    }
}
