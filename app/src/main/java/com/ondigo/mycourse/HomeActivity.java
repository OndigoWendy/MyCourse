package com.ondigo.mycourse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // get the id of the CardView and attach an onClickListener to it
        findViewById(R.id.cvNews).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.cvFans).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.cvConcerts).setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View view)
    {
        if(view.getId() == R.id.cvNews)
        {
            //Do something Like starting an activity
            Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.cvFans)
        {
            //Do something Like starting an activity
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.cvConcerts)
        {
            //Do something Like starting an activity
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}