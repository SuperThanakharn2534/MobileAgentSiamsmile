package com.siamsmile.mobileagentsiamsmile;

import android.app.Dialog;
import android.os.Bundle;
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

import Adapter.Adapter_PaymentCustomer_FregmentTab_1_Spinner;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class FragmentTab_1 extends android.support.v4.app.Fragment  {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    List<String> expire_date;
    List<String> Product;
    List<String> Name;
    List<String> appid;
    HashMap<String, List<String>> expandableListDetail;
    View rootView;

    public FragmentTab_1() {
        // Required empty public constructor
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate( R.layout.fragmenttab_1, container, false );
//
//        //TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//        //textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
//        return rootView;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return init(inflater.inflate(R.layout.fragmenttab_1, container, false));
    }



    private View init(final View inflate) {

        Button b = (Button) inflate.findViewById(R.id.bt_searchandfilter);
        //  b.setOnClickListener(this);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
               // dialog.setContentView(R.layout.activity_page_paymentreport_fragmenttab_1_popup);fragmenttab_1_popup.xml
                dialog.setContentView(R.layout.fragmenttab_1_popup);
                dialog.setCancelable(true);

                final ArrayList<String> list_01=new ArrayList<String>();
                list_01.add("เลือกประกัน");
                for (int i=0;i<=10;i++){
                    list_01.add("ประกันที่ "+i);
                }


                Button button1 = (Button)dialog.findViewById(R.id.bt_clickpage_2);
                Button button2 = (Button)dialog.findViewById(R.id.bt_clickpage_1);

                Spinner s = (Spinner) dialog.findViewById(R.id.Spinner_List_01);
                Adapter_PaymentCustomer_FregmentTab_1_Spinner spiner = new Adapter_PaymentCustomer_FregmentTab_1_Spinner(getActivity(),list_01);
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

        expandableListView = (ExpandableListView) inflate.findViewById( R.id.expandableListView );
        PaymentCustomerTab1_ExpandableListDataPump opject = new PaymentCustomerTab1_ExpandableListDataPump();
        expandableListDetail = PaymentCustomerTab1_ExpandableListDataPump.getData();
        appid = opject.getAppid();
        Name = opject.getName();
        Product = opject.getProduct();
        expire_date = opject.getexpire_date();
        expandableListAdapter = new PaymentCustomerTab1_CustomExpandableListAdapter( getActivity(),appid,Name,Product,expire_date, expandableListDetail );
        expandableListView.setAdapter( expandableListAdapter );



         // List Group

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






