package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<Food> Foods = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Food f1 = new Food("Cheese",3,R.drawable.img);
        Food f2 = new Food("Chocolate",4,R.drawable.img_1);
        Food f3 = new Food("Coffee",10,R.drawable.img_2);
        Food f4 = new Food("Donut",7,R.drawable.img_3);
        Food f5 = new Food("Fries",6,R.drawable.img_4);
        Food f6 = new Food("Honey",15,R.drawable.img_5);

        Foods.add(f1);
        Foods.add(f2);
        Foods.add(f3);
        Foods.add(f4);
        Foods.add(f5);
        Foods.add(f6);


        foodAdapter foodAdapter = new foodAdapter(this,0,Foods);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(foodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Food currentFood = Foods.get(i);
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("Food",currentFood);
                startActivity(intent);
            }
        });
    }
}