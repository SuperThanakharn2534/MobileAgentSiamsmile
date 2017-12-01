package com.siamsmile.mobileagentsiamsmile;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Adapter.Adapter_Botton;
import MGR.Activity_Bottom_MGR;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 28-Sep-17.
 */

public class Activity_Page_ContractUse_ComPlaint extends AppCompatActivity  {

    private DrawerLayout drawerLayout;
    private GridView gridView;
    private String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Activity_Menu_MGR mgr = new Activity_Menu_MGR();
    Activity_Bottom_MGR mgr2 = new Activity_Bottom_MGR();
    GridView Menugridview;
    private BottomNavigationView bottomNavigationView;
    ListView list;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_contractuse_complaint);

        try {
            SetHeader("ร้องเรียน", false, false);
//            SetMenu();
            SetBottom();
            SetDropDownList();

        }catch (Exception e){}

    }

//    public void selectItem(int position) {
//        mgr.CustomerMenuSelect(position, this);
//    }
//
//    public void SetMenu() {
//
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
//        //----------------------------
//        planets = getResources().getStringArray(R.array.CustomerMenu);
//        gridView = (GridView) findViewById(R.id.gridview_menu);
//        gridView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, planets));
//        gridView.setOnItemClickListener(this);
//        //---------------------------
//        //Close and open sideBar
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
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
//        gridview.setAdapter(new Adapter_Menu(this, Activity_Page_ContractUse_ComPlaint.this));
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
//
//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//        selectItem(position);
//    }
//
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
        getSupportActionBar().setCustomView(R.layout.header_menu);

        TextView Title = (TextView) getSupportActionBar().getCustomView().findViewById(R.id.textView_header);
        Title.setText(TextTitle);
    }

    public void selectItem2(int position) {
        mgr2.CustomerBottomSelect(position ,this);
    }

    public void  SetBottom(){

        GridView gridview = (GridView) findViewById(R.id.gridview_bottom);
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_ContractUse_ComPlaint.this));
        gridview.setNumColumns(4);

        gridview.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                selectItem2(position);

            }
        } );



    }

    public  void  SetDropDownList(){

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = Activity_Page_Contract_Use_Complaint_ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new Activity_Page_Contract_Use_ComPlaint_CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        //expandableListView.setDividerHeight(2);
        expandableListView.setOnGroupExpandListener( new ExpandableListView.OnGroupExpandListener()
        {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Collapsed.",
                        Toast.LENGTH_SHORT).show();

            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
//                Toast.makeText(
//                        getApplicationContext(),
//                        expandableListTitle.get(groupPosition)
//                                + " -> "
//                                + expandableListDetail.get(
//                                expandableListTitle.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT
//                ).show();

               // int itemPosition     = groupPosition;
               // int itemPosition_childPosition     = childPosition;


if(groupPosition == 0) {

    switch (childPosition) {
        case 0:
            Intent myIntent = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_2.class );
            startActivity( myIntent );
            break;
        case 1:
            Intent myIntent2 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_2.class );
            startActivity( myIntent2 );

            break;
        case 2:
            Intent myIntent4 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_2.class );
            startActivity( myIntent4 );

            break;
        case 3:
            Intent myIntent5 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_2.class );
            startActivity( myIntent5 );

            break;
        case 4:
            Intent myIntent6 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_2.class );
            startActivity( myIntent6 );

            break;
        default:
            break;
    }
}

else if(groupPosition == 1) {

           switch (childPosition) {
               case 0:
                   Intent myIntent = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_3.class );
                   startActivity( myIntent );
                   break;
               case 1:
                   Intent myIntent2 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_3.class );
                   startActivity( myIntent2 );

                   break;
               case 2:
                   Intent myIntent4 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_3.class );
                   startActivity( myIntent4 );

                   break;
               case 3:
                   Intent myIntent5 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_3.class );
                   startActivity( myIntent5 );

                   break;
               case 4:
                   Intent myIntent6 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_3.class );
                   startActivity( myIntent6 );

                   break;
               default:
                   break;
                    }
                }
 else if(groupPosition == 2) {

     switch (childPosition) {
         case 0:
             Intent myIntent = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_4.class );
             startActivity( myIntent );
             break;
         case 1:
             Intent myIntent2 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_4.class );
             startActivity( myIntent2 );

             break;
         case 2:
             Intent myIntent4 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_4.class );
             startActivity( myIntent4 );

             break;
         case 3:
             Intent myIntent5 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_4.class );
             startActivity( myIntent5 );

             break;
         case 4:
             Intent myIntent6 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_4.class );
             startActivity( myIntent6 );

             break;
         default:
             break;
     }
                }
else if(groupPosition == 3){

   switch (childPosition) {
       case 0:
           Intent myIntent = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_5.class );
           startActivity( myIntent );
           break;
       case 1:
           Intent myIntent2 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_5.class );
           startActivity( myIntent2 );

           break;
       case 2:
           Intent myIntent4 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_5.class );
           startActivity( myIntent4 );

           break;
       case 3:
           Intent myIntent5 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_5.class );
           startActivity( myIntent5 );

           break;
       case 4:
           Intent myIntent6 = new Intent( getBaseContext(), Activity_Page_ContractUse_ComPlaint_5.class );
           startActivity( myIntent6 );

           break;
       default:
           break;
   }
                }
                return false;
            }
        });


    }

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
            Intent intentAdd = new Intent(Activity_Page_ContractUse_ComPlaint.this,Activity_Page_ContractUse.class);
            startActivity(intentAdd);
        }
        return super.onOptionsItemSelected(item);
    }






}
