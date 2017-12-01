package com.siamsmile.mobileagentsiamsmile;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import Adapter.Adapter_Botton;
import Adapter.Adapter_ListData;
import Adapter.Adapter_Menu;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 28-Sep-17.
 */

public class Activity_Page_ProspectList extends AppCompatActivity  implements AdapterView.OnItemClickListener {

    private DrawerLayout drawerLayout;
    private GridView  gridView;
    private String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Activity_Menu_MGR mgr = new Activity_Menu_MGR();
    GridView Menugridview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_prospectlist);


        try {
            SetHeader("ผู้มุ่งหวัง", false, false);
            SetMenu();
            SetBottom();
            SetList_Name();

        }catch (Exception e){}

    }

    public void selectItem(int position) {
        mgr.CustomerMenuSelect(position, this);

    }

    public void SetMenu() {

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        //----------------------------
        planets = getResources().getStringArray(R.array.CustomerMenu);
        gridView = (GridView) findViewById(R.id.gridview_menu);
        gridView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, planets));
        gridView.setOnItemClickListener(this);
        //---------------------------
        //Close and open sideBar
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Adapter_Menu Adapter = new Adapter_Menu(Activity_Page_Main.this,
//                mgr.MenuText(), mgr.MenuImg());
//        Menugridview = (GridView) findViewById(R.id.gridview_menu);
//        Menugridview.setAdapter(Adapter);

        GridView gridview = (GridView) findViewById(R.id.gridview_menu);
        gridview.setAdapter(new Adapter_Menu(this,Activity_Page_ProspectList.this));
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

    public void  SetBottom(){

        GridView gridview = (GridView) findViewById(R.id.gridview_bottom);
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_ProspectList.this));
        gridview.setNumColumns(4);

    }

    public  void  SetList_Name(){

        String[] txt_Listdata = {" นาย  FirstName1  LastName1 Phone : XXXXXXXX  อยูที่อยู่ : XXX/XXX  ",
                " นาย  FirstName2  LastName2 Phone : XXXXXXXX  อยูที่อยู่ : XXX/XXX  ",
                " นาย  FirstName3  LastName3 Phone : XXXXXXXX  อยูที่อยู่ : XXX/XXX  ",
                " นาย  FirstName4  LastName4 Phone : XXXXXXXX  อยูที่อยู่ : XXX/XXX  ",
                " นาย  FirstName5  LastName5 Phone : XXXXXXXX  อยูที่อยู่ : XXX/XXX  ",
                " นาย  FirstName6  LastName6 Phone : XXXXXXXX  อยูที่อยู่ : XXX/XXX  ",
                " นาย  FirstName7  LastName7 Phone : XXXXXXXX  อยูที่อยู่ : XXX/XXX  "};



        Adapter_ListData adapter = new Adapter_ListData( Activity_Page_ProspectList.this, txt_Listdata );

        ListView listData = (ListView) findViewById( R.id.List_Name );
        listData.setAdapter( adapter );

        listData.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition     = position;
                switch (position){
                    case  0:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        Intent myIntent = new Intent(getBaseContext(),Activity_Page_ProspectDetail.class);
                        startActivity(myIntent);
                        break;
                    case  1:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
                        // activity.startActivity(myIntent);
                        Intent myIntent2 = new Intent(getBaseContext(),Activity_Page_ProspectDetail.class);
                        startActivity(myIntent2);

                        break;
                    case  2:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
                        // activity.startActivity(myIntent);
                        Intent myIntent3 = new Intent(getBaseContext(),Activity_Page_ProspectDetail.class);
                        startActivity(myIntent3);

                        break;
                    case  3:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
                        // activity.startActivity(myIntent);
                        Intent myIntent4 = new Intent(getBaseContext(),Activity_Page_ProspectDetail.class);
                        startActivity(myIntent4);

                        break;
                    case  4:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
                        // activity.startActivity(myIntent);
                        Intent myIntent5 = new Intent(getBaseContext(),Activity_Page_ProspectDetail.class);
                        startActivity(myIntent5);

                        break;
                    case  5:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
                        // activity.startActivity(myIntent);
                        Intent myIntent6 = new Intent(getBaseContext(),Activity_Page_ProspectDetail.class);
                        startActivity(myIntent6);

                        break;
                    case  6:
                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
                        // activity.startActivity(myIntent);
                        Intent myIntent7 = new Intent(getBaseContext(),Activity_Page_ProspectDetail.class);
                        startActivity(myIntent7);

                        break;
                    default:
                        break;

                }

            }


        });

    }


}
