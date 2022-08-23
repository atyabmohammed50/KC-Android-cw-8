package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class foodAdapter extends ArrayAdapter {
    List<Food> foodlist;
    public foodAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        foodlist = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row,parent, false);

        Food currentFood = foodlist.get(position);

        TextView foodnametext = view.findViewById(R.id.itemName);
        TextView foodpricetext = view.findViewById(R.id.itemPrice);
        ImageView foodimageview = view.findViewById(R.id.itemImage);

        foodnametext.setText(currentFood.getFoodname());
        foodpricetext.setText(String.valueOf(currentFood.getFoodprice()));
        foodimageview.setImageResource(currentFood.getFoodImage());



        ImageView deletebtn = view.findViewById(R.id.deletebtn);
        deletebtn.setOnClickListener(new View.OnClickListener() {
            Food removedFood = foodlist.get(position);
            @Override
            public void onClick(View view) {

                AlertDialog.Builder bulder = new AlertDialog.Builder(getContext()).setMessage("Are you sure you want to delete that?" )
                        .setTitle("Confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                foodlist.remove(removedFood);
                                notifyDataSetChanged();

                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                dialogInterface.dismiss();

                            }
                        });

                bulder.show();

            }
        });







          return view;
    }
}
