package com.siamsmile.mobileagentsiamsmile;

import android.app.ActionBar;
import android.app.AlertDialog;
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
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.Adapter_Botton;
import Adapter.Adapter_Menu;
import Adapter.Adapter_PaySearch_2_Fragment_3;
import MGR.Activity_Bottom_MGR;
import MGR.Activity_ContracUse_MGR;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 29-Sep-17.
 */

public class Activity_Page_ContractUse extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private DrawerLayout drawerLayout;
    private GridView gridView;
    private String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Activity_Menu_MGR mgr = new Activity_Menu_MGR();
    Activity_ContracUse_MGR  mgr2 = new Activity_ContracUse_MGR();
    Activity_Bottom_MGR mgr3 = new Activity_Bottom_MGR();
    GridView Menugridview;
    private BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_contractuse);

        try {
            SetHeader("ช่องทางการติดต่อ", false, false);
            SetMenu();
            SetBottom();
            //SetBottom_ContracUse();
            SetGrid();

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
        gridview.setAdapter(new Adapter_Menu(this, Activity_Page_ContractUse.this));
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

    public void selectItem2(int position) {
        mgr3.CustomerBottomSelect(position ,this);
    }

    public void  SetBottom(){

        GridView gridview = (GridView) findViewById(R.id.gridview_bottom);
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_ContractUse.this));
        gridview.setNumColumns(4);

        gridview.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                selectItem2(position);

            }
        } );

    }

    public  void  SetGrid(){

        GridView gridview = (GridView) findViewById(R.id.contrac_use);
        //=====================================  set list =================================
        String[][] dataProspect = new String[][]{
                {String.valueOf(R.drawable.contrac1),"Call Center"},
                {String.valueOf(R.drawable.agent),"ติดต่อตัวแทน"},
                {String.valueOf(R.drawable.contrac3),"Status Agent"},
                {String.valueOf(R.drawable.contrac4),"Line"},
                {String.valueOf(R.drawable.contrac5),"FaceBook"},
                {String.valueOf(R.drawable.contrac6),"YouTube"},
                {String.valueOf(R.drawable.contrac7),"E-Mail"},
                {String.valueOf(R.drawable.contrac8),"Alert"},
                {String.valueOf(R.drawable.contrac9),"ร้องเรียน"}
        };

        ArrayList<Integer> imageId = new ArrayList<>();
        ArrayList<String> Header = new ArrayList<>();
        for(int i = 0;i<9;i++) {
            int image1 = Integer.parseInt( dataProspect[i][0] );
            imageId.add( image1 );
            Header.add( dataProspect[i][1] );


        }

        Adapter_PaySearch_2_Fragment_3 adapter = new Adapter_PaySearch_2_Fragment_3(getBaseContext(),
                imageId, Header);
        gridview.setAdapter(adapter);
        gridview.setNumColumns(3);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
               // Toast.makeText(getBaseContext(),"Your Position:"+arg2,Toast.LENGTH_SHORT).show();

                int itemPosition     = arg2;
                // int itemPosition_childPosition     = childPosition;
                switch (arg2) {
                    case 0:
                        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_Page_ContractUse.this);
                        final View mView =getLayoutInflater().inflate( R.layout.activity_page_contractuse_callcenter,null );
                        Button button1 = (Button)mView.findViewById(R.id.bt_clickpage_2);
                        Button button2 = (Button)mView.findViewById(R.id.bt_clickpage_1);
                        builder.setView( mView );
                        final AlertDialog alertDialog = builder.create();

                        button1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Toast.makeText(getBaseContext(),"Click Cancel",Toast.LENGTH_SHORT).show();
                                alertDialog.dismiss();
                            }
                        });
                        button2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getBaseContext(),"Click Cancel",Toast.LENGTH_SHORT).show();
                                alertDialog.dismiss();
                            }
                        });
                        alertDialog.show();
                        break;

                    case 1:
                        Intent myIntent2 = new Intent( getBaseContext(), Activity_Page_AgentLogin.class );
                        startActivity( myIntent2 );

                        break;

                    case  2:
                        Intent myIntent3 = new Intent(getBaseContext(),Activity_Page_ContractUse_StatusAgent.class);
                        startActivity(myIntent3);

                        break;


                    case  3:
                        Intent myIntent4 = new Intent(getBaseContext(),Activity_Page_AgentLogin.class);
                        startActivity(myIntent4);

                        break;
                    case  4:
                        Intent myIntent5 = new Intent(getBaseContext(),Activity_Page_AgentLogin.class);
                        startActivity(myIntent5);
                        break;

                    case  5:
                        Intent myIntent6 = new Intent(getBaseContext(),Activity_Page_AgentLogin.class);
                        startActivity(myIntent6);
                        break;

                    case  6:
                        Intent myIntent7 = new Intent(getBaseContext(),Activity_Page_AgentLogin.class);
                        startActivity(myIntent7);
                        break;

                    case  7:
                        Intent myIntent8 = new Intent(getBaseContext(),Activity_Page_AgentLogin.class);
                        startActivity(myIntent8);
                        break;

                    case  8:
                        Intent myIntent9 = new Intent(getBaseContext(),Activity_Page_ContractUse_ComPlaint.class);
                        startActivity(myIntent9);
                        break;
                    default:
                        break;
                }


            }
        });


    }





}
