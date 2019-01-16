package com.example.dom.trustedreviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ScanQRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr);


        Button qrReaderBtn = (Button)findViewById(R.id.qrReaderBtn);
        qrReaderBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ItemsActivity.class);
                startActivity(startIntent);
            }
        });
    }
}

