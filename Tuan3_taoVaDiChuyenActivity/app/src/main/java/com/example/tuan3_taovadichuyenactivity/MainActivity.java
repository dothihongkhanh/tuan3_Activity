package com.example.tuan3_taovadichuyenactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btnOpenChildActivity;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOpenChildActivity=(Button)
                findViewById(R.id.btnOpenChildActivity);
        btnOpenChildActivity.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View arg0) {
                                                   doOpenChildActivity();
                                               }
                                           });
    }
    public void doOpenChildActivity()
    {
        Intent myIntent=new Intent(MainActivity.this, ChildActivity.class);
        startActivity(myIntent);
    }

}