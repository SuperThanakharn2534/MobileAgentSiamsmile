package com.siamsmile.mobileagentsiamsmile;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import Adapter.Adapter_Botton;
import Adapter.Adapter_TabBar_PaySearch_1_FragmentTab2_Tab;
import MGR.Activity_Bottom_MGR;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class PaySearch_1_FragmentTab_2 extends AppCompatActivity   {


    private DrawerLayout drawerLayout;
    private GridView gridView;
    private String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Activity_Menu_MGR mgr = new Activity_Menu_MGR();
    Activity_Bottom_MGR mgr2 = new Activity_Bottom_MGR();
    GridView Menugridview;
    private BottomNavigationView bottomNavigationView;
    //TabBar
    private Adapter_TabBar_PaySearch_1_FragmentTab2_Tab TabBar;
    private ViewPager mViewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.paysearch_1_fragmenttab_2 );


        try {
            SetHeader("ประวัติการชำระเบี้ยประกัน", false, false);
           // SetMenu();
            SetBottom();
            SetTab();



        }catch (Exception e){}
    }
//    public void selectItem(int position) {
//        mgr.CustomerMenuSelect(position, this);
//    }
//    public void SetMenu() {
//
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_02);
//        //----------------------------
//        planets = getResources().getStringArray(R.array.CustomerMenu);
//        gridView = (GridView) findViewById(R.id.gridview_menu);
//        gridView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, planets));
//        gridView.setOnItemClickListener(this);
//        //---------------------------
//        //Close and open sideBar
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_02);
//        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
//        mDrawerLayout.addDrawerListener(mToggle);
//        mToggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
////        Adapter_Menu Adapter = new Adapter_Menu(Activity_Page_Main.this,
////                mgr.MenuText(), mgr.MenuImg());
////        Menugridview = (GridView) findViewById(R.id.gridview_menu);
////        Menugridview.setAdapter(Adapter);
//
//        GridView gridview = (GridView) findViewById(R.id.gridview_menu);
//        gridview.setAdapter(new Adapter_Menu(this,PaySearch_1_FragmentTab_2.this));
//        gridview.setNumColumns(3);
//
//        Button button = (Button)findViewById( R.id.bt_logout );
//        button.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getBaseContext(), Activity_Page_AgentLogin.class));
//            }
//        } );
//    }
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        selectItem(position);
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (mToggle.onOptionsItemSelected(item)) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    public void SetHeader(String TextTitle, boolean ShowAddButton, boolean ShowNotify) {

        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.header_menu_detail);

        TextView Title = (TextView) getSupportActionBar().getCustomView().findViewById(R.id.textView_header_detail);
        Title.setText(TextTitle);


    }


    public void selectItem2(int position) {
        mgr2.CustomerBottomSelect(position ,this);
    }

    public void  SetBottom(){
        GridView gridview = (GridView) findViewById(R.id.gridview_bottom);
        gridview.setAdapter(new Adapter_Botton(this,PaySearch_1_FragmentTab_2.this));
        gridview.setNumColumns(4);

        gridview.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                selectItem2(position);

            }
        } );



    }

    public void SetTab(){

        TabBar =new Adapter_TabBar_PaySearch_1_FragmentTab2_Tab( getSupportFragmentManager() );
        mViewPager = (ViewPager)findViewById(R.id.container_301);
        mViewPager.setAdapter(TabBar);

        tabLayout = (TabLayout)findViewById(R.id.tabs_301);
        tabLayout.setupWithViewPager(mViewPager);

        TextView tabfont1 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont2 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont3 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont4 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont5 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);

        tabfont1.setText("ลูกค้าจัดเก็บ");
        tabfont2.setText("ลูกค้ายกเลิก");
        tabfont3.setText("New App ");
        tabfont4.setText("ใกล้หมดอายุ");
        tabfont5.setText("ทั้งหมด");

        tabLayout.getTabAt(0).setCustomView(tabfont1);
        tabLayout.getTabAt(1).setCustomView(tabfont2);
        tabLayout.getTabAt(2).setCustomView(tabfont3);
        tabLayout.getTabAt(3).setCustomView(tabfont4);
        tabLayout.getTabAt(4).setCustomView(tabfont5);

    }


    //========    Set ImageBotton Clck Back Page PaySearch_1_FragmentTab_1
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.menu_add){
            //Toast.makeText(this,"Action Add",Toast.LENGTH_LONG).show();
            Intent intentAdd = new Intent(getBaseContext(),Activity_Page_PaySearch_1_Tab.class);
            startActivity(intentAdd);



        }

        return super.onOptionsItemSelected(item);
    }


    //==========================================

}


























