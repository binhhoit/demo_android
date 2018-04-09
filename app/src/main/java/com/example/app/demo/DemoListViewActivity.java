package com.example.app.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DemoListViewActivity extends AppCompatActivity {

    private ListView lvDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_list_view);
        lvDemo = findViewById(R.id.activity_demo_lv_demo);

        createListView();
    }

    private void createListView() {
        ArrayList<String> listNumber = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            listNumber.add(String.valueOf(i));
        }

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listNumber);
        lvDemo.setAdapter(adapter);

    }

}
