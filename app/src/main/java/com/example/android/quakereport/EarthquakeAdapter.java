package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){

        super(context,0,earthquakes);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {

            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquakelistitem,parent,false);

        }

        Earthquake currentEarthquake=getItem(position);

        TextView magnitudeView=listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthquake.getmMagnitude());

        TextView locationView=listItemView.findViewById(R.id.location);
        locationView.setText(currentEarthquake.getmLocation());

        TextView dateView=listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthquake.getmDate());

        return listItemView;
    }
}
