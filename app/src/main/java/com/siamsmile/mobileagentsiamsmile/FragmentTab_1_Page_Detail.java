package com.siamsmile.mobileagentsiamsmile;

import android.app.ActionBar;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Adapter.Adapter_Menu;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class FragmentTab_1_Page_Detail extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    private DrawerLayout drawerLayout;
    private GridView gridView;
    private String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Activity_Menu_MGR mgr = new Activity_Menu_MGR();
    GridView Menugridview;
    private BottomNavigationView bottomNavigationView;
    LocalActivityManager mLocalActivityManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        setContentView( R.layout.paymentcustomer1_tab_detail1 );


        try {
            SetHeader("รายละเอี่ยดกรมธรรม์", false, false);
            SetButton();
            SetDropDownList();
            SetMenu();

        }catch (Exception e){}






    }



    public void SetButton() {

        Button button = (Button) findViewById( R.id.bt_claim );
        Button button1 = (Button)findViewById( R.id.bt_payment );
        Button button2 = (Button)findViewById( R.id.bt_newapp );

        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getBaseContext(), Tab.class ) );
            }
        } );

        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getBaseContext(), Tab.class ) );
            }
        } );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getBaseContext(), Tab.class ) );

            }
        } );

    }

    public void SetDropDownList() {


        expandableListView = (ExpandableListView) findViewById( R.id.expandableListView );
        expandableListDetail = FragmentTab_1_Detail_ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>( expandableListDetail.keySet() );
        expandableListAdapter = new FragmentTab_1_Detail_CustomerExpandableListAdapter( this, expandableListTitle, expandableListDetail );
        expandableListView.setAdapter( expandableListAdapter );
        //expandableListView.setDividerHeight(2);
        expandableListView.setOnGroupExpandListener( new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText( getApplicationContext(),
                        expandableListTitle.get( groupPosition ) + " List Expanded.",
                        Toast.LENGTH_SHORT ).show();
            }
        } );
        expandableListView.setOnGroupCollapseListener( new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText( getApplicationContext(),
                        expandableListTitle.get( groupPosition ) + " List Collapsed.",
                        Toast.LENGTH_SHORT ).show();

            }
        } );

        expandableListView.setOnChildClickListener( new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        expandableListTitle.get(groupPosition)
                                + " -> "
                                + expandableListDetail.get(
                                expandableListTitle.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT
                ).show();

//                int itemPosition = groupPosition;
//                // int itemPosition_childPosition     = childPosition;
//
//                switch (groupPosition) {
//                    case 0:
//                        Intent myIntent = new Intent( getBaseContext(), Tab.class );
//                        startActivity( myIntent );
//                        break;
//                    case 1:
//                        Intent myIntent2 = new Intent( getBaseContext(), Tab.class );
//                        startActivity( myIntent2 );
//
//                        break;
//                    case 3:
//                        Intent myIntent4 = new Intent( getBaseContext(), Tab.class );
//                        startActivity( myIntent4 );
//
//                        break;
//                    case 4:
//                        Intent myIntent5 = new Intent( getBaseContext(), Tab.class );
//                        startActivity( myIntent5 );
//
//                        break;
//                    default:
//                        break;
//                }
                return false;
            }
        } );


    }

    public void SetHeader(String TextTitle, boolean ShowAddButton, boolean ShowNotify) {

        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.header_menu);

        TextView Title = (TextView) getSupportActionBar().getCustomView().findViewById(R.id.textView_header);
        Title.setText(TextTitle);
    }

    public void selectItem(int position) {
        mgr.CustomerMenuSelect(position, this);

    }

    public void SetMenu() {

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_02);
        //----------------------------
        planets = getResources().getStringArray(R.array.CustomerMenu);
        gridView = (GridView) findViewById(R.id.gridview_menu);
        gridView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, planets));
        gridView.setOnItemClickListener(this);
        //---------------------------
        //Close and open sideBar
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_02);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Adapter_Menu Adapter = new Adapter_Menu(Activity_Page_Main.this,
//                mgr.MenuText(), mgr.MenuImg());
//        Menugridview = (GridView) findViewById(R.id.gridview_menu);
//        Menugridview.setAdapter(Adapter);

        GridView gridview = (GridView) findViewById(R.id.gridview_menu);
        gridview.setAdapter(new Adapter_Menu(this,FragmentTab_1_Page_Detail.this));
        gridview.setNumColumns(3);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectItem(position);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
























