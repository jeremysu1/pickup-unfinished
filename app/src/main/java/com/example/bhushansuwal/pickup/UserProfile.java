package com.example.bhushansuwal.pickup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserProfile extends AppCompatActivity {

    Button Soccer10;
    Button Basketball10;
    Button Frisbee10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        //get the name from the database
        Soccer10 = (Button) findViewById(R.id.Soccer10);

        Soccer10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if (Soccer10.getText() == "OFF") {
                    Soccer10.setText("ON");
                }
                if (Soccer10.getText() == "ON") {
                    Soccer10.setText("OFF");
                }
            }
        });

        Basketball10 = (Button) findViewById(R.id.Basketball10);

        Basketball10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if (Basketball10.getText() == "OFF") {
                    Basketball10.setText("ON");
                }
                if (Basketball10.getText() == "ON") {
                    Basketball10.setText("OFF");
                }
            }
        });

        Frisbee10 = (Button) findViewById(R.id.Frisbee10);

        Frisbee10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if (Frisbee10.getText() == "OFF") {
                    Frisbee10.setText("ON");
                }
                if (Frisbee10.getText() == "ON") {
                    Frisbee10.setText("OFF");
                }
            }
        });
    }


}
