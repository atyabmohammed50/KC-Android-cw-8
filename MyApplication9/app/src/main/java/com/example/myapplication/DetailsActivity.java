package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        Food deliverFood = (Food) bundle.getSerializable("");

        TextView foodNametxt = findViewById(R.id.foodName);
        ImageView foodImageview = findViewById(R.id.foodImage);

        foodNametxt.setText(deliverFood.getFoodname());
        foodImageview.setImageResource(deliverFood.getFoodImage());
    }
}