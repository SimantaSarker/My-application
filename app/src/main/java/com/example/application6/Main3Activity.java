package com.example.application6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    ImageView one,two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        one=(ImageView)findViewById(R.id.imageView1);
        two=(ImageView)findViewById(R.id.imageView2);
        one.setOnClickListener(this);
        two.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageView1)
        {
            one.setVisibility(View.GONE);
            two.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.imageView2)
        {
            two.setVisibility(View.GONE);
            one.setVisibility(View.VISIBLE);
        }


    }
}
