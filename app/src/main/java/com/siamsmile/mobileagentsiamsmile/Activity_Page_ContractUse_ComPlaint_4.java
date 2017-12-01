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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

import Adapter.Adapter_Botton;
import MGR.Activity_Bottom_MGR;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 28-Sep-17.
 */

public class Activity_Page_ContractUse_ComPlaint_4 extends AppCompatActivity  {

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
        setContentView(R.layout.activity_page_contractuse_complaint4);

        try {
            SetHeader("สอบถาม", false, false);
          //  SetMenu();
            SetBottom();
            setChaptCha();

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
//        gridview.setAdapter(new Adapter_Menu(this, Activity_Page_ContractUse_ComPlaint_4.this));
//        gridview.setNumColumns(3);
//
//
//        Button button = (Button)findViewById( R.id.bt_logout );
//        button.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getBaseContext(), Activity_Page_AgentLogin.class));
//            }
//        } );
//
//
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
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_ContractUse_ComPlaint_4.this));
        gridview.setNumColumns(4);

        gridview.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                selectItem2(position);
            }
        } );
    }

    public void  setChaptCha(){

        final TextCaptcha textCaptcha = new TextCaptcha(600, 150, 4, TextCaptcha.TextOptions.LETTERS_ONLY);
        ImageView imageView = (ImageView) findViewById(R.id.imgCaptchar);
        imageView.setImageBitmap(textCaptcha.getImage());

        Button btnCheck =(Button)findViewById(R.id.btConfirmData);
        final EditText edtTextCaptcha = (EditText) findViewById(R.id.edtTextCaptchar);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTextCaptcha.setError(null);
                int numberOfCaptchaFalse = 0;


                //checking text captcha
                if (!textCaptcha.checkAnswer(edtTextCaptcha.getText().toString().trim())) {
                    edtTextCaptcha.setText("");
                    edtTextCaptcha.setError("Captcha is not match");
                    numberOfCaptchaFalse++;
                }

                if (numberOfCaptchaFalse == 0) {
                    edtTextCaptcha.setText("");
                    Toast.makeText(Activity_Page_ContractUse_ComPlaint_4.this, "All captcha texts match!", Toast.LENGTH_SHORT).show();
                }
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
            Intent intentAdd2 = new Intent(Activity_Page_ContractUse_ComPlaint_4.this,Activity_Page_ContractUse_ComPlaint.class);
            startActivity(intentAdd2);
        }
        return super.onOptionsItemSelected(item);
    }






    }




