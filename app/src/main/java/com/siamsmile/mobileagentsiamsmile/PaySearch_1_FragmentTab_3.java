package com.siamsmile.mobileagentsiamsmile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.Adapter_PaySearch_2_Fragment_3;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class PaySearch_1_FragmentTab_3 extends Fragment  {

    View rootView;

    public PaySearch_1_FragmentTab_3() {
        // Required empty public constructor
    }
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate( R.layout.paysearch_2_fragmenttab_3, container, false );
//
//        //TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//        //textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
//        return rootView;
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.paysearch_1_fragmenttab_3, container, false );
        GridView gridView = (GridView)rootView.findViewById( R.id.contrac_use );

        //=====================================  set list =================================
        String[][] dataProspect = new String[][]{
                {String.valueOf(R.drawable.banking),"Internet Banking"},
                {String.valueOf(R.drawable.visa),"Counter Service"},
                {String.valueOf(R.drawable.credit),"Credit Card"},
                {String.valueOf(R.drawable.agent),"Agent"},
                {String.valueOf(R.drawable.pay2),"installments"},
                {String.valueOf(R.drawable.pay),"installments "}};



        ArrayList<Integer> imageId = new ArrayList<>();
        ArrayList<String> Header = new ArrayList<>();
        for(int i = 0;i<6;i++) {
            int image1 = Integer.parseInt( dataProspect[i][0] );
            imageId.add( image1 );
            Header.add( dataProspect[i][1] );


        }

        Adapter_PaySearch_2_Fragment_3 adapter = new Adapter_PaySearch_2_Fragment_3(getActivity(),
                imageId, Header);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(3);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Toast.makeText(getActivity(),"Your Position:"+arg2,Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }



}


























