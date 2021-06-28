package com.covidcensusapp.covidcensus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CovidInfo extends AppCompatActivity {

    PDFView mPDFView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_info);

        mPDFView= (PDFView) findViewById(R.id.pdfView);
        mPDFView.fromAsset("statewise.pdf").load();
    }
}