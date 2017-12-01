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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.Adapter_Botton;
import Adapter.Adapter_Contract_Agent;
import Adapter.Adapter_TabBar_PaymentReport;
import MGR.Activity_Bottom_MGR;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 21-Nov-17.
 */

public class Activity_Page_ContractUse_StatusAgent extends AppCompatActivity  {

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
    private Adapter_TabBar_PaymentReport TabBar;
    private ViewPager mViewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_contractuse_agent );
        try {
            SetHeader("ติดต่อตัวแทนในพื้นที่", false, false);
            SetBottom();
            SetListDate();

        }catch (Exception e){}
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
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_ContractUse_StatusAgent.this));
        gridview.setNumColumns(4);

        gridview.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                selectItem2(position);

            }
        } );


    }


    public  void  SetListDate(){

        final Button button = (Button)findViewById( R.id.bt_click1);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ListView listView = (ListView)findViewById( R.id.Data_List );

                //=====================================  set list =================================
                String[][] dataProspect = new String[][]{
                        {String.valueOf(R.drawable.agent),"7410852963\n","นางศรี นวลจันทร์\n","ประทุมธานี\n",String.valueOf(R.drawable.on)}};

                final ArrayList<Integer> imageId = new ArrayList<>();
                final ArrayList<String> Agent_Id = new ArrayList<>();
                final ArrayList<String> Name = new ArrayList<>();
                final ArrayList<String> Area = new ArrayList<>();
                final ArrayList<Integer> imageId2 = new ArrayList<>();

                for(int i = 0;i<1;i++){
                    int image1 = Integer.parseInt(dataProspect[i][0]);
                    imageId.add(image1);
                    Agent_Id.add(dataProspect[i][1]);
                    Name.add(dataProspect[i][2]);
                    Area.add(dataProspect[i][3]);
                    int image2 = Integer.parseInt(dataProspect[i][4]);
                    imageId2.add(image2);
                }
                Adapter_Contract_Agent adapter = new Adapter_Contract_Agent(Activity_Page_ContractUse_StatusAgent.this,
                        imageId, Agent_Id,Name,Agent_Id,Area,imageId2);
                listView.setAdapter(adapter);


                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        Toast.makeText(getBaseContext(),"Your Position:"+arg2,Toast.LENGTH_SHORT).show();
                    }
                });
            }
        } );



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
            Intent intentAdd = new Intent(Activity_Page_ContractUse_StatusAgent.this,Activity_Page_ContractUse.class);
            startActivity(intentAdd);
        }
        return super.onOptionsItemSelected(item);
    }






}
