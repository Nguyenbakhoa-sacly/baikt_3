package com.example.bai_kt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class detail extends AppCompatActivity {
    ListView listdetail;
    Button btn_luu;
    EditText edtvd;
    TextView tieude;

    ArrayAdapter<String> adapter;
    ArrayList<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        listdetail = findViewById(R.id.listdetail);
        btn_luu = findViewById(R.id.btn_luu);
        edtvd = findViewById(R.id.edtvd);
        tieude = findViewById(R.id.tieude);

        Intent intent= getIntent();
        tieude.setText(intent.getStringExtra("ten"));

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        listdetail.setAdapter(adapter);
    }
    public void saveData(View view){
        if(edtvd.getText().toString().isEmpty()){
            edtvd.setError("Please enter text");
        }else{
            list.add(edtvd.getText().toString());
            edtvd.setText("");
            adapter.notifyDataSetChanged();
        }

    }
}