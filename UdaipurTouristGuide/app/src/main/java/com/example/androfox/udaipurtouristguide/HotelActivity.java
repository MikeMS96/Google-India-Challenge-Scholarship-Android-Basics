package com.example.androfox.udaipurtouristguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        ArrayList<Guide> guides = new ArrayList<>();
        guides.add(new Guide(R.drawable.oberoi_udaivilas,"The Oberoi Udaivilas", "The Oberoi Udaivilas, Haridasji Ki Magri," +
                "Mulla Talai, Udaipur, 313 001, Rajasthan, India ", "+91-294-2433300 ","reservations@oberoigroup.com",
                "24.577577,73.672029"));

        guides.add(new Guide(R.drawable.leela_palace,"The Leela Palace", "The Leela Palace Udaipur Lake Pichola, PO Box No. 125," +
                " Udaipur 313 001, Rajasthan, India", "+91-294-6701234","reservations@theleela.com","24.578284,73.677152"));

        guides.add(new Guide(R.drawable.lalit_laxmi_vilas,"The Lalit Laxmi Vilas Palace", "The Lalit Laxmi Vilas Palace, Opposite " +
                "Fateh Sagar Lake Udaipur - 313004. India", "+91-294-3017777","udaipur@thelalit.com","24.594061,73.682676"));

        guides.add(new Guide(R.drawable.lake_palace,"Taj Lake Palace", "Taj Lake Palace, Post Box No. 5, Lake Pichola ," +
                "Udaipur , Rajasthan 313001, India", "+91-294-2428800","lakepalace.udaipur@tajhotels.com",
                "24.575614,73.680005"));

        guides.add(new Guide(R.drawable.ananta,"The Ananta Udaipur", "Village Bujhda, Tehsil Girwa, Kodiyat Road |" +
                " Near Peacock Factory, Udaipur 313001, India", "+91-294-6600600","reservation.udaipur@anantahotels.com",
                "24.574405,73.624937"));

        guides.add(new Guide(R.drawable.panna_vilas,"Panna Vilas Palace", "Hotel Panna Vilas Palace, 758/280 Rani Road, " +
                "Fateh Sagar Lake, Udaipur, Rajasthan, India", "+91-294-2431872"," reservations@hotelpannavilas.com",
                "24.591632,73.672479"));

        guides.add(new Guide(R.drawable.lakend,"Hotel Lakend", "Hotel Lakend, Fatehsagar lake shore, Alkapuri, Udaipur 313001" +
                ", Rajasthan, India", "+91-294-2431400","reservations@lakend.co.in","24.591375,73.676310"));

        guides.add(new Guide(R.drawable.hiltop,"Hilltop Palace", "Hotel Hilltop Palace, 5, Ambavgarh, Fatehsagar," +
                "Udaipur 313001, Rajasthan, India", "+91-294-2432246","24.590633,73681753"));

        guides.add(new Guide(R.drawable.tree_leaf_vantara,"Tree Leaf Hospitality","Tree Leaf Hospitality, Debari, " +
                "Udaipur,Rajasthan 313024, India", "+91 7876806807","getaway@treeleafhospitality.com",
                "24.619178,73.788294"));

        guides.add(new Guide(R.drawable.fern_residency,"The Fern Residency", "The Fern Residency,Plot No 1, Madhu Nursery" +
                " Compound, Hiran Magri Sector 3, Near Sevashram Flyover, Udaipur - 313001, Rajasthan , India", "+91-294-3099000",
                "info.fr.udaipur@fernhotels.com","24.577987,73.723852"));


        GuideAdaptor adaptor = new GuideAdaptor(this,guides);
       //TODO change tree leaf image later

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adaptor);


    }
}

