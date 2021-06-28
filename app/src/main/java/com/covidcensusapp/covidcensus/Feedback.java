package com.covidcensusapp.covidcensus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class Feedback extends AppCompatActivity {


    EditText namedata, emaildata, messagedata;
    Button send, details;
    Firebase firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        namedata = findViewById(R.id.name);
        emaildata = findViewById(R.id.email);
        messagedata = findViewById(R.id.message1);

        send = findViewById(R.id.send);
        details = findViewById(R.id.view);

        Firebase.setAndroidContext(this);

        String uniqueID= Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);

        firebase= new Firebase("https://covidcensusfinal-default-rtdb.firebaseio.com/"+uniqueID);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                details.setEnabled(true);

                final String name = namedata.getText().toString();
                final String email = emaildata.getText().toString();
                final String message = messagedata.getText().toString();

                Firebase child_name = firebase.child("Name");
                if (name.isEmpty()) {
                    namedata.setError("Please Enter the name!");
                    send.setEnabled(false);
                } else {
                    child_name.setValue(name);
                    namedata.setError(null);
                    send.setEnabled(true);
                }
                Firebase child_email = firebase.child("Email");
                if (email.isEmpty()) {
                    emaildata.setError("Please Enter the email!");
                    send.setEnabled(false);
                } else {
                    child_email.setValue(email);
                    emaildata.setError(null);
                    send.setEnabled(true);
                }
                Firebase child_message = firebase.child("Message");
                if (name.isEmpty()) {
                    messagedata.setError("Please Enter the message!");
                    send.setEnabled(false);
                } else {
                    child_message.setValue(message);
                    messagedata.setError(null);
                    send.setEnabled(true);
                }

                Toast.makeText(Feedback.this, "Your valuable feedback is received.", Toast.LENGTH_SHORT).show();

                details.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new AlertDialog.Builder(Feedback.this)
                                .setTitle("The feedback received is:")
                                .setMessage("Name - "+name+"\n\nEmail - "+email+"\n\nMessage - "+message)
                                .show();
                    }
                });
            }
        });
    }
}