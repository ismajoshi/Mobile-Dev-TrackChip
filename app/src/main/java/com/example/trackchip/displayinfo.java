package com.example.trackchip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Date;

public class displayinfo extends AppCompatActivity {

    public static final int NEW_WORD_ACTIVITY_REQUEST_CODE = 1;
    private PackageListOpenHelper mDB;
    Package rpack;
    private TextView est_dateview;
    private TextView originview;
    private TextView dc_locview;
    private TextView destinationview;
    private TextView statusview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayinfo);

        mDB = new PackageListOpenHelper(this);
        est_dateview = (TextView) findViewById(R.id.est_dateview);
        originview = (TextView) findViewById(R.id.originview);
        dc_locview = (TextView) findViewById(R.id.dc_locview);
        destinationview = (TextView) findViewById(R.id.destinationview);
        statusview = (TextView) findViewById(R.id.statusview);


        rpack=new Package();
        rpack = mDB.getbyId(1234);

        bind();


    }
        public void bind (){

            est_dateview.setText(rpack.getEst_date().toString());
            originview.setText(rpack.getOrigin());
            dc_locview.setText(rpack.getDc_location());
            destinationview.setText(rpack.getDestination());
            statusview.setText(rpack.getStatus());
        }

    }

