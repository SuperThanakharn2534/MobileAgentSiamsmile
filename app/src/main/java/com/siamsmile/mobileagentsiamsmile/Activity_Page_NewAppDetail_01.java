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
import android.widget.TextView;

import Adapter.Adapter_Botton;
import Adapter.Adapter_Menu;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 28-Sep-17.
 */

public class Activity_Page_NewAppDetail_01 extends AppCompatActivity implements AdapterView.OnItemClickListener {

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
        setContentView(R.layout.activity_page_newappdetail_01);

        try {
            SetHeader("บันทึก NewAppDetail_01", false, false);
            Button();
            SetMenu();

        }catch (Exception e){}




    }

    public  void  Button(){
        Button sent = (Button) findViewById(R.id.bt_nextpage_detail_01);
        sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Activity_Page_NewAppPayment_03.class));
            }
        });


//        Button backpage = (Button) findViewById(R.id.button_backpage);
//        backpage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getBaseContext(), Activity_Page_NewAppList.class));
//            }
//        });

        Button sent2 = (Button)findViewById( R.id.bt_frome );
               sent2.setOnClickListener( new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       startActivity(new Intent(getBaseContext(), Activity_Page_NewAppDetail_02.class));
                   }
               } );



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
        gridview.setAdapter(new Adapter_Menu(this, Activity_Page_NewAppDetail_01.this));
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
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
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

    public void  SetBottom(){

        GridView gridview = (GridView) findViewById(R.id.bottom_nav_view);
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_NewAppDetail_01.this));
        gridview.setNumColumns(4);

    }

}
