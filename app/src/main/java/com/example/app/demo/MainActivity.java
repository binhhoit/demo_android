package com.example.app.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNextListView;
    private Button btnNextMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: ánh xạ
        btnNextListView = findViewById(R.id.activity_main_btn_listview);
        btnNextMath = findViewById(R.id.activity_main_btn_math);

        actionButton();

    }

    private void actionButton() {

        //chuyển qua màn hình làm toán
        btnNextMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MathActivity.class));
            }
        });

        //chuyển qua màn hình demo listview
        btnNextListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DemoListViewActivity.class));
            }
        });
    }
}
