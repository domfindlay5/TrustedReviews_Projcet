package com.example.dom.trustedreviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class CommentsActivity extends AppCompatActivity {

    ProgressBar prg;

    @Override
    protected void onCreate  (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        TextView stepsTxtView = (TextView) findViewById(R.id.stepstxtView);
        stepsTxtView.setText("Step 3 of 4:");

        prg=(ProgressBar)findViewById(R.id.progressBar);
        prg.setProgress(75);

        // Next Button to Preview
        // set object
        Button nextPgBtn = (Button)findViewById(R.id.nextBtn);
        // pass on click listener
        nextPgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),PreviewActivity.class);
                startActivity(startIntent);
            }
        });

        // Back button to Ratings
        // set object
        Button backPgBtn = (Button)findViewById(R.id.backBtn);
        // pass on click listener
        backPgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),RatingActivity.class);
                startActivity(startIntent);
            }
        });


    }
}