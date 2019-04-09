package com.example.dom.trustedreviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {

    ProgressBar prg;
    RatingBar previewRating;
    int Item = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        /* set step number to 4 */
        TextView stepsTxtView = (TextView) findViewById(R.id.stepstxtView);
        stepsTxtView.setText("Step 4 of 4:");

        final TextView totalTxtView = (TextView) findViewById(R.id.totalTxtView);
        totalTxtView.setText("Item 1 of 4");

        /* set progress bar to 100 */
        prg=(ProgressBar)findViewById(R.id.progressBar);
        prg.setProgress(100);

        /* find rating bar previewRating */
        previewRating = (RatingBar) findViewById(R.id.PreviewratingBar);

        // Next comment Button
        // set object
        Button nextPreviewBtn = (Button)findViewById(R.id.nextPreviewBtn);
        // pass on click listener
        nextPreviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* increment item */
                Item++;
                totalTxtView.setText("Item " + (Integer.toString(Item) + " of 4 "));
            }
        });

        // Previous comment button
        // set object
        Button PrevCommentBtn = (Button)findViewById(R.id.backPreviewBtn);
        // pass on click listener
        PrevCommentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item--;
                totalTxtView.setText("Item " + (Integer.toString(Item) + " of 4 "));
            }
        });

    }

}
