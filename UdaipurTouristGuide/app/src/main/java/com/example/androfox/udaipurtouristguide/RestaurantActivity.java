package com.example.androfox.udaipurtouristguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        ArrayList<Guide> guides = new ArrayList<>();
        guides.add(new Guide(R.drawable.udaipuri,"Udaipuri", "1, Moksh Marg, Shastri Circle, Udaipur (Raj.) 313001",
                "+91 9001797730","info@udaipuri.com","24.586990,73.699506"));

        guides.add(new Guide(R.drawable.ambrai,"Ambrai Restaurant", "Hotel Amet Haveli, Outside Chandpole, Udaipur" +
                "Rajasthan, INDIA - 313001", "+91-294-2431085 ","ambrai.restaurant@gmail.com","24.578167,73.680262"));

        guides.add(new Guide(R.drawable.hari_garh,"Hari Garh Restaurant", "Hanuman Ghat, Outside Chandpol, " +
                "313001 Udaipur, Rajasthan India", "+91-294-2431578","info@restaurantharigarh.com","24.579888,73.680419"));

        guides.add(new Guide(R.drawable.upre,"Upré by 1559 AD", "Lake Pichola Hotel, outside Chandpole, Near Hanuman" +
                "Ghat, Udaipur, India", "+91-294-2431197","upre@1559ad.com","24.579151,73.680425"));

        guides.add(new Guide(R.drawable.zucchini,"Zucchini", "Ground floor, Inaya Complex, Opposite Hanuman Temple, " +
                "Court Circle, Madhuban, Udaipur, Rajasthan 313001", "+91-294-5107896","info@zucchini.co.in",
                "24.589794,73.696187"));

        guides.add(new Guide(R.drawable.white_terrace,"White Terrace Restaurant", "Ganguar Ghat Road, Udaipur, " +
                "Rajasthan, India", "+91 9828071102","24.580210,73.683296"));

        guides.add(new Guide(R.drawable.udai_kothi,"Udai Kothi", "O/S Chand Pole, Hanuman Ghat Marg, " +
                "On Pichola Lake, Udaipur-313001. (Raj) India", "+91-294-2432810","info@udaikothi.com",
                "24.579967,73.679686"));

        guides.add(new Guide(R.drawable.ozen,"O'Zen", "51 Palace Road, Udaipur City, Rajasthan, India",
                "+91 9829361640","24.579269,73.683760"));

        guides.add(new Guide(R.drawable.jhumar,"Jhumar Restaurant"," 5 Rani Road, Near Panna Vilas, " +
                "Fateh Sagar Lake, Udaipur (313001) INDIA", "+91-9828962423\n+91-9783826642","jhumarrestaurant@gmail.com",
                "24.592120,73.672038"));

        guides.add(new Guide(R.drawable.neel_kamal,"Neel Kamal", "Taj Lake Palace, Udaipur, Rajasthan 313001, India",
                "+91-294-2428800","24.575354,73.679971"));


        GuideAdaptor adaptor = new GuideAdaptor(this,guides);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }
}
