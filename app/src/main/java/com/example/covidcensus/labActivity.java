package com.example.covidcensus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class labActivity extends AppCompatActivity {

    PDFView mPDFView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab);

        mPDFView= (PDFView) findViewById(R.id.pdfView);
        mPDFView.fromAsset("labspdf.pdf").load();
    }
}