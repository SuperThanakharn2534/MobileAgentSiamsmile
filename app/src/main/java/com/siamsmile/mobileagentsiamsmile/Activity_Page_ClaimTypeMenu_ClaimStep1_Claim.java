package com.siamsmile.mobileagentsiamsmile;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import Adapter.Adapter_Listview_;
import Adapter.Adapter_Menu;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 29-Sep-17.
 */

public class Activity_Page_ClaimTypeMenu_ClaimStep1_Claim extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private DrawerLayout drawerLayout;
    private GridView gridView;
    private String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Activity_Menu_MGR mgr = new Activity_Menu_MGR();
    GridView Menugridview;
    private BottomNavigationView bottomNavigationView;
    ListView list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_claimtypemenu_claimstep1_claim);

        try {
            SetHeader("รับเรื่องสินไหม", false, false);
            SetMenu();
           // ButtonNavigation();
            Button();
            Setlistview();

        }catch (Exception e){}




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
        gridview.setAdapter(new Adapter_Menu(this,Activity_Page_ClaimTypeMenu_ClaimStep1_Claim.this));
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


    public void SetHeader(String TextTitle, boolean ShowAddButton, boolean ShowNotify) {

        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.header_menu);

        TextView Title = (TextView) getSupportActionBar().getCustomView().findViewById(R.id.textView_header);
        Title.setText(TextTitle);
    }

    public  void Button(){
//        Button next1 = (Button)findViewById(R.id.bt_nextpageclaimstep2_Map);
//        next1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getBaseContext(), Activity_Page_ClaimTypeMenu_ClaimStep2_Map.class));
//
//            }
//        });
        Button back1 = (Button)findViewById(R.id.bt_step1_back);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Activity_Page_ClaimTypeMenu.class));

            }
        });



    }

    public  void  Setlistview(){


        String[] itemname ={" TEST1" ,
                             "TEST2" ,
                             "TEST3" ,};

        Integer[] imgid1={
                R.drawable.mortgage,
                R.drawable.mortgage,
                R.drawable.mortgage
        };

        Integer[] imgid2={
                R.drawable.arrow,
                R.drawable.arrow,
                R.drawable.arrow
        };





        Adapter_Listview_  adapter =new Adapter_Listview_(Activity_Page_ClaimTypeMenu_ClaimStep1_Claim.this,
                itemname, imgid1,imgid2);
        list=(ListView)findViewById(R.id.Listdata);
        list.setAdapter(adapter);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition     = position;
                switch (position){
                    case  0:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        Intent myIntent = new Intent(getBaseContext(),Activity_Page_ClaimTypeMenu_ClaimStep2_Map.class);
                        startActivity(myIntent);
                        break;
                    case  1:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
                        // activity.startActivity(myIntent);
                        Intent myIntent2 = new Intent(getBaseContext(),Activity_Page_ClaimTypeMenu_ClaimStep2_Map.class);
                        startActivity(myIntent2);

                        break;
                    case  2:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
                        // activity.startActivity(myIntent);
                        Intent myIntent3 = new Intent(getBaseContext(),Activity_Page_ClaimTypeMenu_ClaimStep2_Map.class);
                        startActivity(myIntent3);

                        break;
                    default:
                        break;

                }

            }


        });
    }









}
