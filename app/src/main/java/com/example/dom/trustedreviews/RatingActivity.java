package com.example.dom.trustedreviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity {

    ProgressBar prg;
    RatingBar ratingBar;
    Float rating1,rating2,rating3,rating4;

    RatingBar ratingBar1;
    RatingBar ratingBar2;
    RatingBar ratingBar3;
    RatingBar ratingBar4;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        /* set step number to 2 */
        TextView stepsTxtView = (TextView) findViewById(R.id.stepstxtView);
        stepsTxtView.setText("Step 2 of 4:");

        /* set progress bar to 50 */
        prg = (ProgressBar) findViewById(R.id.progressBar);
        prg.setProgress(50);

        /* find all rating bars */
        ratingBar1 = (RatingBar) findViewById(R.id.ratingBar1);
        ratingBar2 = (RatingBar) findViewById(R.id.ratingBar2);
        ratingBar3 = (RatingBar) findViewById(R.id.ratingBar3);
        ratingBar4 = (RatingBar) findViewById(R.id.ratingBar4);


        // next button to comments
        Button nextPgBtn = (Button) findViewById(R.id.nextBtn);
        // pass on click listener
        nextPgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), CommentsActivity.class);
                startActivity(startIntent);

                /*rating1 = ratingBar1.getRating();
                rating2 = ratingBar2.getRating();
                rating3 = ratingBar3.getRating();
                rating4 = ratingBar4.getRating();

                showToast(rating1);
                showToast(rating2);
                showToast(rating3);
                showToast(rating4); */


            }
        });

    }
        private void showToast(float msg) {
            Toast.makeText(RatingActivity.this, (int) msg, Toast.LENGTH_SHORT).show();
        }

    }