package com.example.navigationdrawerexample;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.provider.AlarmClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookCabFragment extends Fragment implements View.OnClickListener {


    public BookCabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_book_cab, container, false);

       /* Button btn=(Button)rootView.findViewById(R.id.btn);
        btn.setOnClickListener(this);*/


        return rootView;
    }

    @Override
    public void onClick(View v) {


       /* Intent openClockIntent = new Intent(AlarmClock.ACTION_SET_ALARM);
        openClockIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getActivity().startActivity(openClockIntent);*/

        /*final String appPackageName = "com.radiocabs"; // getPackageName() from Context or Activity object
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }*/
    }

}
