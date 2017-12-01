package com.siamsmile.mobileagentsiamsmile;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Adapter.Adapter_PaymentReport_FregmentTab_2_Spinner;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Activity_Page_PaymentReport_FragmentTab_2 extends Fragment  {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    List<String> Product;
    List<String> Name;
    List<String> appid;
    HashMap<String, List<String>> expandableListDetail;
    View rootView;


    public Activity_Page_PaymentReport_FragmentTab_2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return init( inflater.inflate( R.layout.activity_page_paymentreport_fragmenttab_2, container, false ) );
    }

    private View init(final View inflate) {

        Button b = (Button) inflate.findViewById( R.id.bt_searchandfilter );
       // b.setOnClickListener( this );
               b.setOnClickListener( new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       final Dialog dialog = new Dialog(getActivity());
                       dialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
                       dialog.setContentView(R.layout.activity_page_paymentreport_fragmenttab_2_popup);
                       dialog.setCancelable(true);


                       final ArrayList<String> list_01=new ArrayList<String>();
                       list_01.add("เลือกหน่วยงาน");
                       for (int i=0;i<=10;i++){
                           list_01.add("หน่วยงานที่ "+i);
                       }

                       final ArrayList<String> list_02=new ArrayList<String>();
                       list_02.add("เลือกอำเภอ");
                       for (int i=0;i<=10;i++){
                           list_02.add("อำเภอที่ "+i);
                       }

                       final ArrayList<String> list_03=new ArrayList<String>();
                       list_03.add("เลือกตำบล");
                       for (int i=0;i<=10;i++){
                           list_03.add("ตำบลที่ "+i);
                       }

//                       final CheckBox checkBox1 = (CheckBox)dialog.findViewById( R.id.ch_2_1 );
//                       final CheckBox checkBox2 = (CheckBox)dialog.findViewById( R.id.ch_2_2 );
//                       final CheckBox checkBox3 = (CheckBox)dialog.findViewById( R.id.ch_2_3 );
                       Button button1 = (Button)dialog.findViewById(R.id.bt_clickpage_2);
                       Button button2 = (Button)dialog.findViewById(R.id.bt_clickpage_1);
                       ImageButton img =(ImageButton)dialog.findViewById( R.id.image_Click );

                       Spinner s = (Spinner) dialog.findViewById(R.id.Spinner_List_01);
                       Adapter_PaymentReport_FregmentTab_2_Spinner spiner = new  Adapter_PaymentReport_FregmentTab_2_Spinner(getActivity(),list_01);
                       s.setAdapter(spiner);

                       Spinner s2 = (Spinner) dialog.findViewById(R.id.Spinner_List_02);
                       Adapter_PaymentReport_FregmentTab_2_Spinner spiner2 = new  Adapter_PaymentReport_FregmentTab_2_Spinner(getActivity(),list_02);
                       s2.setAdapter(spiner2);

                       Spinner s3 = (Spinner) dialog.findViewById(R.id.Spinner_List_03);
                       Adapter_PaymentReport_FregmentTab_2_Spinner spiner3 = new  Adapter_PaymentReport_FregmentTab_2_Spinner(getActivity(),list_03);
                       s3.setAdapter(spiner);



                       button1.setOnClickListener(new View.OnClickListener() {
                           public void onClick(View v) {
//                               if(checkBox1.isChecked()){
//                                   Toast.makeText(getActivity(), "กรองตาม อำเภอ ", Toast.LENGTH_SHORT);
//                                   dialog.cancel();
//                               }
//                               else if (checkBox2.isChecked()){
//                                   Toast.makeText(getActivity(), "กรองตาม ตำบล ", Toast.LENGTH_SHORT);
//                                   dialog.cancel();
//                               }
//                               else if (checkBox3.isChecked()){
//                                   Toast.makeText(getActivity(), "กรองตาม หน่วยงาน ", Toast.LENGTH_SHORT);
//                                   dialog.cancel();
//                               }
//                               else {
//                                   dialog.cancel();
//                               }
                               Toast.makeText(getActivity(),"Click Cancel",Toast.LENGTH_SHORT).show();
                               dialog.cancel();
                           }
                       });

                       button2.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               Toast.makeText(getActivity(),"Click Cancel",Toast.LENGTH_SHORT).show();
                               dialog.cancel();
                           }
                       });

                       dialog.show();
                   }
               } );


        expandableListView = (ExpandableListView) inflate.findViewById( R.id.expandableListView );
        Activity_Page_PaymentReport_FragmentTab2_ExpandableListDataPump opject = new Activity_Page_PaymentReport_FragmentTab2_ExpandableListDataPump();
        expandableListDetail = Activity_Page_PaymentReport_FragmentTab2_ExpandableListDataPump.getData();
        appid = opject.getAppid();
        Name = opject.getName();
        Product = opject.getProduct();
        expandableListAdapter = new Activity_Page_PaymentReport_FragmentTab2_CustomExpandableListAdapter(getActivity(),appid,Name,Product, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);


        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getActivity(),
                        appid.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getActivity(),
                        appid.get(groupPosition) + " List Collapsed.",
                        Toast.LENGTH_SHORT).show();

            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getActivity(),
                        appid.get(groupPosition)
                                + " -> "
                                + expandableListDetail.get(
                                appid.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT
                ).show();

                return false;
            }
        });


        return inflate;
    }
    private LayoutInflater getLayoutInflater() {
        return null;
    }


}
































