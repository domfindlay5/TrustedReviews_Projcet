package com.example.dom.trustedreviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ItemsActivity extends AppCompatActivity {

    ProgressBar prg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);


        TextView stepsTxtView = (TextView) findViewById(R.id.stepstxtView);
        stepsTxtView.setText("Step 1 of 4:");

        prg=(ProgressBar)findViewById(R.id.progressBar);
        prg.setProgress(25);

        // Next Button to Ratings
        // set object
        Button nextPgBtn = (Button)findViewById(R.id.nextBtn);
        // pass on click listener
        nextPgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),RatingActivity.class);
                startActivity(startIntent);
            }
        });

    }
}