package com.example.dom.trustedreviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ItemsActivity extends AppCompatActivity {

    ProgressBar prg;
    String item1,item2,item3,item4;

    EditText text_input_item1;
    EditText text_input_item2;
    EditText text_input_item3;
    EditText text_input_item4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        TextView stepsTxtView = (TextView) findViewById(R.id.stepstxtView);
        stepsTxtView.setText("Step 1 of 4:");

        prg=(ProgressBar)findViewById(R.id.progressBar);
        prg.setProgress(25);


        text_input_item1 = (EditText) findViewById(R.id.text_input_item1);
        text_input_item2 = (EditText) findViewById(R.id.text_input_item2);
        text_input_item3 = (EditText) findViewById(R.id.text_input_item3);
        text_input_item4 = (EditText) findViewById(R.id.text_input_item4);

        // Next Button to Ratings
        // set object
        Button nextPgBtn = (Button)findViewById(R.id.nextBtn);
        // pass on click listener
        nextPgBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(),RatingActivity.class);
                startActivity(startIntent);

                item1 = text_input_item1.getText().toString();
                item2 = text_input_item2.getText().toString();
                item3 = text_input_item3.getText().toString();
                item4 = text_input_item4.getText().toString();

                showToast(item1 + item2 + item3 + item4);
            }
        });

    }

    private void showToast(String text) {
        Toast.makeText(ItemsActivity.this,text, Toast.LENGTH_SHORT).show();
    }
}