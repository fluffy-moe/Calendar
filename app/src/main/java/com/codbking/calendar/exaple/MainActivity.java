package com.codbking.calendar.exaple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.text1, R.id.text2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text1:
                startActivity(new Intent(MainActivity.this,XiaomiActivity.class));
                break;
            case R.id.text2:
                startActivity(new Intent(MainActivity.this,DingdingActivity.class));
                break;
        }
    }
}
