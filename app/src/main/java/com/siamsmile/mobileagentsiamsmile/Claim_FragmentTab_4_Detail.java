package com.siamsmile.mobileagentsiamsmile;

import android.app.ActionBar;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
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
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Locale;

import Adapter.Adapter_Botton;
import MGR.Activity_Bottom_MGR;
import MGR.Activity_Menu_MGR;

/**
 * Created by aligndev on 22-Nov-17.
 */

public class Claim_FragmentTab_4_Detail extends AppCompatActivity {

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
    private ViewPager mViewPager_4;
    TabLayout tabLayout_4;
    // Calendar
//    public java.util.Calendar myCalendar;
//    DatePickerDialog.OnDateSetListener date;
    public String DateTime1;
    public int mHour,mMinute;
    public int imbDate = 0;




    public Calendar myCalendar;
    DatePickerDialog.OnDateSetListener date;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.claim_fragmenttab_4_detail );
        try {
            SetHeader("รายละเอียดการเคลม", false, false);
            //SetMenu();
            SetBottom();
            SetAddFileImage();
            SetCalendar();
            //SetTab_PaySearch_1();


        }catch (Exception e){}
    }

//    public void selectItem(int position) {
//        mgr.CustomerMenuSelect(position, this);
//    }
//
//    public void SetMenu() {
//
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_02);
//        //----------------------------
//        planets = getResources().getStringArray(R.array.CustomerMenu);
//        gridView = (GridView) findViewById(R.id.gridview_menu);
//        gridView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, planets));
//        gridView.setOnItemClickListener(this);
//        //---------------------------
//        //Close and open sideBar
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_02);
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
//        gridview.setAdapter(new Adapter_Menu(this,Claim_FragmentTab_2_Detail.this));
//        gridview.setNumColumns(3);
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
//
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
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
        gridview.setAdapter(new Adapter_Botton(this,Claim_FragmentTab_4_Detail.this));
        gridview.setNumColumns(4);

        gridview.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                selectItem2(position);

            }
        } );
    }

    public  void  SetCalendar(){

        myCalendar = Calendar.getInstance();
        date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                String myFormat = "dd/MM/yyyy";
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                DateTime1 = sdf.format(myCalendar.getTime());
                final TextView txtTime = (TextView)findViewById( R.id.txt_calendar);

                //========== Get Current Time
                final Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);
                //========== Launch Time Picker Dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(Claim_FragmentTab_4_Detail.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {

                                 txtTime.setText(DateTime1+" เวลาประมาณ "+hourOfDay + ":" + minute);
//                                if(imbDate==1){
//                                    etStartDate.setText(DateTime1+" "+hourOfDay+":"+minute);
//                                }
//                                if(imbDate==2){
//                                    etEndDate.setText(DateTime1+" "+hourOfDay+":"+minute);
//                                }
                            }
                        }, mHour, mMinute, false);
                timePickerDialog.show();

            }
        };


        final ImageView imgcalendar = (ImageView)findViewById( R.id.img_calendar);
        imgcalendar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // TODO Auto-generated method stub
                new DatePickerDialog(Claim_FragmentTab_4_Detail.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();




            }
        } );



    }

    public  void  SetAddFileImage(){

        TextView textView =(TextView)findViewById( R.id.Link_Image);
        textView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog( Claim_FragmentTab_4_Detail.this);
                dialog.requestWindowFeature( Window.FEATURE_NO_TITLE );
                // dialog.setContentView(R.layout.activity_page_paymentreport_fragmenttab_1_popup);fragmenttab_1_popup.xml
                dialog.setContentView( R.layout.claim_framenttab_2_popup_detail );
                dialog.setCancelable( true );


                Button button2 = (Button) dialog.findViewById( R.id.bt_clickpage_2 );
                button2.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText( Claim_FragmentTab_4_Detail.this, "Click Cancel", Toast.LENGTH_SHORT ).show();
                        dialog.cancel();
                    }
                } );

                dialog.show();

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
            Intent intentAdd = new Intent(Claim_FragmentTab_4_Detail.this,Activity_Page_ClaimTypeMenu_Status_Tab.class);
            startActivity(intentAdd);
        }
        return super.onOptionsItemSelected(item);
    }





}




