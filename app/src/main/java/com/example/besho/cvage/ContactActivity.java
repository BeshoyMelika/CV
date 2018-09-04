package com.example.besho.cvage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }


    public void call1(View view) {
        Intent in = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01273146825"));
        startActivity(in);
    }

    public void call2(View view) {
        Intent in1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01007417155"));
        startActivity(in1);
    }


    public void fb(View view) {
        Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/beshoo.gamal"));
        startActivity(in1);
    }

    public void ist(View view) {
        Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/beshoy_melika"));
        startActivity(in1);
    }

    public void twit(View view) {
        Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/beshoygamal310"));
        startActivity(in1);
    }

    public void in(View view) {
        Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/beshoymelika"));
        startActivity(in1);
    }


}
