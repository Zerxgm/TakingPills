package com;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.takingpills.AddPatient;
import com.example.takingpills.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAddPatient(View view) {
        Intent intent = new Intent(this, AddPatient.class);
        startActivity(intent);
    }
}
