package com.example.besho.cvage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SkillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);
    }

    public void ser(View view) {
        Intent in =new Intent(this,ContactActivity.class);
        startActivity(in);
    }

    public void cerc(View view) {
        Intent in = new Intent(this,CerActivity.class);
        startActivity(in);
    }
}
