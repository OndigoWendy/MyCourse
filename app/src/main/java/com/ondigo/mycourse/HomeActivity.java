package com.ondigo.mycourse;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

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
            Intent intent = new Intent(HomeActivity.this, YearOneSem2Activity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.cvConcerts)
        {
            //Do something Like starting an activity
            Intent intent = new Intent(HomeActivity.this, YearOneSem2Activity.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_logout){
            logout();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void logout(){
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }


}