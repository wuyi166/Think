package com.think.comm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.think.player.LiveActivity;

public class StartActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    @Override
    public void onClick(View view) {
      //  Intent intent  = new Intent(this,LiveActivity.class);
        Intent intent  = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}
