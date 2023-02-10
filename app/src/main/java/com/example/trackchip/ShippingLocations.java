package com.example.trackchip;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ShippingLocations extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_shipping_locations);
        String[] Locations =
                {"Fedex, DHL Authorized Ship Centre - Packaging Depot 105-1120 Westwood St",
                        "FedEx Authorized ShipCentre 1410 Parkway Blvd B3",
                        "FedEx Authorized ShipCentre 1155 The High St #103",
                        "SkyMart Shipping Depot DHL Fedex UPS Purolator 3030 Lincoln ave #128",
                        "FedEx Authorized ShipCentre 2850 Shaugnessy St #2133",
                        "FedEx Authorized ShipCentre 930-3025 Lougheed Hwy"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_shipping_locations, R.id.list, Locations));
        setTitle("Shipping Locations");

    }
}