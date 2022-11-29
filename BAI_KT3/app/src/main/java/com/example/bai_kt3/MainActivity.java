package com.example.bai_kt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<model> items = new ArrayList<>();
    Adapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listngonngu);

        items.add(new model("Việt nam",R.drawable.vn)) ;
        items.add(new model("Anh",R.drawable.anh)) ;
        items.add(new model("Pháp",R.drawable.phap)) ;
        items.add(new model("Nga",R.drawable.nga)) ;
        items.add(new model("Lào",R.drawable.lao));
        items.add(new model("Campuchia",R.drawable.campuchia));
        items.add(new model("Thái Lan",R.drawable.thailan));

        adapter = new Adapter(MainActivity.this,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,detail.class);

                startActivity(intent);
            }
        });
    }
}