package com.siamsmile.mobileagentsiamsmile;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 02-Nov-17.
 */


public  class PaySearch_2_FragmentTab_1 extends Fragment  {

    private DrawerLayout drawerLayout;
    private GridView gridView;
    private String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Activity_Menu_MGR mgr = new Activity_Menu_MGR();
    GridView Menugridview;
    private BottomNavigationView bottomNavigationView;
    ListView list;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;
    List<String> data1;
    List<String> data2;
    List<String> Name;
    List<String> appid;
    View rootView;


    public PaySearch_2_FragmentTab_1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return init( inflater.inflate( R.layout.paysearch_2_fragmenttab_1, container, false ) );
    }




    private View init(final View inflate) {

//        Button b = (Button) inflate.findViewById(R.id.bt_payment);
//        b.setOnClickListener(this);
        expandableListView = (ExpandableListView) inflate.findViewById( R.id.expandableListView );
        Activity_Page_PaySearch_2_FragmentTab_1_ExpandableListDataPump opject = new Activity_Page_PaySearch_2_FragmentTab_1_ExpandableListDataPump();
        expandableListDetail = Activity_Page_PaySearch_2_FragmentTab_1_ExpandableListDataPump.getData();
        appid = opject.getAppid();
        Name = opject.getName();
        data1 = opject.getdata1();
        data2 = opject.getdata2();
        expandableListAdapter = new Activity_Page_PaySearch_2_FragmentTab_1_CustomerExpandableListAdapter( getActivity(),appid,Name,data1,data2, expandableListDetail );
        expandableListView.setAdapter( expandableListAdapter );


        expandableListView.setOnGroupExpandListener( new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText( getActivity(),
                        appid.get( groupPosition ) + " List Expanded.",
                        Toast.LENGTH_SHORT ).show();
            }
        } );

        expandableListView.setOnGroupCollapseListener( new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText( getActivity(),
                        appid.get( groupPosition ) + " List Collapsed.",
                        Toast.LENGTH_SHORT ).show();

            }
        } );

        expandableListView.setOnChildClickListener( new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getActivity(),
                        appid.get(groupPosition)
                                + " -> "
                                + expandableListDetail.get(
                                appid.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT
                ).show();


                int itemPosition = groupPosition;
                // int itemPosition_childPosition     = childPosition;
                return false;
            }
        } );


        return inflate;
    }

    private LayoutInflater getLayoutInflater() {
        return null;
    }


//    @Override
//    public void onClick(View view) {
//        startActivity(new Intent(getActivity(),PaySearch_2_FragmentTab_2.class));
//
//
//
//    }
}


























