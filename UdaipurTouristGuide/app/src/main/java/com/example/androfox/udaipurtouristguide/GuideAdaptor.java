package com.example.androfox.udaipurtouristguide;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mike on 1/15/2018.
 */

public class GuideAdaptor extends ArrayAdapter<Guide> {

    public GuideAdaptor(Context context, ArrayList<Guide> guides) {
        super(context, 0, guides);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        final Guide currentGuide = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentGuide.getImageResourceId());

        TextView nameView = listItemView.findViewById(R.id.name);
        nameView.setText(currentGuide.getName());

        TextView addressView = listItemView.findViewById(R.id.address);
        addressView.setText(currentGuide.getAddress());
        ImageView mapView = listItemView.findViewById(R.id.map_open);
        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/maps/dir/?api=1&destination="+currentGuide.getLatLong()));
                getContext().startActivity(intent);

            }
        });

        LinearLayout contactLayout = listItemView.findViewById(R.id.contact_layout);
        if(currentGuide.hasContact()) {
            TextView contactView = listItemView.findViewById(R.id.contact);
            contactView.setText(currentGuide.getContact());
            contactLayout.setVisibility(LinearLayout.VISIBLE);

            ImageView dialerView = listItemView.findViewById(R.id.dialer_open);
            dialerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+currentGuide.getContact()));
                    getContext().startActivity(intent);
                }
            });
        }
        else{
            contactLayout.setVisibility(LinearLayout.GONE);
        }

        LinearLayout emailLayout =listItemView.findViewById(R.id.email_layout);
        if(currentGuide.hasEmail()){
        TextView emailView = listItemView.findViewById(R.id.email);
        emailView.setText(currentGuide.getEmail());
        emailLayout.setVisibility(LinearLayout.VISIBLE);

        ImageView emailOpenView = listItemView.findViewById(R.id.email_open);
        emailOpenView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"+currentGuide.getEmail()));
                getContext().startActivity(intent);
            }
        });
        }
        else{
            emailLayout.setVisibility(LinearLayout.GONE);
        }
        return listItemView;
    }
}
