package com.example.ahmed.projectlms.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.ahmed.projectlms.Fragment.ProgressFragment;
import com.example.ahmed.projectlms.Models.Class_model;
import com.example.ahmed.projectlms.R;

/**
 * Created by Mohab on 4/7/2017.
 */

public class ProgressActivity extends AppCompatActivity
{

    public static final String EXTRAS_CLASS = "extrasClass";
    Class_model class_model = new Class_model();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        class_model = (Class_model) getIntent().getSerializableExtra(EXTRAS_CLASS);

        ProgressFragment fragment = new ProgressFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.progress_fragment_container, fragment)
                .commit();

    }

}
