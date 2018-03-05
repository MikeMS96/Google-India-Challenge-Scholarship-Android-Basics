package com.example.androfox.udaipurtouristguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TouristPlaceActivity extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        ArrayList<Guide> guides = new ArrayList<>();
        guides.add(new Guide(R.drawable.city_palace,"City Palace","City Palace Complex, Udaipur 313001, India",
                "24.576450,73.683510"));
        guides.add(new Guide(R.drawable.monsoon_palace,"Mosoon Palace(Sajjangarh Palace)","Kodiyat, Rajasthan 313011",
                "24.593274,73.639233"));
        guides.add(new Guide(R.drawable.lake_fatehsagar,"Lake Fatehsagar","Fateh Sagar Lake, Udaipur, Rajasthan 313001",
                "24.601813,73.679547"));
        guides.add(new Guide(R.drawable.jagdish_temple,"Jagdish Temple","RJ SH 50, Udaipur, Rajasthan 313001",
                "24.579668,73.683778"));
        guides.add(new Guide(R.drawable.saheliyon_ki_bari,"Sahelion Ki Bari","Lake City, Near Science Museum, Panchwati," +
                " Udaipur, Rajasthan 313001","24.602969,73.685515"));
        guides.add(new Guide(R.drawable.kumbhalgarh,"Kumbhalgarh","Kumbhalgarh, Rajasthan 313325","25.152823,73.586999"));
        guides.add(new Guide(R.drawable.ambrai_ghat,"Ambrai Ghat","Candpole Maji Ka Mandir, Ambamata, Cheerwa, Ambamata, " +
                "Udaipur, Rajasthan 313001","24.577557,73.679904"));
        guides.add(new Guide(R.drawable.lake_pichola,"Lake Pichola","Pichola, Udaipur, Rajasthan 313001",
                "24.569090,73.683782"));
        guides.add(new Guide(R.drawable.jag_madir,"Jagmandir","Pichola, Udaipur, Rajasthan 313001","24.567565,73.677351"));
        guides.add(new Guide(R.drawable.bagore_ki_haveli,"Bagore Ki Haveli","Bagore Ki Haveli Museum Gangaur Ghat Marg, " +
                "Udaipur, Rajasthan 313001","24.579663,73.682226"));

        GuideAdaptor adaptor = new GuideAdaptor(this,guides);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }
}
