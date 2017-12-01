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
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Adapter.Adapter_Notification_1_FregmentTab_3_Spinner;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Activity_Page_Notification_Tab_FragmentTab_3 extends Fragment  implements View.OnClickListener {//implements View.OnClickListener
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    List<String>  appid;
    List<String>  Name;
    List<String>  Product;
    List<String>  expire_Date;
    List<String>  Alerttype;
    List<String>  Name2;
    List<String>  Image;
    HashMap<String, List<String>> expandableListDetail;
    View rootView;

    public Activity_Page_Notification_Tab_FragmentTab_3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      //  View rootView = inflater.inflate( R.layout.activity_page_notification_tab_fragmenttab_3, container, false );
        return init( inflater.inflate( R.layout.activity_page_notification_tab_fragmenttab_3, container, false ) );
    }

    private View init(final View inflate) {

        Button b = (Button) inflate.findViewById(R.id.bt_searchandfilter);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
                // dialog.setContentView(R.layout.activity_page_paymentreport_fragmenttab_1_popup);fragmenttab_1_popup.xml
                dialog.setContentView(R.layout.notification_tab_3_popup);
                dialog.setCancelable(true);

                final ArrayList<String> list_01=new ArrayList<String>();
                list_01.add("เลือกประเภทการแจ้งเตือน");
                list_01.add("แจ้งวันจัดเก็บ");
                list_01.add("แจ้งวันเกิด");
                list_01.add("แจ้งลูกค้าเข้าโรงพยาบาล");
                list_01.add("แจ้งสถานะกรมธรรม์");

                Button button1 = (Button)dialog.findViewById(R.id.bt_clickpage_2);
                Button button2 = (Button)dialog.findViewById(R.id.bt_clickpage_1);

                Spinner s = (Spinner) dialog.findViewById(R.id.Spinner_List_01);
                Adapter_Notification_1_FregmentTab_3_Spinner spiner = new Adapter_Notification_1_FregmentTab_3_Spinner(getActivity(),list_01);
                s.setAdapter(spiner);

                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
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

        expandableListView = (ExpandableListView) inflate.findViewById(R.id.expandableListView);
        Activity_Page_Notification_FragmentTab3_ExpandableListDataPump opject  = new Activity_Page_Notification_FragmentTab3_ExpandableListDataPump();
        expandableListDetail = Activity_Page_Notification_FragmentTab3_ExpandableListDataPump.getData();
        appid = opject.getAppid();
        Name = opject.getName();
        Product = opject.getProduct();
        expire_Date = opject.getexpire_Date();
        Alerttype =opject.getAlerttype();
        Name2 =opject.getName2();
        Image =opject.getImage();

        expandableListAdapter = new Activity_Page_Notification_Fragmenttab3_CustomExpandableListAdapter(getActivity(),appid,Name,Product,expire_Date,Alerttype,Name2,Image, expandableListDetail);
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

    @Override
    public void onClick(View view) {
        // Click
    }



    }


























