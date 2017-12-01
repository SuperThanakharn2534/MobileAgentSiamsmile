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
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import Adapter.Adapter_Botton;
import Adapter.Adapter_Menu;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 29-Sep-17.
 */

public class Activity_Page_ClaimTypeMenu extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private DrawerLayout drawerLayout;
    private GridView gridView;
    private String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Activity_Menu_MGR mgr = new Activity_Menu_MGR();
    GridView Menugridview;
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_claimtypemenu);

        try {
            SetHeader("รับเรื่องสินไหม", false, false);
            SetMenu();
            Button();
            ImageBottom();
            SetMenuBottom();

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
        gridview.setAdapter(new Adapter_Menu(this,Activity_Page_ClaimTypeMenu.this));
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


        ImageButton  next = (ImageButton)findViewById(R.id.im_insuranceHome);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Activity_Page_ClaimTypeMenu_ClaimPolicy_Policy.class));

            }
        });

        ImageButton imb = (ImageButton)findViewById(R.id.im_HealthInsurance);
        imb.setOnClickListener( new View.OnClickListener() {
                      @Override
                      public void onClick(View view) {
                          startActivity(new Intent(getBaseContext(), Activity_Page_ClaimSearch_Step1.class));

                      }
                  } );




    }

    public  void  ImageBottom(){

        ImageButton sent1 = (ImageButton)findViewById( R.id.imb_Map );
                     sent1.setOnClickListener( new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {

                             startActivity(new Intent(getBaseContext(), Activity_Page_ClaimMap.class));

                         }
                     } );

        ImageButton  sent2 = (ImageButton)findViewById( R.id.imb_Status );
                     sent2.setOnClickListener( new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
                             //startActivity(new Intent(getBaseContext(), Activity_Page_ClaimStatus.class));
                             startActivity(new Intent(getBaseContext(), Activity_Page_ClaimTypeMenu_Status_Tab.class));
                         }
                     } );

        ImageButton  sent3 = (ImageButton)findViewById( R.id.imb_Feedback );
                     sent3.setOnClickListener( new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
                             startActivity(new Intent(getBaseContext(), Activity_Page_ClaimFeedBack.class));
                         }
                     } );



    }

    public void  SetMenuBottom(){

        GridView gridview = (GridView) findViewById(R.id.gridview_bottom);
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_ClaimTypeMenu.this));
        gridview.setNumColumns(4);

    }


}
