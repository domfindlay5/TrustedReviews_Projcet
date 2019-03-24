package com.example.dom.trustedreviews;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScanQRActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler{
    private ZXingScannerView ScannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr);
    }

    public void scan(View view){
        ScannerView = new ZXingScannerView(getApplicationContext());
        setContentView(ScannerView);
        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }


    @Override
    protected void onStop() {
        super.onStop();
        ScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result result){
        String scanResult = result.getText();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Scan Result");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ScannerView.resumeCameraPreview(ScanQRActivity.this);
            }
        });
    }

}