package com.siamsmile.mobileagentsiamsmile;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.Adapter_Botton;
import Adapter.Adapter_Menu;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 19-Oct-17.
 */

public class Activity_Page_ClaimSearch_Step1 extends AppCompatActivity implements AdapterView.OnItemClickListener {



    private DrawerLayout drawerLayout;
    private GridView gridView;
    private String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Activity_Menu_MGR mgr = new Activity_Menu_MGR();
    GridView Menugridview;
    private BottomNavigationView bottomNavigationView;
    private Spinner mList2;
    private ArrayList<String> mThaiClub2 = new ArrayList<String>();




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_page_claimsearch_step1 );


        try {
            SetHeader("รับเรื่องสินไหม_01", false, false);
            SetMenu();
            ButtonNavigation();
            Button();
            List();
            SetBottom();


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
        gridview.setAdapter(new Adapter_Menu(this,Activity_Page_ClaimSearch_Step1.this));
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

    public  void  ButtonNavigation(){


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav_view);
        bottomNavigationView.inflateMenu(R.menu.button_navigation);
        bottomNavigationView.setItemBackgroundResource(R.color.colorPrimary);
        //bottomNavigationView.setSelectedItemId(R.id.activity_main);
        bottomNavigationView.setItemIconTintList( ContextCompat.getColorStateList(this, R.color.color));
        bottomNavigationView.setItemTextColor(ContextCompat.getColorStateList(this,R.color.color));

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_recent:
                        // do this event
                        return true;
                    case R.id.item_favorite:
                        // do this event
                        return true;
                    case R.id.item_nearby:
                        // do this event
                        return true;
                    case R.id.item_other:
                        // do this event
                        return true;
                }
                return false;
            }
        });
    }

    public void SetHeader(String TextTitle, boolean ShowAddButton, boolean ShowNotify) {

        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.header_menu);

        TextView Title = (TextView) getSupportActionBar().getCustomView().findViewById(R.id.textView_header);
        Title.setText(TextTitle);
    }

    public  void Button(){


        Button next = (Button)findViewById(R.id.bt_next_search);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Activity_Page_ClaimApplication_Step2.class));

            }
        });


        Button back = (Button)findViewById(R.id.bt_backtopageclaimtypemenu2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Activity_Page_ClaimTypeMenu.class));

            }
        });



    }

    public  void  List(){

        mList2 = (Spinner) findViewById(R.id.spinner2);
        createListData();

        // Adapter ตัวแรก
        ArrayAdapter<String> adapterThai2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, mThaiClub2);
        mList2.setAdapter(adapterThai2);

    }

    private void createListData() {
        mThaiClub2.add("เลือกประเภทที่ต้องการค้นหา");
        mThaiClub2.add("ชื่อ - นามสกุล");
        mThaiClub2.add("เลขที่บัตรประชาชน");
        mThaiClub2.add("เลขที่กรมธรรม์");
        mThaiClub2.add("เบอร์โทร");



    }

    public void  SetBottom(){

        GridView gridview = (GridView) findViewById(R.id.gridview_bottom);
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_ClaimSearch_Step1.this));
        gridview.setNumColumns(4);

    }




}
