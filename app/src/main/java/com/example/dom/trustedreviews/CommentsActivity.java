package com.example.dom.trustedreviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        //prg=(ProgressBar)findViewById(R.id.progressBar);
        //prg.setProgress(75);


    }
}