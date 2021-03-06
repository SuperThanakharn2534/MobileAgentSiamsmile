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
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import Adapter.Adapter_Botton;
import Adapter.Adapter_Menu;
import Adapter.Adapter_TabBar_Claim;
import MGR.Activity_Bottom_MGR;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Activity_Page_ClaimTypeMenu_Status_Tab extends AppCompatActivity implements AdapterView.OnItemClickListener  {

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
    private Adapter_TabBar_Claim TabBar;
    private ViewPager mViewPager;
    TabLayout tabLayout;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_page_claimtypemenu_tab );


        try {
            SetHeader("ประวัติ/สถานะการเคลม", false, false);
            SetMenu();
            SetBottom();
            SetTab();


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
        gridview.setAdapter(new Adapter_Menu(this,Activity_Page_ClaimTypeMenu_Status_Tab.this));
        gridview.setNumColumns(3);

        Button button = (Button)findViewById( R.id.bt_logout );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Activity_Page_AgentLogin.class));
            }
        } );


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

    public void selectItem2(int position) {
        mgr2.CustomerBottomSelect(position ,this);
    }

    public void  SetBottom(){

        GridView gridview = (GridView) findViewById(R.id.gridview_bottom);
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_ClaimTypeMenu_Status_Tab.this));
        gridview.setNumColumns(4);

        gridview.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                selectItem2(position);

            }
        } );

    }

    public void SetTab(){

         TabBar =new Adapter_TabBar_Claim( getSupportFragmentManager());
        mViewPager = (ViewPager)findViewById(R.id.container);
        mViewPager.setAdapter(TabBar);

        tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        TextView tabfont1 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont2 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont3 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont4 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont5 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont6 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);


        tabfont1.setText("แจ้งเคลม");
        tabfont2.setText("รอการอนุมัติ");
        tabfont3.setText("อนุมัติ");
        tabfont4.setText("ไม่อนุมัติ");
        tabfont5.setText("ชำระค่าสินไหมสำเร็จ");
        tabfont6.setText("ทั้งหมด");


        tabLayout.getTabAt(0).setCustomView(tabfont1);
        tabLayout.getTabAt(1).setCustomView(tabfont2);
        tabLayout.getTabAt(2).setCustomView(tabfont3);
        tabLayout.getTabAt(3).setCustomView(tabfont4);
        tabLayout.getTabAt(4).setCustomView(tabfont5);
        tabLayout.getTabAt(5).setCustomView(tabfont6);



    }



}
