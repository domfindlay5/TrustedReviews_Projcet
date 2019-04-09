package com.example.dom.trustedreviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Scroller;
import android.widget.TextView;

public class CommentsActivity extends AppCompatActivity {

    ProgressBar prg;
    int Item = 1;

    @Override
    protected void onCreate  (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        TextView stepsTxtView = (TextView) findViewById(R.id.stepstxtView);
        stepsTxtView.setText("Step 3 of 4:");

        final TextView totalTxtView = (TextView) findViewById(R.id.totalTxtView);
        totalTxtView.setText("Item 1 of 4");


        prg=(ProgressBar)findViewById(R.id.progressBar);
        prg.setProgress(75);

        // Next comment Button
        // set object
        Button nextCommentBtn = (Button)findViewById(R.id.CommentNextBtn);
        // pass on click listener
        nextCommentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item++;
                totalTxtView.setText("Item " + (Integer.toString(Item) + " of 4 "));
            }
        });

        // Previous comment button
        // set object
        Button PrevCommentBtn = (Button)findViewById(R.id.CommentBackBtn);
        // pass on click listener
        PrevCommentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item--;
                totalTxtView.setText("Item " + (Integer.toString(Item) + " of 4 "));
            }
        });

        EditText MultiComment = (android.widget.EditText) findViewById(R.id.Comment1EditText);
        MultiComment.setScroller(new Scroller(getApplicationContext()));
        // enable scroll bar on edit text
        MultiComment.setVerticalScrollBarEnabled(true);
        // set minimum amount of lines to be displayed
        MultiComment.setMinLines(2);
        // set maximum amount of lines to be displayed
        MultiComment.setMaxLines(5);


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

    }
}