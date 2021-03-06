package com.ondigo.mycourse.ui;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ondigo.mycourse.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class YearOneSem2Activity extends AppCompatActivity  implements View.OnClickListener  {
        @BindView(R.id.findCourseButton)
        Button mFindCourseButton;
        @BindView(R.id.locationEditText)
        EditText mLocationEditText;
        @BindView(R.id.appNameTextView) TextView mAppNameTextView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_yearonesemtwo);
            ButterKnife.bind(this);

            mFindCourseButton.setOnClickListener(this);
        }
        @Override
        public void onClick(View v){
            if (v == mFindCourseButton) {
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(YearOneSem2Activity.this, CoursesActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        }


    }
