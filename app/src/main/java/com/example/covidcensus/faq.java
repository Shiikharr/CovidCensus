package com.example.covidcensus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class faq extends AppCompatActivity {

    PDFView mPDFView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        mPDFView= (PDFView) findViewById(R.id.pdfView);
        mPDFView.fromAsset("FAQ.pdf").load();

    }
}