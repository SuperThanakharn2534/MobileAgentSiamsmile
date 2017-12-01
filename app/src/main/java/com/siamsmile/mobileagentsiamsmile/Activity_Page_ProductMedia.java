package com.siamsmile.mobileagentsiamsmile;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Adapter.Adapter_Botton;
import Adapter.Adapter_Menu;
import MGR.Activity_Bottom_MGR;
import MGR.Activity_Menu_MGR;
/**
 * Created by aligndev on 29-Sep-17.
 */

public class Activity_Page_ProductMedia extends AppCompatActivity implements AdapterView.OnItemClickListener{

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
    VideoView myVideoV;
    private  Button  bt_stop,bt_start,bt_pause ;

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> Product_expandableListDetail;

    // Yuotube
    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_productmedia);

        try {
            SetHeader("สือและผลิตภัณฑ์", false, false);
            SetMenu();
           // Button();
            SetBottom();
            //Setlistview();
             // SetYuotube();
            SetDropDownList();



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
        gridview.setAdapter(new Adapter_Menu(this, Activity_Page_ProductMedia.this));
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
        mgr2.CustomerBottomSelect(position ,this);
    }

    public void  SetBottom(){
        GridView gridview = (GridView) findViewById(R.id.gridview_bottom);
        gridview.setAdapter(new Adapter_Botton(this,Activity_Page_ProductMedia.this));
        gridview.setNumColumns(4);

        gridview.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                selectItem2(position);

            }
        } );
    }

//    public  void  Setlistview(){
//
//
//        String[] itemname ={" สุขภาพและอุบัติเหตุ" ,
//                "ประกันชีวิตออมทรัพย์" ,
//                "รถรายเดือนละ 500 " ,
//                "บ้านเริ่มต้น 80 ต่อปี ",
//                "ประกันการเดินทาง " ,};
//
//        Integer[] imgid1={
//                R.drawable.l1,
//                R.drawable.l2,
//                R.drawable.l3 ,
//                R.drawable.l4,
//                R.drawable.l5
//        };
//
//        Integer[] imgid2={
//                R.drawable.arrow,
//                R.drawable.arrow,
//                R.drawable.arrow,
//                R.drawable.arrow,
//                R.drawable.arrow
//        };
//
//
//
//
//
//        Adapter_Listview_ adapter =new Adapter_Listview_(Activity_Page_ProductMedia.this,
//                itemname, imgid1,imgid2);
//        list=(ListView)findViewById(R.id.list_video);
//        list.setAdapter(adapter);
//
//
//
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//
//                int itemPosition     = position;
//                switch (position){
//                    case  0:
//                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
//                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
//                        Intent myIntent = new Intent(getBaseContext(),Activity_Page_ProductMediaDetail.class);
//                        startActivity(myIntent);
//                        break;
//                    case  1:
//                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
//                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
//                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
//                        // activity.startActivity(myIntent);
//                        Intent myIntent2 = new Intent(getBaseContext(),Activity_Page_ProductMediaDetail.class);
//                        startActivity(myIntent2);
//
//                        break;
//                    case  2:
//                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
//                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
//                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
//                        // activity.startActivity(myIntent);
//                        Intent myIntent3 = new Intent(getBaseContext(),Activity_Page_ProductMediaDetail.class);
//                        startActivity(myIntent3);
//
//                        break;
//                    case  3:
//                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
//                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
//                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
//                        // activity.startActivity(myIntent);
//                        Intent myIntent4 = new Intent(getBaseContext(),Activity_Page_ProductMediaDetail.class);
//                        startActivity(myIntent4);
//
//                        break;
//                    case  4:
//                        //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
//                        //myIntent =new Intent(activity,Activity_Opportunity2.class);
//                        //Intent myIntent = new Intent(getBaseContext(),LoginActivity.class);
//                        // activity.startActivity(myIntent);
//                        Intent myIntent5 = new Intent(getBaseContext(),Activity_Page_ProductMediaDetail.class);
//                        startActivity(myIntent5);
//
//                        break;
//                    default:
//                        break;
//
//                }
//
//            }
//
//
//        });
//    }

//    public  void  SetYuotube(){
//
////        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
////        youTubeView.initialize( com.siamsmile.mobileagentsiamsmile.Config.YOUTUBE_API_KEY, this);
//
//    }

    public  void  SetDropDownList(){

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int width = metrics.widthPixels;


        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        Product_expandableListDetail = ProductMedia_ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(Product_expandableListDetail.keySet());
        expandableListAdapter = new ProductMedia_CustomExpandableListAdapter(this, expandableListTitle, Product_expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        //expandableListView.setDividerHeight(4);



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

                int itemPosition     = groupPosition;
                // int itemPosition_childPosition     = childPosition;

                switch (groupPosition) {
                    case 0:
                        Toast.makeText( Activity_Page_ProductMedia.this, "สือและผลิตภัณฑ์"+groupPosition, Toast.LENGTH_SHORT ).show();
                        //Intent myIntent = new Intent( getBaseContext(), Activity_Page_ProductMediaDetail.class );
                        //startActivity( myIntent );
                        break;
                    case 1:
                        Toast.makeText( Activity_Page_ProductMedia.this, "สือและผลิตภัณฑ์"+groupPosition, Toast.LENGTH_SHORT ).show();
                        //Intent myIntent2 = new Intent( getBaseContext(), Activity_Page_ProductMediaDetail.class );
                       // startActivity( myIntent2 );

                        break;
                    case  3:
                        Toast.makeText( Activity_Page_ProductMedia.this, "สือและผลิตภัณฑ์"+groupPosition, Toast.LENGTH_SHORT ).show();
                      //  Intent myIntent4 = new Intent(getBaseContext(),Activity_Page_ProductMediaDetail.class);
                      //  startActivity(myIntent4);

                        break;
                    case  4:
                        Toast.makeText( Activity_Page_ProductMedia.this, "สือและผลิตภัณฑ์"+groupPosition, Toast.LENGTH_SHORT ).show();
                        //Intent myIntent5 = new Intent(getBaseContext(),Activity_Page_ProductMediaDetail.class);
                       // startActivity(myIntent5);

                        break;
                    default:
                        break;
                }
                return false;
            }
        });


    }




//    // Youtube
//    @Override
//    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
//        if (!wasRestored) {
//            player.cueVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
//        }
//    }
//
//    @Override
//    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {
//        if (errorReason.isUserRecoverableError()) {
//            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
//        } else {
//            String error = String.format(getString(R.string.player_error), errorReason.toString());
//            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
//        }
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == RECOVERY_REQUEST) {
//            // Retry initialization if user performed a recovery action
//            getYouTubePlayerProvider().initialize(com.siamsmile.mobileagentsiamsmile.Config.YOUTUBE_API_KEY, this);
//        }
//    }
//
//    protected YouTubePlayerView getYouTubePlayerProvider() {
//        return youTubeView;
//    }
//
//   //Youtube..

}
