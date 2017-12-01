package com.siamsmile.mobileagentsiamsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class PaySearch_1_FragmentTab_2_TabFragment_1_PopUp extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        setContentView( R.layout.paysearch_1_fragmenttab_2_tabfragment_1_popup );

        SetPage_PopUp();
        SetButton();
        SetDropDownList();


    }

    public void SetPage_PopUp() {

        //PopUp Page
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics( dm );
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout( (int) (width * .9), (int) (height * .8) );

    }

    public void SetButton() {

        Button button = (Button) findViewById( R.id.bt_clickpage_1 );


        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getBaseContext(), PaySearch_1_FragmentTab_2.class ) );

            }
        } );

    }

    public void SetDropDownList() {

        expandableListView = (ExpandableListView) findViewById( R.id.expandableListView );
        expandableListDetail = PaySearch_1_FragmentTab_2_TabFragment_1_PopUp_ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>( expandableListDetail.keySet() );
        expandableListAdapter = new PaySearch_1_FragmentTab_2_TabFragment_1_PopUp_CustomerExpandableListAdapter( this, expandableListTitle, expandableListDetail );
        expandableListView.setAdapter( expandableListAdapter );
        //expandableListView.setDividerHeight(2);
        expandableListView.setOnGroupExpandListener( new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText( getApplicationContext(),
                        expandableListTitle.get( groupPosition ) + " List Expanded.",
                        Toast.LENGTH_SHORT ).show();
            }
        } );
        expandableListView.setOnGroupCollapseListener( new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText( getApplicationContext(),
                        expandableListTitle.get( groupPosition ) + " List Collapsed.",
                        Toast.LENGTH_SHORT ).show();

            }
        } );

        expandableListView.setOnChildClickListener( new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        expandableListTitle.get(groupPosition)
                                + " -> "
                                + expandableListDetail.get(
                                expandableListTitle.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT
                ).show();

                int itemPosition = groupPosition;
                // int itemPosition_childPosition     = childPosition;

//                switch (groupPosition) {
//                    case 0:
//                        Intent myIntent = new Intent( getBaseContext(), Tab.class );
//                        startActivity( myIntent );
//                        break;
//                    case 1:
//                        Intent myIntent2 = new Intent( getBaseContext(), Tab.class );
//                        startActivity( myIntent2 );
//
//                        break;
//                    case 3:
//                        Intent myIntent4 = new Intent( getBaseContext(), Tab.class );
//                        startActivity( myIntent4 );
//
//                        break;
//                    case 4:
//                        Intent myIntent5 = new Intent( getBaseContext(), Tab.class );
//                        startActivity( myIntent5 );
//
//                        break;
//                    default:
//                        break;
//                }
                return false;
            }
        } );


    }

}
























