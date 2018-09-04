package com.example.besho.cvage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void skills(View view) {
        Intent in = new Intent(this,SkillActivity.class);
        startActivity(in);

    }

    public void con(View view) {
        Intent in = new Intent(this,ContactActivity.class);
        startActivity(in);

    }
}
