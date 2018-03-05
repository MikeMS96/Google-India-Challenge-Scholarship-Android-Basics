package com.example.androfox.udaipurtouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hotelView = findViewById(R.id.hotel);

        hotelView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelIntent = new Intent(MainActivity.this,HotelActivity.class);
                startActivity(hotelIntent);
            }
        });

        TextView restaurantView = findViewById(R.id.restaurant);

        restaurantView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantIntent = new Intent(MainActivity.this,RestaurantActivity.class);
                startActivity(restaurantIntent);
            }
        });

        TextView touristView = findViewById(R.id.tourist_place);

        touristView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent touristIntent = new Intent(MainActivity.this,TouristPlaceActivity.class);
                startActivity(touristIntent);
            }
        });

    }
}
