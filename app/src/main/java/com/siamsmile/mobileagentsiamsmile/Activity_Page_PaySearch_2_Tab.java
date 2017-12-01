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
import Adapter.Adapter_TabBar_PaySearch_2;
import MGR.Activity_Bottom_MGR;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Activity_Page_PaySearch_2_Tab extends AppCompatActivity implements AdapterView.OnItemClickListener  {

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
   // private Adapter_TabBar_Payment TabBar;
    private ViewPager mViewPager_3;
    TabLayout tabLayout_3;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_page_paysearch_2_tab );


        try {
            SetHeader("ส่งเบี้ยประกัน", false, false);
            SetMenu();
            SetBottom();
            SetTab_PaySearch_2();


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
        gridview.setAdapter(new Adapter_Menu(this,Activity_Page_PaySearch_2_Tab.this));
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
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_PaySearch_2_Tab.this));
        gridview.setNumColumns(4);

        gridview.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                selectItem2(position);
            }
        } );


    }

    public void SetTab_PaySearch_2(){

        Adapter_TabBar_PaySearch_2   TabBar_3 = new Adapter_TabBar_PaySearch_2( getSupportFragmentManager() );
        mViewPager_3 = (ViewPager)findViewById(R.id.container_3);
        mViewPager_3.setAdapter(TabBar_3);

        tabLayout_3 = (TabLayout)findViewById(R.id.tabs_3);
        tabLayout_3.setupWithViewPager(mViewPager_3);

        TextView tabfont1 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);
        TextView tabfont2 = (TextView) LayoutInflater.from(this).inflate(R.layout.claim_tabsbar_layout,null);



        tabfont1.setText("กรมธรรม์ที่ต้องส่งเบี้ย");
        tabfont2.setText("ช่องทางการชำระเบี้ย");


        tabLayout_3.getTabAt(0).setCustomView(tabfont1);
        tabLayout_3.getTabAt(1).setCustomView(tabfont2);

        TextView button = (TextView) findViewById( R.id.bt_payment );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),PaySearch_2_FragmentTab_2.class));
            }
        } );


    }



}
