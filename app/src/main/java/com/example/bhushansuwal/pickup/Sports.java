package com.example.bhushansuwal.pickup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sports extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);



        button = (Button) findViewById(R.id.buttonSoccer);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    // Perform action on click

                    Intent intent = new Intent(Sports.this, fake_data_display.class);
                    startActivity(intent);

            }
        });


        button2 = (Button) findViewById(R.id.buttonBasketball);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                    // Perform action on click

            }
        });

        button3 = (Button) findViewById(R.id.buttonFrisbee);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                // Perform action on click

            }
        });
    }
}

