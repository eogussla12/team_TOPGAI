package com.example.eogus.daehhhyun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start_map_activity(View v) {
        Intent intent = new Intent(MainActivity.this, MapActivity.class);
        startActivity(intent);

    }


    public void start_chat_activity(View v) {
        Intent intent = new Intent(MainActivity.this, ChatActivity.class);
        startActivity(intent);

    }

}
