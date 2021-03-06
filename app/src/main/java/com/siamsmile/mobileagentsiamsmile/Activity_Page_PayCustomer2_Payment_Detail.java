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
import Adapter.Adapter_Payment;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 20-Oct-17.
 */

public class Activity_Page_PayCustomer2_Payment_Detail extends AppCompatActivity implements AdapterView.OnItemClickListener{


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
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_page_paycustomer2_payment_detail );

        try {
            SetHeader("บันทึกการส่งเบี้ย_02", false, false);
            SetMenu();
            Button();
            SetBottom();
            SetBottom_NewAppPayment();

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
        gridview.setAdapter(new Adapter_Menu(this,Activity_Page_PayCustomer2_Payment_Detail.this));
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


        Button next = (Button)findViewById(R.id.bt_nextpage_payhistory);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Activity_Page_PayCustomer2_Payment_History.class));

            }
        });


        Button back = (Button)findViewById(R.id.bt_nextpage_payment);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Activity_Page_PayCustomer2_Payment.class));

            }
        });


    }

    public void  SetBottom(){

        GridView gridview = (GridView) findViewById(R.id.gridview_bottom);
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_PayCustomer2_Payment_Detail.this));
        gridview.setNumColumns(4);

    }

    public void  SetBottom_NewAppPayment(){

        GridView gridview2 = (GridView) findViewById(R.id.menu_NewAppPayment);
        gridview2.setAdapter(new Adapter_Payment(this,Activity_Page_PayCustomer2_Payment_Detail.this));
        gridview2.setNumColumns(3);

    }




}
