package com.example.bhushansuwal.pickup;

import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


public class specificEvent extends AppCompatActivity {

    Button interested;
    Bundle extras;
    String event;
    private TextView tv1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_event);

        extras = this.getIntent().getExtras();
        event = extras.getString("event");

        tv1 = (TextView) findViewById(R.id.Gameinfo);
        tv1.setText(event);

        interested = (Button) findViewById(R.id.interested);

        interested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interested.setEnabled(false);
            }
        });
    }
}
