package com.covidcensusapp.covidcensus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class CoHelpline extends AppCompatActivity {

    TextView central, andhra, arunachal, assam, bihar, chattisgarh, goa, gujarat;
    TextView haryana, himachal, jharkhand, karnataka, kerela, madhya, maharashtra;
    TextView manipur, meghalaya, mizoram, nagaland, odisha, punjab, rajasthan, sikkim, tamil, telangana, tripura, uttarakhand, uttar, bengal;
    TextView andman, chandigarrh, daman, delhi, jammu, ladakh, lakshadweep, puducherry;

    PDFView mPDFView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co_helpline);

        central = findViewById(R.id.central);
        andhra = findViewById(R.id.andhra);
        arunachal = findViewById(R.id.arunachal);
        assam = findViewById(R.id.assam);
        bihar = findViewById(R.id.bihar);
        chattisgarh = findViewById(R.id.chattishgarh);
        goa = findViewById(R.id.goa);
        gujarat = findViewById(R.id.gujarat);
        haryana = findViewById(R.id.haryana);
        himachal = findViewById(R.id.himachal);
        jharkhand = findViewById(R.id.jharkhand);
        karnataka = findViewById(R.id.karnataka);
        kerela = findViewById(R.id.kerela);
        madhya = findViewById(R.id.madhya);
        maharashtra = findViewById(R.id.maharashtra);
        manipur = findViewById(R.id.manipur);
        meghalaya = findViewById(R.id.meghalaya);
        mizoram = findViewById(R.id.mizoram);
        nagaland = findViewById(R.id.nagaland);
        odisha = findViewById(R.id.odisha);
        punjab = findViewById(R.id.punjab);
        rajasthan = findViewById(R.id.rajasthan);
        sikkim = findViewById(R.id.sikkim);
        tamil = findViewById(R.id.tamil);
        telangana = findViewById(R.id.telangana);
        tripura = findViewById(R.id.tripura);
        uttarakhand = findViewById(R.id.uttarakhand);
        uttar = findViewById(R.id.uttar);
        bengal = findViewById(R.id.bengal);
        andman = findViewById(R.id.andman);
        chandigarrh = findViewById(R.id.chandigarh);
        daman = findViewById(R.id.daman);
        delhi = findViewById(R.id.delhi);
        jammu = findViewById(R.id.jammu);
        ladakh = findViewById(R.id.ladakh);
        lakshadweep = findViewById(R.id.lakshadweep);
        puducherry = findViewById(R.id.puducherry);


        makecall(central);
        makecall(andhra);
        makecall(arunachal);
        makecall(assam);
        makecall(bihar);
        makecall(chattisgarh);
        makecall(goa);
        makecall(gujarat);
        makecall(haryana);
        makecall(himachal);
        makecall(jharkhand);
        makecall(karnataka);
        makecall(kerela);
        makecall(madhya);
        makecall(maharashtra);
        makecall(manipur);
        makecall(meghalaya);
        makecall(mizoram);
        makecall(nagaland);
        makecall(odisha);
        makecall(punjab);
        makecall(rajasthan);
        makecall(sikkim);
        makecall(tamil);
        makecall(telangana);
        makecall(tripura);
        makecall(uttarakhand);
        makecall(uttar);
        makecall(bengal);
        makecall(andman);
        makecall(chandigarrh);
        makecall(daman);
        makecall(delhi);
        makecall(jammu);
        makecall(ladakh);
        makecall(lakshadweep);
        makecall(puducherry);


    }

    private void makecall(TextView number) {

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcal = new Intent(Intent.ACTION_CALL);
                String num = number.getText().toString();
                intentcal.setData(Uri.parse("tel:" + num));

                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText(CoHelpline.this, "Please Grant Permission", Toast.LENGTH_SHORT).show();
                    requestPermission();
                } else {
                    startActivity(intentcal);
                }
            }
        });
    }
    private void requestPermission() {
        ActivityCompat.requestPermissions(CoHelpline.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
    }
}